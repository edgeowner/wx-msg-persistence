package com.atmatrix.wechat.application.impl;

import com.atmatrix.wechat.application.WechatMessageApplication;
import com.atmatrix.wechat.mgt.WechatMemberMgt;
import com.atmatrix.wechat.mgt.WechatMessageMgt;
import com.atmatrix.wechat.middleware.kafka.beans.WechatTextDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Slf4j
@Service
public class WechatMessageApplicationImpl implements WechatMessageApplication {


    @Autowired
    private WechatMessageMgt wechatMessageMgt;

    @Autowired
    private WechatMemberMgt wechatMemberMgt;

    @Override
    public Long saveWechatMessageMQ(WechatTextDto wechatTextDto) {
        Long result = 0l;
        if (wechatTextDto == null) {
            return result;
        }
        wechatMessageMgt.insertWechatMessage(wechatTextDto);
        return result;
    }
}
