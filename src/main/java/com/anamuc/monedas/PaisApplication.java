package com.anamuc.monedas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PaisApplication {

	public static void main(String[] args) {
		System.setProperty("io.netty.noUnsafe", "true");
        System.setProperty("io.netty.tryReflectionSetAccessible", "true");

        SpringApplication.run(PaisApplication.class, args);
	}

}
