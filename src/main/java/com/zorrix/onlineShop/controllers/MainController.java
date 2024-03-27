package com.zorrix.onlineShop.controllers;

import com.zorrix.onlineShop.Product;
import com.zorrix.onlineShop.config.SpringConfig;
import com.zorrix.onlineShop.services.ProductGetService;
import jakarta.annotation.PostConstruct;
import jakarta.jws.WebParam;
import org.eclipse.tags.shaded.org.apache.xpath.operations.Mod;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {
    private final String imageNotFoundPath = "/resources/images/img.png";
    AnnotationConfigApplicationContext context;

    @ModelAttribute
//    @PostConstruct
    private void setContext(){
        context = new AnnotationConfigApplicationContext(SpringConfig.class);
    }

    @RequestMapping("/home")
    public String goHome(Model model){
        model.addAttribute("product", new Product());

        ArrayList<Product> productList = new ArrayList<>( context.getBean("productGetService", ProductGetService.class).getAllProducts());

        for (Product product : productList){
            if (!(new File("src/main/webapp" + product.getImagePath()).exists()))
                product.setImagePath(imageNotFoundPath);
        }

        model.addAttribute("allProducts", productList);
        context.close();
        return "home";
    }

    @RequestMapping("/product{id}")
    public String openProduct(Model model, @PathVariable int id){
        ProductGetService productGet = context.getBean("productGetService", ProductGetService.class);
        Product product = productGet.getProduct(id);

        model.addAttribute("product", product);
        context.close();

        return "product";
    }
}
