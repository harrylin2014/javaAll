package org.example;

import lombok.Data;

import java.io.Serializable;

/**
 * @Description: 发送微信客服消息
 * @author jshq
 * @date 2018/7/3 16:03
 * @return
 */
@Data
public class CustomerMessage implements Serializable {
    private String order_id;
    private String order_type;
    private String user_phone;
    private String order_status;
    private String open_id;
}
