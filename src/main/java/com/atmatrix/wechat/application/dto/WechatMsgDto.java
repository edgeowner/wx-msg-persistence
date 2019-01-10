package com.atmatrix.wechat.application.dto;

import lombok.Data;

@Data
public class WechatMsgDto {

    private String swxid; //接收消息的微信号
    private Integer resource;

}
