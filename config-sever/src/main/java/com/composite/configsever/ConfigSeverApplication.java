package com.composite.configsever;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

//注册config服务到eureka
@EnableDiscoveryClient
//声明是configServer
@EnableConfigServer
@SpringBootApplication
public class ConfigSeverApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigSeverApplication.class, args);
	}
}
