package com.leo.testpro.redis;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.leo.testpro.junitbase.JunitBase;

import redis.clients.jedis.Jedis;

/**
 * redis测试
 * @author leo
 *
 */
public class JedisTest extends JunitBase {
	@Autowired
	private RedisClientTemplate redisClient;

	@Test
	/**
	 * 测试有序集合排名 （应该用的少）
	 */
	public void sortSetTest() {
		HashMap<String, Double> map = new HashMap<String, Double>();
		map.put("张三", 5d);
		map.put("李四", 3d);
		map.put("王五", 2d);
		map.put("赵六", 1d);
		redisClient.zadd("zadd", map);

		System.out.println("zadd里所有元素：" + redisClient.zrange("zadd", 0, -1));
		System.out.println("张三的分值：" + redisClient.zscore("zadd", "张三"));
		System.out.println("张三的排名：" + redisClient.zrank("zadd", "张三"));
	}

	@Test
	/**
	 * 测试添加哈希 散列
	 */
	public void hashTest() {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("张三", "zhangsan");
		map.put("李四", "lisi");
		map.put("王五", "wangtyu");
		map.put("赵六", "zhaoliu");
		redisClient.hmset("hash", map);
		
		redisClient.hset("hash", "田七", "tianqi");
		
		System.out.println(redisClient.hgetAll("hash"));
		System.out.println(redisClient.hkeys("hash"));
		System.out.println(redisClient.hvals("hash"));
	}
	
//	序号	命令及描述
//	1	PSUBSCRIBE pattern [pattern ...] 
//	订阅一个或多个符合给定模式的频道。
//	2	PUBSUB subcommand [argument [argument ...]] 
//	查看订阅与发布系统状态。
//	3	PUBLISH channel message 
//	将信息发送到指定的频道。
//	4	PUNSUBSCRIBE [pattern [pattern ...]] 
//	退订所有给定模式的频道。
//	5	SUBSCRIBE channel [channel ...] 
//	订阅给定的一个或多个频道的信息。
//	6	UNSUBSCRIBE [channel [channel ...]] 
//	指退订给定的频道。
	@Test
	/**
	 * 测试redis订阅接受消息
	 */
	public void subcriberTest(){
		Jedis jedis = null;
		try {
			RedisSubcriber rs = new RedisSubcriber();
			jedis = new Jedis("127.0.0.1", 6379, 0);
			rs.proceed(jedis.getClient(), new String[]{"talk"});
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			jedis.close();
		}
	}
}
