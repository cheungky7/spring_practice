package com.task.managment.ui_web;

import org.springframework.beans.factory.annotation.Autowired;
import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
//import org.junit.Test;
import org.junit.runner.RunWith;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


//@RunWith(SpringRunner.class)
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest
public class RedisTest {
	
		Logger logger = LogManager.getLogger(RedisTest.class);
	
	 	@Autowired
	    private StringRedisTemplate stringRedisTemplate;
	    
		@Autowired
	    private RedisTemplate redisTemplate;

	    @Test
	    public void test() throws Exception {
	    	logger.info("TestRedis");
	        stringRedisTemplate.opsForValue().set("test1", "12345");
	        String valueback=stringRedisTemplate.opsForValue().get("test1");
	        logger.info("Value read back from:"+valueback);
	        
	        Assert.assertEquals("12345", valueback);
	    }

}
