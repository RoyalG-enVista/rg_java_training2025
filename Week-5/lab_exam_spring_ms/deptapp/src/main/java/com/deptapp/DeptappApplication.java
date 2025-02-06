package com.deptapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients("com.deptapp.proxyservice")
@SpringBootApplication
public class DeptappApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeptappApplication.class, args);
	}

}
