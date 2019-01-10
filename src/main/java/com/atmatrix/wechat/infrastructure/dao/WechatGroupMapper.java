package com.atmatrix.wechat.infrastructure.dao;

import com.atmatrix.wechat.infrastructure.po.WechatGroup;
import com.atmatrix.wechat.infrastructure.po.WechatGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WechatGroupMapper {
    Long countByExample(WechatGroupExample example);

    Integer insert(WechatGroup record);

    Integer insertSelective(WechatGroup record);

    List<WechatGroup> selectByExample(WechatGroupExample example);

    Integer updateByExampleSelective(@Param("record") WechatGroup record, @Param("example") WechatGroupExample example);

    Integer updateByExample(@Param("record") WechatGroup record, @Param("example") WechatGroupExample example);
}