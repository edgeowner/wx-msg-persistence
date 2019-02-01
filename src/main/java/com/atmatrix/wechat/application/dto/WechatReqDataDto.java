package com.atmatrix.wechat.application.dto;

import lombok.Data;

import java.util.List;

/**
 * @ProjectName: wx-msg-entrance
 * @ClassName: WechatReqData
 * @Description: TODO
 * @Author: edgeowner
 * @Create: 2019-01-30 3:30 PM
 **/

@Data
public class WechatReqDataDto {
    private String type;
    private SpiderDto sd;
    private List<GroupDto> gp;
}
