package com.atmatrix.wechat.middleware.kafka.consumer;//package com.atmatrix.wechat.middleware.kafka.consumer;

import com.atmatrix.wechat.application.WechatMessageApplication;
import com.atmatrix.wechat.middleware.kafka.beans.WechatTextDto;
import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.text.MessageFormat;

@Slf4j
@Component("kafkaConsumer")
public class KafkaConsumer {

    @Autowired
    private WechatMessageApplication wchatMessageApplication;

    @KafkaListener(id = "wx_msg_id_2", topics = {"draftelf.draft.wechat.raw.test"})
    public void listen(String data) {
        Gson gson = new Gson();
        WechatTextDto wechatTextDto = gson.fromJson(data, WechatTextDto.class);
        wchatMessageApplication.saveWechatMessageMQ(wechatTextDto);
        log.info(MessageFormat.format("KafkaConsumer收到消息：{0}", data));
    }

}