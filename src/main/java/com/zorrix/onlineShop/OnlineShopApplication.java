package com.zorrix.onlineShop;

import com.zorrix.onlineShop.config.SpringConfig;
import com.zorrix.onlineShop.services.ProductAddService;
import com.zorrix.onlineShop.services.ProductGetService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;


@SpringBootApplication(scanBasePackages = "com.zorrix.onlineShop")
public class OnlineShopApplication extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder springApplicationBuilder){
		return springApplicationBuilder.sources(OnlineShopApplication.class);
	}

	public static void main(String[] args) throws IOException {
		AnnotationConfigApplicationContext context =
			new AnnotationConfigApplicationContext(SpringConfig.class);

		ProductGetService productGet = context.getBean("productGetService", ProductGetService.class);

		System.out.println(context.getBean("allProducts", ArrayList.class).size());

//        SpringApplication.run(OnlineShopApplication.class, args);
	}

}
