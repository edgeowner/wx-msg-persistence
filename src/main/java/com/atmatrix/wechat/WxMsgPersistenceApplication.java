package com.atmatrix.wechat;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.atmatrix.wechat.infrastructure.dao")//配置mybatis接口包扫描
public class WxMsgPersistenceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WxMsgPersistenceApplication.class, args);
	}


}

