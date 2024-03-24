package com.zorrix.onlineShop.services;

import com.querydsl.jpa.impl.JPAQuery;
import com.zorrix.onlineShop.Product;
import com.zorrix.onlineShop.config.HibernateUtil;
import com.zorrix.onlineShop.repository.ProductGetRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductGetService implements ProductGetRepository {
    public List<Product> getAllProducts(){
        return null;
    }

    public Product getProduct(int id){
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = HibernateUtil.getSession();

        session.getTransaction().begin();



        JPAQuery<Product> query = new JPAQuery<>();

//        Product product = query.select(qProduct).


        return null;
    }
}
