package com.atguigu.gmall0624.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.atguigu.gmall0624.user.mapper")

public class Gmall0624UsermanageApplication {

	public static void main(String[] args) {
		SpringApplication.run(Gmall0624UsermanageApplication.class, args);
	}

}
