package com.atmatrix.wechat.application.impl;

import com.atmatrix.wechat.application.WechatCommonApplication;
import com.atmatrix.wechat.application.dto.GroupDto;
import com.atmatrix.wechat.application.dto.MemberDto;
import com.atmatrix.wechat.application.dto.WechatReqDataDto;
import com.atmatrix.wechat.infrastructure.po.WechatGroup;
import com.atmatrix.wechat.infrastructure.po.WechatMember;
import com.atmatrix.wechat.mgt.WechatGroupMgt;
import com.atmatrix.wechat.mgt.WechatMemberMgt;
import com.google.common.base.Function;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.util.*;

/**
 * @ProjectName: wx-msg-entrance
 * @ClassName: WechatCommonApplicationImpl
 * @Description: TODO
 * @Author: edgeowner
 * @Create: 2019-01-30 3:40 PM
 **/

@Slf4j
@Service
public class WechatCommonApplicationImpl implements WechatCommonApplication {


    @Autowired
    private WechatGroupMgt wechatGroupMgt;

    @Autowired
    private WechatMemberMgt wechatMemberMgt;


    @Transactional
    @Override
    public void batchSaveGroupMemberData(WechatReqDataDto wechatReqDataDto) {
        final String spiderWxid = wechatReqDataDto.getSd().getId();
        List<GroupDto> gp = wechatReqDataDto.getGp();
        Map<String, GroupDto> map = Maps.newHashMap();
        List<WechatGroup> groupList = Lists.transform(gp, new Function<GroupDto, WechatGroup>() {
            @Override
            public WechatGroup apply(GroupDto groupDto) {
                WechatGroup wechatGroup = new WechatGroup();
                wechatGroup.setGroupId(groupDto.getId());
                wechatGroup.setGroupNickname(groupDto.getNn());
                wechatGroup.setSpiderWxid(spiderWxid);
                wechatGroup.setIsDelete(Boolean.FALSE);
                Integer size = groupDto.getMm().size();
                wechatGroup.setGroupCount(size);
                map.put(groupDto.getId(), groupDto);
                return wechatGroup;
            }
        });
        wechatGroupMgt.saveGroupList(groupList);
        Map<String, Long> keyMapGroupId = Maps.newHashMap();

        for (WechatGroup wechatGroup : groupList) {
            keyMapGroupId.put(wechatGroup.getGroupId(), wechatGroup.getId());
        }
        List<WechatMember> memberList = Lists.newArrayList();
        WechatMember wechatMember;
        for (WechatGroup wechatGroup : groupList) {
            GroupDto groupDto = map.get(wechatGroup.getGroupId());
            Integer count = groupDto.getMm() == null ? null : groupDto.getMm().size();
            List<MemberDto> memberDtoList = groupDto.getMm();
            if (!CollectionUtils.isEmpty(memberDtoList)) {
                for (MemberDto memberDto : memberDtoList) {
                    wechatMember = new WechatMember();
                    wechatMember.setGroupId(groupDto.getId());
                    wechatMember.setGroupNickname(groupDto.getNn());
                    wechatMember.setIsDelete(Boolean.FALSE);
                    wechatMember.setMemberWxid(memberDto.getId());
                    wechatMember.setMemberNickname(memberDto.getNn());
                    wechatMember.setSpiderWxid(spiderWxid);
                    wechatMember.setGroupKey(keyMapGroupId.get(groupDto.getId()));
                    memberList.add(wechatMember);
                }
            }
            groupDto.setCountNum(count);

        }

        List<List<WechatMember>> membersList = Lists.partition(memberList, 500);

        for (List<WechatMember> wechatMembers : membersList) {
            wechatMemberMgt.saveMemberList(wechatMembers);
        }


    }
}
