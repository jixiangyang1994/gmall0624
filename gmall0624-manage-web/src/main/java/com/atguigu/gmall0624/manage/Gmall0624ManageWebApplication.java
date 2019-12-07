package com.atguigu.gmall0624.manage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;


@SpringBootApplication
public class Gmall0624ManageWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(Gmall0624ManageWebApplication.class, args);
	}

}
