package org.example;

import lombok.Data;

import java.io.Serializable;

/**
 * @author lxl
 * @date 2020/9/29 10:29
 */
@Data
public class ResultDataForHcc implements Serializable {

    private boolean success;

    private Object data;

    private String error;

}
