package com.atmatrix.wechat.application;

import com.atmatrix.wechat.middleware.kafka.beans.WechatTextDto;

public interface WechatMessageApplication {

    Long saveWechatMessageMQ(WechatTextDto wechatTextDto);
}
