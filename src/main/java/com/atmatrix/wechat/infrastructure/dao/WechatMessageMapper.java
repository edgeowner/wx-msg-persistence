package com.atmatrix.wechat.infrastructure.dao;

import com.atmatrix.wechat.infrastructure.po.WechatMessage;
import com.atmatrix.wechat.infrastructure.po.WechatMessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WechatMessageMapper {
    Long countByExample(WechatMessageExample example);

    Long insert(WechatMessage record);

    Integer insertSelective(WechatMessage record);

    List<WechatMessage> selectByExampleWithBLOBs(WechatMessageExample example);

    List<WechatMessage> selectByExample(WechatMessageExample example);

    Integer updateByExampleSelective(@Param("record") WechatMessage record, @Param("example") WechatMessageExample example);

    Integer updateByExampleWithBLOBs(@Param("record") WechatMessage record, @Param("example") WechatMessageExample example);

    Integer updateByExample(@Param("record") WechatMessage record, @Param("example") WechatMessageExample example);

    void batchInsert(@Param("list") List<WechatMessage> list);
}