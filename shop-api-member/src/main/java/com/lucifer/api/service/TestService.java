package com.lucifer.api.service;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * @Author : wangdi
 * @Date : creat in 2019/5/9 22:45
 */
@RequestMapping("/member")
public interface TestService {

    @RequestMapping("/test")
    public Map<String,String> test(Integer id, String name);
}
