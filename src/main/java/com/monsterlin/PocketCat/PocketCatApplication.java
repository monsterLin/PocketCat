package com.monsterlin.PocketCat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.monsterlin.PocketCat")
@SpringBootApplication
public class PocketCatApplication {

	public static void main(String[] args) {
		SpringApplication.run(PocketCatApplication.class, args);
	}
}
