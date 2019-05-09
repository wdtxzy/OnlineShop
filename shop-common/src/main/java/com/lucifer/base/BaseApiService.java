package com.lucifer.base;

/**
 * @Author : wangdi
 * @Date : creat in 2019/5/9 23:53
 */
public class BaseApiService {

    public ResponseBase setResult(Integer code, String message, Object data){
        return new ResponseBase(code,message,data);
    }

    public ResponseBase setResultSuccess(){
        return null;
    }
}
