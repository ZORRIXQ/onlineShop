package com.zorrix.onlineShop.config;

import com.zorrix.onlineShop.Product;
import com.zorrix.onlineShop.services.ProductGetService;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import javax.sql.DataSource;
import java.util.List;

@Configuration
@ComponentScan("com.zorrix.onlineShop")
public class SpringConfig {
    @Bean
    public DataSource dataSource(){
        DataSourceBuilder<?> builder = DataSourceBuilder.create();

        builder.url("jdbc:postgresql://localhost:11111/shop")
                .username("postgres")
                .password("1357924680")
                .driverClassName("org.postgresql.Driver");

        return builder.build();
    }
    @Bean
    @Scope("singleton")
    public List<Product> allProducts(){
        ProductGetService productGet = new ProductGetService();
        System.out.println("\nallProducts: " + productGet.getAllProducts().size() + "\n");

        return productGet.getAllProducts();
    }

}
