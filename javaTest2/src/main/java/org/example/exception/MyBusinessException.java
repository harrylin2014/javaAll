package org.example.exception;

/**
 * @author lxl
 * @date 2021/1/20 17:55
 */
public class MyBusinessException extends RuntimeException {



    public MyBusinessException(String msg,Throwable cause){
         super(msg,cause);
    }

}
