package com.atmatrix.wechat.mgt.impl;

import com.atmatrix.wechat.infrastructure.dao.WechatMemberMapper;
import com.atmatrix.wechat.infrastructure.po.WechatMember;
import com.atmatrix.wechat.infrastructure.po.WechatMessage;
import com.atmatrix.wechat.mgt.WechatMemberMgt;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Component
public class WechatMemberMgtImpl implements WechatMemberMgt {


    @Autowired
    private WechatMemberMapper wechatMemberMapper;

    @Override
    public Long insertWechatMember(WechatMember wechatMember) {
        if (wechatMember != null) {
            return wechatMemberMapper.insert(wechatMember);
        }
        return 0L;
    }


    @Override
    public void saveMemberList(List<WechatMember> wechatMembers) {
        wechatMemberMapper.batchInsert(wechatMembers);
    }
}
