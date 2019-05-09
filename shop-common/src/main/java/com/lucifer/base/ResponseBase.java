package com.lucifer.base;

import lombok.Data;

/**
 * @Author : wangdi
 * @Date : creat in 2019/5/9 23:51
 */
@Data
public class ResponseBase {

    private Integer code;

    private String message;

    private Object data;

    public ResponseBase(Integer code, String message, Object data){
        super();
        this.code = code;
        this.message = message;
        this.data = data;
    }

}
