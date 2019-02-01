package com.atmatrix.wechat.infrastructure.dao;

import com.atmatrix.wechat.infrastructure.po.WechatGroup;
import com.atmatrix.wechat.infrastructure.po.WechatGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WechatGroupMapper {
    long countByExample(WechatGroupExample example);

    Long insert(WechatGroup record);

    int insertSelective(WechatGroup record);

    List<WechatGroup> selectByExample(WechatGroupExample example);

    int updateByExampleSelective(@Param("record") WechatGroup record, @Param("example") WechatGroupExample example);

    int updateByExample(@Param("record") WechatGroup record, @Param("example") WechatGroupExample example);

    Long batchInsert(@Param("list") List<WechatGroup> wechatGroups);
}