package com.atmatrix.wechat.mgt;

import com.atmatrix.wechat.middleware.kafka.beans.WechatTextDto;

public interface WechatMessageMgt {


    Long insertWechatMessage(WechatTextDto wechatTextDto);

}
