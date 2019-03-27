package com.wby;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(value = {"classpath:dubbo*.xml"})
public class BusinessManageApplication {

	public static void main(String[] args) {
		SpringApplication.run(BusinessManageApplication.class, args);
		System.out.println("消费者启动成功！");
	}

}
