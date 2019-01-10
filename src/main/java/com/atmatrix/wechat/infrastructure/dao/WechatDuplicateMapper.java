package com.atmatrix.wechat.infrastructure.dao;

import com.atmatrix.wechat.infrastructure.po.WechatDuplicate;
import com.atmatrix.wechat.infrastructure.po.WechatDuplicateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WechatDuplicateMapper {
    Long countByExample(WechatDuplicateExample example);

    Integer insert(WechatDuplicate record);

    Integer insertSelective(WechatDuplicate record);

    List<WechatDuplicate> selectByExampleWithBLOBs(WechatDuplicateExample example);

    List<WechatDuplicate> selectByExample(WechatDuplicateExample example);

    Integer updateByExampleSelective(@Param("record") WechatDuplicate record, @Param("example") WechatDuplicateExample example);

    Integer updateByExampleWithBLOBs(@Param("record") WechatDuplicate record, @Param("example") WechatDuplicateExample example);

    Integer updateByExample(@Param("record") WechatDuplicate record, @Param("example") WechatDuplicateExample example);
}