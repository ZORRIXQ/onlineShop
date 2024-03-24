package com.zorrix.onlineShop.config;

import com.zorrix.onlineShop.Product;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    static SessionFactory factory = null;

    static{
        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");
        config.addAnnotatedClass(Product.class);

        factory = config.buildSessionFactory();
    }

    public static SessionFactory getSessionFactory(){
        return factory;
    }

    public static Session getSession(){
        return factory.openSession();
    }

    public static void closeFactory() {
        if (factory != null) {
            factory.close();
        }
    }

    public static void closeSession(Session session){
        if (session != null){
            session.close();
        }
    }
}
