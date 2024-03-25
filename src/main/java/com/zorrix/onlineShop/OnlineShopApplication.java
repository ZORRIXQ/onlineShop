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
import java.util.List;


@SpringBootApplication(scanBasePackages = "com.zorrix.onlineShop")
public class OnlineShopApplication extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder springApplicationBuilder){
		return springApplicationBuilder.sources(OnlineShopApplication.class);
	}

	public static void main(String[] args) throws IOException {
		AnnotationConfigApplicationContext context =
			new AnnotationConfigApplicationContext(SpringConfig.class);

		ProductAddService productAdd = context.getBean("productAddService", ProductAddService.class);

//		Product p1 = new Product("Iphone 15",
//				"The iPhone 15 features a 6.1-inch (155 mm) display with Super Retina XDR OLED technology at a resolution of 2556×1179 pixels and a pixel density of about 460 PPI with a refresh rate of 60 Hz.",
//				800, "/resources/images/phone.png");
//
//		Product p2 = new Product("Baggy jeans",
//				"Baggy jeans are a style of jeans that are loose-fitting and baggy in the legs. The style became popular in the 1990s and has seen a resurgence in recent years.",
//				150, "/resources/images/jeans.jpg");
//
//		Product p3 = new Product("Macbook",
//				"Ta brand of Mac notebook computers designed and marketed by Apple that use Apple's macOS operating system since 2006.",
//				1500, "/resources/images/macbook.png");
//
//		Product[] products = new Product[]{p1, p2, p3};
//
//		productAdd.addAllProducts(List.of(products));

        SpringApplication.run(OnlineShopApplication.class, args);
	}

}
