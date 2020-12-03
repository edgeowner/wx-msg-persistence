package com.atmatrix.wechat.middleware;

import lombok.Data;
import org.springframework.security.core.parameters.P;

/**
 * Copyright (C), 上海维跃信息科技有限公司
 * FileName: WxReportDtp
 * Author:   zhanglong
 * Date:     2020/5/6 13:11
 * Description:
 */
@Data
public class WxReportDto {
    private String wxId;
    private String userName;
    private String externalUserId;
    private String recipient;
    private String recipientId;
    private String appCode;
}
