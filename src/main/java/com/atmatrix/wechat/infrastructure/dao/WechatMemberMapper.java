package com.atmatrix.wechat.infrastructure.dao;

import com.atmatrix.wechat.infrastructure.po.WechatMember;
import com.atmatrix.wechat.infrastructure.po.WechatMemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WechatMemberMapper {

    Long countByExample(WechatMemberExample example);

    Long insert(WechatMember record);

    Integer insertSelective(WechatMember record);

    List<WechatMember> selectByExample(WechatMemberExample example);

    Integer updateByExampleSelective(@Param("record") WechatMember record, @Param("example") WechatMemberExample example);

    Integer updateByExample(@Param("record") WechatMember record, @Param("example") WechatMemberExample example);

}