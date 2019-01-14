package com.atmatrix.wechat.mgt.impl;

import com.atmatrix.wechat.BaseTest;
import com.atmatrix.wechat.mgt.WechatMessageMgt;
import com.atmatrix.wechat.middleware.kafka.beans.WechatTextDto;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class WechatMessageMgtImplTest extends BaseTest {


    @Autowired
    private WechatMessageMgt wechatMessageMgt;

    @Test
    public void insertWechatMessage() {
        WechatTextDto wechatTextDto = new WechatTextDto();
//        private String sid;  // 发送者唯一标识（必要字段）
//        private String nm;  // 发送者名字 （必要字段）
//        private String head; // 发送者头像 （必要字段）
//        private String sex; // 发送者性别：
        wechatTextDto.setId("setId");
        wechatTextDto.setNm("setHead");
        wechatTextDto.setHead("setHead");
        wechatTextDto.setSex("1");

        wechatTextDto.setProv("setProv");
        wechatTextDto.setCity("setCity");
        wechatTextDto.setSig("setSig");
        wechatTextDto.setPno("setPno");

        wechatTextDto.setGn("setGn");
        wechatTextDto.setGid("setGid");

        wechatTextDto.setTp("4");
        wechatTextDto.setText("setText");
        wechatTextDto.setImg("setImg");
        wechatTextDto.setSt("1547198725000");
        wechatTextDto.setTs("1547198725000");
        wechatTextDto.setSrc("1");

        Long aLong = wechatMessageMgt.insertWechatMessage(wechatTextDto);
        System.out.println(aLong);
    }
}