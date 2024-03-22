package com.zorrix.onlineShop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages = "com.zorrix.onlineShop")
public class OnlineShopApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder springApplicationBuilder){
		return springApplicationBuilder.sources(OnlineShopApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(OnlineShopApplication.class, args);
	}

}
