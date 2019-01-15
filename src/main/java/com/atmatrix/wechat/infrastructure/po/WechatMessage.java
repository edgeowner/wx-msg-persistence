package com.atmatrix.wechat.infrastructure.po;

import lombok.Data;

import java.util.Date;

@Data
public class WechatMessage {
    private Long id;

    private String msgId;

    private Integer msgType;

    private String msgUrl;

    private String memberWxid;

    private String memberPhones;

    private String memberNickname;

    private String groupId;

    private String groupNickname;

    private Boolean isDelete;

    private Boolean isDistinct;

    private Date kafkaTime;

    private Date sendTime;

    private Date createTime;

    private Date updateTime;

    private String msgText;

}