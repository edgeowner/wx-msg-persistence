package com.atmatrix.wechat.middleware;

import lombok.Data;

/**
 * Copyright (C), 上海维跃信息科技有限公司
 * FileName: FollowerExternalUserScDto
 * Author:   zhanglong
 * Date:     2020/5/6 13:21
 * Description:
 */
@Data
public class FollowerExternalUserScDto {
    private String appCode;
    private String followerId;
    private String userName;
    private String szStatus;
    private String recipient;
    private String activityName;
    private String externalUserId;

}
