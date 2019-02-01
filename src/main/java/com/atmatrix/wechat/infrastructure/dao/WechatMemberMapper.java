package com.atmatrix.wechat.infrastructure.dao;

import com.atmatrix.wechat.infrastructure.po.WechatMember;
import com.atmatrix.wechat.infrastructure.po.WechatMemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.security.core.parameters.P;

public interface WechatMemberMapper {
    long countByExample(WechatMemberExample example);

    Long insert(WechatMember record);

    int insertSelective(WechatMember record);

    List<WechatMember> selectByExample(WechatMemberExample example);

    int updateByExampleSelective(@Param("record") WechatMember record, @Param("example") WechatMemberExample example);

    int updateByExample(@Param("record") WechatMember record, @Param("example") WechatMemberExample example);

    void batchInsert(@Param("list") List<WechatMember> wechatMembers);
}