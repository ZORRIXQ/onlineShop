package com.zorrix.onlineShop.repository;

import com.zorrix.onlineShop.Product;

import java.util.List;

public interface ProductAddRepository {
    void addProduct(Product productToAdd);

    void addAllProducts(List<Product> products);
}
