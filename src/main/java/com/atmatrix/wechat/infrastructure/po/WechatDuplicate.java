package com.atmatrix.wechat.infrastructure.po;

import lombok.Data;

import java.util.Date;

@Data
public class WechatDuplicate {
    private Long id;

    private Long messageId;

    private Integer messageType;

    private String messageUrl;

    private String groupOwnerWxid;

    private Boolean isDelete;

    private Date createTime;

    private Date updateTime;

    private String messageText;

}