package com.atmatrix.wechat.mgt;

import com.atmatrix.wechat.application.dto.GroupDto;
import com.atmatrix.wechat.infrastructure.po.WechatGroup;

import java.util.List;

/**
 * @ProjectName: wx-msg-entrance
 * @ClassName: WechatGroupMgt
 * @Description: TODO
 * @Author: edgeowner
 * @Create: 2019-01-30 4:09 PM
 **/

public interface WechatGroupMgt {

    /**
     * 保存组
     *
     * @param groupDto
     */
    void saveGroup(GroupDto groupDto);

    void saveGroupList(List<WechatGroup> wechatGroups);
}
