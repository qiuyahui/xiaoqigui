package com.wby;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(value = {"classpath:dubbo*.xml"})
public class AdvertOtherSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdvertOtherSystemApplication.class, args);
		System.out.println("f服务启动！！！");
	}

}
