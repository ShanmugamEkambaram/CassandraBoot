package com.xerago;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.xerago")
public class CvmApplication {

	public static void main(String[] args) {
		SpringApplication.run(CvmApplication.class, args);
	}
}
