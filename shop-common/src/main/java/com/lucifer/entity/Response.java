package com.lucifer.entity;

import lombok.Data;

/**
 * @Author : wangdi
 * @Date : creat in 2019/4/30 00:01
 */
@Data
public class Response {

    private Integer code;

    private String msg;

    private Object data;
}
