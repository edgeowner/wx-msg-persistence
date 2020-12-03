package com.atmatrix.wechat.middleware.result;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Copyright (C), 上海维跃信息科技有限公司
 * FileName: ExternalUserDetailRespDto
 * Author:   zhanglong
 * Date:     2020/5/6 14:41
 * Description:
 */
@Data
public class ExternalUserDetailRespDto {
    private int errcode;
    private String errmsg;
    private UserDetail external_contact;
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public class UserDetail {
        private String external_userid;
        private String name;
        private Integer type;
        private Integer gender;
        private String avatar;
        private String unionid;
        private String position;
        private String corp_name;
        private String corp_full_name;
        private String external_profile;
    }
}
