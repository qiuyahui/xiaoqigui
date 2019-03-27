package com.wby;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(value = {"classpath:dubbo*.xml"})
public class BusinessSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(BusinessSystemApplication.class, args);
		System.out.println("启动成功");
	}

}
