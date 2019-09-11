package com.sakha.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class SakhaBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SakhaBootApplication.class, args);
	}

}