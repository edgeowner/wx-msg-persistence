package com.atmatrix.wechat.mgt.impl;

import com.atmatrix.wechat.application.dto.GroupDto;
import com.atmatrix.wechat.common.constants.IsDeleteEnum;
import com.atmatrix.wechat.infrastructure.dao.WechatGroupMapper;
import com.atmatrix.wechat.infrastructure.po.WechatGroup;
import com.atmatrix.wechat.mgt.WechatGroupMgt;
import com.google.common.base.Function;
import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * @ProjectName: wx-msg-entrance
 * @ClassName: WechatGroupMgtImpl
 * @Description: TODO
 * @Author: edgeowner
 * @Create: 2019-01-30 4:09 PM
 **/

@Slf4j
@Component
public class WechatGroupMgtImpl implements WechatGroupMgt {

    @Autowired
    private WechatGroupMapper wechatGroupMapper;

    @Override
    public void saveGroup(GroupDto groupDto) {
        WechatGroup wechatGroup = new WechatGroup();
        wechatGroup.setGroupId(groupDto.getId());
        wechatGroup.setGroupCount(groupDto.getCountNum());
        wechatGroup.setGroupNickname(groupDto.getNn());
        wechatGroupMapper.insert(wechatGroup);
    }

    @Override
    public void saveGroupList(List<WechatGroup> wechatGroupList) {
        if (!CollectionUtils.isEmpty(wechatGroupList)) {
            Long integer = wechatGroupMapper.batchInsert(wechatGroupList);
            System.out.println(integer);
        }
        for (WechatGroup wechatGroup:wechatGroupList) {
            Long insert = wechatGroupMapper.insert(wechatGroup);
            System.out.println(insert);
        }
    }
}
