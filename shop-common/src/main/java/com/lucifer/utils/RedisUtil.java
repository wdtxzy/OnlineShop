package com.lucifer.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.concurrent.TimeUnit;

/**
 * @Author : wangdi
 * @Date : creat in 2019/4/29 23:57
 * Redis的工具类
 */
public class RedisUtil {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    public void setString(String key, Object data, Long  timeout){
        if(data instanceof String){
            String value = (String)data;
            stringRedisTemplate.opsForValue().set(key,value);
        }
        if(timeout!=null){
            stringRedisTemplate.expire(key,timeout, TimeUnit.SECONDS);
        }
    }


}
