package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(DemoApplication.class, args);
		for (int i = 0; i < 29; i++) {
			System.out.println("hello world");
			Thread.sleep(1000);
		}
	}

}
