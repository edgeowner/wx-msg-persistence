package com.atmatrix.wechat.application;

import com.atmatrix.wechat.application.dto.WechatReqDataDto;

/**
 * @ProjectName: wx-msg-entrance
 * @ClassName: WechatCommonApplication
 * @Description: TODO
 * @Author: edgeowner
 * @Create: 2019-01-30 3:40 PM
 **/

public interface WechatCommonApplication {

    void batchSaveGroupMemberData(WechatReqDataDto wechatReqDataDto);
}
