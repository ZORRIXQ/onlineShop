package com.zorrix.onlineShop;

import com.zorrix.onlineShop.config.SpringConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootApplication(scanBasePackages = "com.zorrix.onlineShop")
public class OnlineShopApplication extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder springApplicationBuilder){
		return springApplicationBuilder.sources(OnlineShopApplication.class);
	}

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
			new AnnotationConfigApplicationContext(SpringConfig.class);

        SpringApplication.run(OnlineShopApplication.class, args);
	}

}
