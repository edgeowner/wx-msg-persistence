package com.atmatrix.wechat.mgt;

import com.atmatrix.wechat.infrastructure.po.WechatMember;

import java.util.List;


public interface WechatMemberMgt {

    Long insertWechatMember(WechatMember wechatMember);

    void saveMemberList(List<WechatMember> wechatMembers);
}
