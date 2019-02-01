package com.atmatrix.wechat.application.dto;

import lombok.Data;

import java.util.List;

/**
 * @ProjectName: wx-msg-entrance
 * @ClassName: GroupDto
 * @Description: TODO
 * @Author: edgeowner
 * @Create: 2019-01-30 3:25 PM
 **/

@Data
public class GroupDto {
    private String id;
    private String nn;

    private Integer countNum;
    private List<MemberDto> mm;
}
