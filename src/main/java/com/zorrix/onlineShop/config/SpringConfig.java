package com.zorrix.onlineShop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.zorrix.onlineShop")
public class SpringConfig {

//    @Bean
//    public List<Product> productList(){
//        Product iphone = new Product(1, "Iphone", "ipegegw", 700);
//        Product jeans = new Product(2, "jeans", "baggy", 100);
//        Product[] p = new Product[]{iphone, jeans};
//        return new ArrayList<>(List.of(p));
//    }
}
