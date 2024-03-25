package com.zorrix.onlineShop.repository;

import com.zorrix.onlineShop.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductGetRepository {
    List<Product> getAllProducts();

    Product getProduct(int id);
}
