package com.leo.testpro.redis;

import org.apache.commons.lang.StringUtils;

import redis.clients.jedis.JedisPubSub;

/**
 * redis订阅接收事件回调
监听到订阅模式接受到消息时的回调 (onPMessage)
监听到订阅频道接受到消息时的回调 (onMessage )
订阅频道时的回调( onSubscribe )
取消订阅频道时的回调( onUnsubscribe )
订阅频道模式时的回调 ( onPSubscribe )
取消订阅模式时的回调( onPUnsubscribe )
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
