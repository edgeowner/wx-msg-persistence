package com.atmatrix.wechat.controller;

import com.atmatrix.wechat.common.annotation.CustomerLog;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.MessageFormat;

/**
 * @ProjectName: wx-msg-persistence
 * @ClassName: HomeController
 * @Description: TODO
 * @Author: edgeowner
 * @Create: 2019-01-14 3:40 PM
 **/

@Slf4j
@RestController
public class HomeController {

    @CustomerLog(value = "Hello消息接口")
    @RequestMapping("/")
    public String home() {
        log.info(MessageFormat.format("home:[{0}]", "你好！"));
        return "Hello World!";
    }
}
