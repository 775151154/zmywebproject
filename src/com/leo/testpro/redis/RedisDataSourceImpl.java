package com.leo.testpro.redis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import redis.clients.jedis.ShardedJedis;
import redis.clients.jedis.ShardedJedisPool;

/**
 * redis 数据源
 * @author leo
 *
 */
@Repository("redisDataSource")
public class RedisDataSourceImpl implements RedisDataSource{
	private Logger logger = LoggerFactory.getLogger(RedisDataSourceImpl.class);
	@Autowired
	private ShardedJedisPool shardedJedisPool;

	/**
	 * 取得redis的客户端，可以执行命令了。
	 */
	public ShardedJedis getRedisClient() {
		try{
			ShardedJedis shardedJedis = shardedJedisPool.getResource();
			return shardedJedis;
		}catch(Exception e){
			logger.error("get redis client error!", e);
		}
		return null;
	}

	/**
	 * 将资源返还给pool
	 */
	public void returnResource(ShardedJedis shardedJedis) {
		shardedJedisPool.returnResource(shardedJedis);
	}

	/**
	 * 出现异常后，将资源返还给pool （其实不需要第二个方法）
	 */
	public void returnResource(ShardedJedis shardedJedis, boolean broken) {
		if (broken) {
            shardedJedisPool.returnBrokenResource(shardedJedis);
        } else {
            shardedJedisPool.returnResource(shardedJedis);
        }
	}

}
