package com.leo.testpro.redis;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.leo.testpro.junitbase.JunitBase;

import redis.clients.jedis.Jedis;

/**
 * redis����
 * @author leo
 *
 */
public class JedisTest extends JunitBase {
	@Autowired
	private RedisClientTemplate redisClient;

	@Test
	/**
	 * �������򼯺����� ��Ӧ���õ��٣�
	 */
	public void sortSetTest() {
		HashMap<String, Double> map = new HashMap<String, Double>();
		map.put("����", 5d);
		map.put("����", 3d);
		map.put("����", 2d);
		map.put("����", 1d);
		redisClient.zadd("zadd", map);

		System.out.println("zadd������Ԫ�أ�" + redisClient.zrange("zadd", 0, -1));
		System.out.println("�����ķ�ֵ��" + redisClient.zscore("zadd", "����"));
		System.out.println("������������" + redisClient.zrank("zadd", "����"));
	}

	@Test
	/**
	 * ������ӹ�ϣ ɢ��
	 */
	public void hashTest() {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("����", "zhangsan");
		map.put("����", "lisi");
		map.put("����", "wangtyu");
		map.put("����", "zhaoliu");
		redisClient.hmset("hash", map);
		
		redisClient.hset("hash", "����", "tianqi");
		
		System.out.println(redisClient.hgetAll("hash"));
		System.out.println(redisClient.hkeys("hash"));
		System.out.println(redisClient.hvals("hash"));
	}
	
//	���	�������
//	1	PSUBSCRIBE pattern [pattern ...] 
//	����һ���������ϸ���ģʽ��Ƶ����
//	2	PUBSUB subcommand [argument [argument ...]] 
//	�鿴�����뷢��ϵͳ״̬��
//	3	PUBLISH channel message 
//	����Ϣ���͵�ָ����Ƶ����
//	4	PUNSUBSCRIBE [pattern [pattern ...]] 
//	�˶����и���ģʽ��Ƶ����
//	5	SUBSCRIBE channel [channel ...] 
//	���ĸ�����һ������Ƶ������Ϣ��
//	6	UNSUBSCRIBE [channel [channel ...]] 
//	ָ�˶�������Ƶ����
	@Test
	/**
	 * ����redis���Ľ�����Ϣ
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
