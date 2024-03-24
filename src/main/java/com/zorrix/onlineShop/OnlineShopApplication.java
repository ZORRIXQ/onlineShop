package com.zorrix.onlineShop;

import com.zorrix.onlineShop.config.SpringConfig;
import com.zorrix.onlineShop.services.ProductAddService;
import com.zorrix.onlineShop.services.ProductGetService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.File;
import java.io.IOException;


@SpringBootApplication(scanBasePackages = "com.zorrix.onlineShop")
public class OnlineShopApplication extends SpringBootServletInitializer {


	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder springApplicationBuilder){
		return springApplicationBuilder.sources(OnlineShopApplication.class);
	}

	public static void main(String[] args) throws IOException {
		AnnotationConfigApplicationContext context =
			new AnnotationConfigApplicationContext(SpringConfig.class);
		String desc = "a brand of Mac notebook computers designed and marketed by Apple that use Apple's macOS operating system since 2006.";
		Product jeans = new Product("Macbook", desc, 1500, new File("src/main/webapp/resources/images/macbook.png"));

		ProductAddService productAdd = context.getBean("productAddService", ProductAddService.class);
		ProductGetService productGet = context.getBean("productGetService", ProductGetService.class);

		productAdd.addProduct(jeans);

//        SpringApplication.run(OnlineShopApplication.class, args);
	}

}
