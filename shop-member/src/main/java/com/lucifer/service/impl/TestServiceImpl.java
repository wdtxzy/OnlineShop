package com.lucifer.service.impl;

import com.lucifer.api.service.TestService;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author : wangdi
 * @Date : creat in 2019/5/9 22:53
 */
public class TestServiceImpl implements TestService {

    @Override
    public Map<String,String> test(Integer id, String name){
        return new HashMap<>();
    }
}
