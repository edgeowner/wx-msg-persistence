package com.atmatrix.wechat.infrastructure.po;

import lombok.Data;

import java.util.Date;

@Data
public class WechatGroup {
    private Long id;

    private String groupId;

    private String groupNickname;

    private Integer groupCount;

    private String groupOwnerWxid;

    private Boolean isDelete;

    private String spiderWxid;

    private Date createTime;

    private Date updateTime;


}