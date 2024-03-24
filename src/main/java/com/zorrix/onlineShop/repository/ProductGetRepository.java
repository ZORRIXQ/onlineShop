package com.zorrix.onlineShop.repository;

import com.zorrix.onlineShop.Product;

import java.util.List;

public interface ProductGetRepository {
    List<Product> getAllProducts();

    Product getProduct(int id);
}
