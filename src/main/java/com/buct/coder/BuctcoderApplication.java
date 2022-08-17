package com.buct.coder;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"com.buct.coder.mapper"})
public class BuctcoderApplication {

	public static void main(String[] args) {
		SpringApplication.run(BuctcoderApplication.class, args);
	}

}
