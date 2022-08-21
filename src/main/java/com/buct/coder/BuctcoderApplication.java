package com.buct.coder;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan({"com.buct.coder.mapper"})
@EnableScheduling
public class BuctcoderApplication {

	public static void main(String[] args) {
		SpringApplication.run(BuctcoderApplication.class, args);
	}

}
