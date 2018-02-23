package com.leo.testpro.redis;

import org.apache.commons.lang.StringUtils;

import redis.clients.jedis.JedisPubSub;

/**
 * redis���Ľ����¼��ص�
����������ģʽ���ܵ���Ϣʱ�Ļص� (onPMessage)
����������Ƶ�����ܵ���Ϣʱ�Ļص� (onMessage )
����Ƶ��ʱ�Ļص�( onSubscribe )
ȡ������Ƶ��ʱ�Ļص�( onUnsubscribe )
����Ƶ��ģʽʱ�Ļص� ( onPSubscribe )
ȡ������ģʽʱ�Ļص�( onPUnsubscribe )
 * @author leo
 *
 */
public class RedisSubcriber extends JedisPubSub {

	@Override
	public void onMessage(String channel, String message) {
		if(!StringUtils.isEmpty(channel)){
			System.out.println(message+"555555555");
		}
	}

	@Override
	public void onPMessage(String pattern, String channel, String message) {
		System.out.println(pattern + "," + channel + "," + message);
	}

	@Override
	public void onSubscribe(String channel, int subscribedChannels) {
		System.out.println("onSubscribe: channel[" + channel + "]," + "subscribedChannels[" + subscribedChannels + "]");
	}

	@Override
	public void onUnsubscribe(String channel, int subscribedChannels) {
		System.out.println(
                "onUnsubscribe: channel[" + channel + "], " + "subscribedChannels[" + subscribedChannels + "]");
	}

	@Override
	public void onPUnsubscribe(String pattern, int subscribedChannels) {
		System.out.println("onPUnsubscribe: pattern[" + pattern + "]," +
                "subscribedChannels[" + subscribedChannels + "]");
	}

	@Override
	public void onPSubscribe(String pattern, int subscribedChannels) {
		System.out.println("onPSubscribe: pattern[" + pattern + "], " +
                "subscribedChannels[" + subscribedChannels + "]");
	}
	
}
