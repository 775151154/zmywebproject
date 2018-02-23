package com.leo.testpro.redis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import redis.clients.jedis.ShardedJedis;
import redis.clients.jedis.ShardedJedisPool;

/**
 * redis ����Դ
 * @author leo
 *
 */
@Repository("redisDataSource")
public class RedisDataSourceImpl implements RedisDataSource{
	private Logger logger = LoggerFactory.getLogger(RedisDataSourceImpl.class);
	@Autowired
	private ShardedJedisPool shardedJedisPool;

	/**
	 * ȡ��redis�Ŀͻ��ˣ�����ִ�������ˡ�
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
	 * ����Դ������pool
	 */
	public void returnResource(ShardedJedis shardedJedis) {
		shardedJedisPool.returnResource(shardedJedis);
	}

	/**
	 * �����쳣�󣬽���Դ������pool ����ʵ����Ҫ�ڶ���������
	 */
	public void returnResource(ShardedJedis shardedJedis, boolean broken) {
		if (broken) {
            shardedJedisPool.returnBrokenResource(shardedJedis);
        } else {
            shardedJedisPool.returnResource(shardedJedis);
        }
	}

}
