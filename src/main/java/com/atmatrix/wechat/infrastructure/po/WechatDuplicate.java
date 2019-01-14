package com.atmatrix.wechat.infrastructure.po;

import java.util.Date;

public class WechatDuplicate {
    private Long id;

    private String msgId;

    private Long msgKey;

    private Integer msgType;

    private String msgUrl;

    private Boolean isDelete;

    private Date createTime;

    private Date updateTime;

    private String msgText;

    public WechatDuplicate(Long id, String msgId, Long msgKey, Integer msgType, String msgUrl, Boolean isDelete, Date createTime, Date updateTime) {
        this.id = id;
        this.msgId = msgId;
        this.msgKey = msgKey;
        this.msgType = msgType;
        this.msgUrl = msgUrl;
        this.isDelete = isDelete;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public WechatDuplicate(Long id, String msgId, Long msgKey, Integer msgType, String msgUrl, Boolean isDelete, Date createTime, Date updateTime, String msgText) {
        this.id = id;
        this.msgId = msgId;
        this.msgKey = msgKey;
        this.msgType = msgType;
        this.msgUrl = msgUrl;
        this.isDelete = isDelete;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.msgText = msgText;
    }

    public Long getId() {
        return id;
    }

    public String getMsgId() {
        return msgId;
    }

    public Long getMsgKey() {
        return msgKey;
    }

    public Integer getMsgType() {
        return msgType;
    }

    public String getMsgUrl() {
        return msgUrl;
    }

    public Boolean getIsDelete() {
        return isDelete;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public String getMsgText() {
        return msgText;
    }
}