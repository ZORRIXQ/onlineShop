package com.zorrix.onlineShop.services;

import com.zorrix.onlineShop.Product;
import com.zorrix.onlineShop.config.HibernateUtil;
import com.zorrix.onlineShop.repository.ProductAddRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductAddService implements ProductAddRepository {
    public void addProduct(Product productToAdd){
    SessionFactory factory = HibernateUtil.getSessionFactory();
    Session session = HibernateUtil.getSession();
    try(factory;session){
        Transaction transaction = session.beginTransaction();
        Product product = new Product();
        product.setName(productToAdd.getName());
        product.setDescription(productToAdd.getDescription());
        product.setPrice(productToAdd.getPrice());
        System.out.println("Get product: " + product);

        product.setImage(productToAdd.getImage());

        session.persist(product);
        session.flush();
        transaction.commit();

        HibernateUtil.closeSession(session);
        System.out.println("Successfully added " + product.getName());

    }
}

    public void addAllProducts(List<Product> products) {
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = HibernateUtil.getSession();
        try(factory;session){
            Transaction transaction = session.beginTransaction();
            for (Product currentProduct : products){
                Product product = new Product();
                product.setName(currentProduct.getName());
                product.setDescription(currentProduct.getDescription());
                product.setPrice(currentProduct.getPrice());
                System.out.println("Get product: " + product);

                product.setImage(currentProduct.getImage());

                session.persist(product);
                session.flush();
                transaction.commit();
            }

            HibernateUtil.closeSession(session);
            System.out.println("Successfully added productList");
        }
    }

}
