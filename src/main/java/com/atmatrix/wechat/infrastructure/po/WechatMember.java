package com.atmatrix.wechat.infrastructure.po;

import lombok.Data;

import java.util.Date;

@Data
public class WechatMember {
    private Long id;

    private String memberWxid;

    private String memberNickname;

    private String memberAvatar;

    private Integer memberSex;

    private String memberProvince;

    private String memberCity;

    private String memeberSignature;

    private String memeberPhones;

    private String groupId;

    private String groupNickname;

    private Boolean isOwner;

    private Boolean isDelete;

    private Date createTime;

    private Date updateTime;


}