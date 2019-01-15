package com.atmatrix.wechat.middleware.kafka.beans;

import lombok.Data;

import java.io.Serializable;

@Data
public class WechatTextDto implements Serializable {

    private static final long serialVersionUID = -7509621697302791764L;
    /**
     * wechat_text = {
     * 'sid': sender_id,
     * 'nm': sender_name,
     * 'head': head_file_name,
     * 'sex': member.sex,
     * 'prov': member.province,
     * 'city': member.city,
     * 'sig': member.signature,
     * 'pno': phones,
     * 'gn': group_name,
     * 'tp': msg_type,
     * 'text': msg.text,
     * 'img': sender_picture_url,
     * 'st': send_timestamp,
     * 'ts': msg_create_timestamp,
     * 'src': '1',
     * 'tags': ''     }
     */

    private String fwid;    // (新增2019-01-14) 消息爬虫微信id

    private String sid;  // 发送者唯一标识（必要字段）
    private String nm;  // 发送者名字 （必要字段）
    private String head; // 发送者头像 （必要字段）
    private String sex; // 发送者性别："0":未知 "1":男 "2":女 （必要字段）

    private String prov; // 发送者所在省份（可空）
    private String city; // 发送者所在城市（可空）
    private String sig;  // 发送者个人签名（可空）
    private String pno;  // 发送者手机号（可空 以英文逗号分隔 eg.: "1232312333,13123267338"）

    private String gn; // 消息群成员所在群昵称（必要字段）
    private String gid;   // 群id (必要字段)

    private String id; // 消息id

    private String tp; // 消息类型 "1": Text "3": Picture（必要字段
    private String text; // 消息文本内容 （）
    private String img; // 消息图片文件名（）
    private String st;  // 消息发送时间戳（必要字段）
    private String ts; // 获取消息时间
    private String src;
    private String tags;
}

