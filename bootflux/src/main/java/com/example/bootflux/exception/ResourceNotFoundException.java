package com.example.bootflux.exception;

/**
 * @author lxl
 * @date 2020/9/15 12:54
 */
public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException (){
        super();
    }

    public ResourceNotFoundException (String message){
        super(message);
    }

}
