package com.atmatrix.wechat.infrastructure.dao;

import com.atmatrix.wechat.infrastructure.po.WechatDuplicate;
import com.atmatrix.wechat.infrastructure.po.WechatDuplicateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WechatDuplicateMapper {
    long countByExample(WechatDuplicateExample example);

    int insert(WechatDuplicate record);

    int insertSelective(WechatDuplicate record);

    List<WechatDuplicate> selectByExampleWithBLOBs(WechatDuplicateExample example);

    List<WechatDuplicate> selectByExample(WechatDuplicateExample example);

    int updateByExampleSelective(@Param("record") WechatDuplicate record, @Param("example") WechatDuplicateExample example);

    int updateByExampleWithBLOBs(@Param("record") WechatDuplicate record, @Param("example") WechatDuplicateExample example);

    int updateByExample(@Param("record") WechatDuplicate record, @Param("example") WechatDuplicateExample example);
}