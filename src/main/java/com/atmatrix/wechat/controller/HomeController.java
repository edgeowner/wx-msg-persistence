package com.atmatrix.wechat.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: wx-msg-persistence
 * @ClassName: HomeController
 * @Description: TODO
 * @Author: edgeowner
 * @Create: 2019-01-14 3:40 PM
 **/

@RestController
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "Hello World!";
    }
}
