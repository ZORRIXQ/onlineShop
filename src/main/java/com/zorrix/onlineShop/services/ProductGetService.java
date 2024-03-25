package com.zorrix.onlineShop.services;

import com.querydsl.jpa.impl.JPAQuery;
import com.zorrix.onlineShop.Product;
import com.zorrix.onlineShop.config.HibernateUtil;
import com.zorrix.onlineShop.repository.ProductGetRepository;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.lang.reflect.Type;
import java.util.List;

@Service
public class ProductGetService implements ProductGetRepository {
    public List<Product> getAllProducts(){
        Session session = HibernateUtil.getSession();
        session.beginTransaction();

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Product> criteria = builder.createQuery(Product.class);
        Root<Product> root = criteria.from(Product.class);
        CriteriaQuery<Product> allProducts = criteria.select(root);
        TypedQuery<Product> typedQuery = session.createQuery(allProducts);

        return typedQuery.getResultList();
    }

    public Product getProduct(int id){
        Session session = HibernateUtil.getSession();
        session.beginTransaction();

        Product product = session.get(Product.class, id);

        session.getTransaction().commit();
        HibernateUtil.closeSession(session);

        return product;
    }
}
