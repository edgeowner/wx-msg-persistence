package com.atmatrix.wechat.mgt.impl;

import com.atmatrix.wechat.infrastructure.dao.WechatMessageMapper;
import com.atmatrix.wechat.infrastructure.po.WechatMessage;
import com.atmatrix.wechat.mgt.WechatMessageMgt;
import com.atmatrix.wechat.middleware.kafka.beans.WechatTextDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.text.DateFormat;
import java.text.MessageFormat;
import java.util.Date;


@Slf4j
@Component
public class WechatMessageMgtImpl implements WechatMessageMgt {

    @Autowired
    private WechatMessageMapper wechatMessageMapper;

    @Override
    public Long insertWechatMessage(WechatTextDto wechatTextDto) {
        log.info(MessageFormat.format("To Insert Data:{0}", wechatTextDto.toString()));
        Integer type = 0;
        if (!StringUtils.isEmpty(wechatTextDto.getTp())) {
            type = Integer.valueOf(wechatTextDto.getTp());
        } else {
            type = -1;
        }
        String wxid = "";
        if (!StringUtils.isEmpty(wechatTextDto.getSid())) {
            wxid = wechatTextDto.getSid();
        }
        String groupId = "";
        if (!StringUtils.isEmpty(wechatTextDto.getGid())) {
            groupId = wechatTextDto.getGid();
        }

        Long sendTime = null;
        if (!StringUtils.isEmpty(wechatTextDto.getSt())) {
            sendTime = Long.valueOf(wechatTextDto.getSt());
        } else {
            sendTime = 0L;
        }

        Long kafkaTime = null;
        if (!StringUtils.isEmpty(wechatTextDto.getTs())) {
            kafkaTime = Long.valueOf(wechatTextDto.getTs());
        } else {
            kafkaTime = 0L;
        }

        log.info(MessageFormat.format("sendTime: [{0}] kafka_time: [{1}]", sendTime, kafkaTime));
        Date sdate = new Date(sendTime);
        Date kdate = new Date(kafkaTime);

        WechatMessage wechatMessage = new WechatMessage();
        wechatMessage.setMsgId(wechatTextDto.getId());
        wechatMessage.setMsgFwxid(wechatTextDto.getFwid());
        wechatMessage.setMsgType(type);
        wechatMessage.setMsgUrl(wechatTextDto.getImg());
        wechatMessage.setMsgText(wechatTextDto.getText());


        wechatMessage.setMemberWxid(wxid);
        wechatMessage.setMemberPhones(wechatTextDto.getPno());
        wechatMessage.setMemberNickname(wechatTextDto.getNm());
        wechatMessage.setMemberSignature(wechatTextDto.getSig());

        wechatMessage.setGroupId(groupId);
        wechatMessage.setGroupNickname(wechatTextDto.getGn());

        wechatMessage.setIsDelete(Boolean.FALSE);
        wechatMessage.setIsDistinct(Boolean.TRUE);
        wechatMessage.setSendTime(sdate);
        wechatMessage.setKafkaTime(kdate);
        Date date = new Date();
        wechatMessage.setCreateTime(date);
        wechatMessage.setUpdateTime(date);
        Long key = wechatMessageMapper.insert(wechatMessage);
        return key;
    }


}
