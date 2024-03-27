package com.zorrix.onlineShop;

import com.zorrix.onlineShop.config.SpringConfig;
import com.zorrix.onlineShop.services.ProductAddService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;


@SpringBootApplication(scanBasePackages = "com.zorrix.onlineShop")
public class OnlineShopApplication extends SpringBootServletInitializer {
	private final static String IMAGES_WEB_PATH = "/resources/images/";

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder springApplicationBuilder){
		return springApplicationBuilder.sources(OnlineShopApplication.class);
	}

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
			new AnnotationConfigApplicationContext(SpringConfig.class);

		ProductAddService productAdd = context.getBean("productAddService", ProductAddService.class);



		Product[] products = new Product[]{};


        SpringApplication.run(OnlineShopApplication.class, args);
	}

}
