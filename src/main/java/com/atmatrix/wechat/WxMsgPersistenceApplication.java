package com.atmatrix.wechat;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@MapperScan("com.atmatrix.wechat.infrastructure.dao")//配置mybatis接口包扫描
@RestController

public class WxMsgPersistenceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WxMsgPersistenceApplication.class, args);
	}

	@GetMapping("/test")
	public Boolean test() {
		return true;
	}
}

