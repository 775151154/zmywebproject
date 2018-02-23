package com.leo.mypro.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leo.mypro.service.impl.LoginServiceImpl;
import com.leo.testpro.redis.RedisClientTemplate;
/**
 * 
 * @author leo
 *
 */
@Service
public class LoginService implements LoginServiceImpl{
	
	private static Logger logger = LoggerFactory.getLogger(LoginService.class);
	@Autowired
	private RedisClientTemplate redisClient;
	
	@Override
	public void doLoginTest(){
		System.out.println("»»≤ø ");
		redisClient.set("leo", "≤‚ ‘");
		logger.info("redis≤‚ ‘£∫ " + redisClient.get("leo"));
		logger.info("enter login Service!");
	}
}
