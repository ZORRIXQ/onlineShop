package com.zorrix.onlineShop.repository;

import com.zorrix.onlineShop.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductAddRepository {
    void addProduct(Product productToAdd);

    void addAllProducts(List<Product> products);
}
