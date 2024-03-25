package com.zorrix.onlineShop.controllers;

import com.zorrix.onlineShop.Product;
import com.zorrix.onlineShop.config.SpringConfig;
import com.zorrix.onlineShop.services.ProductGetService;
import jakarta.jws.WebParam;
import org.eclipse.tags.shaded.org.apache.xpath.operations.Mod;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {
    AnnotationConfigApplicationContext context;

    @ModelAttribute
    private void setContext(){
        context = new AnnotationConfigApplicationContext(SpringConfig.class);
    }

    @RequestMapping("/home")
    public String goHome(Model model){
        model.addAttribute("product", new Product());

        model.addAttribute("allProducts", context.getBean("productGetService", ProductGetService.class).getAllProducts());

        return "home";
    }

    @RequestMapping("/product{id}")
    public String openProduct(Model model, @PathVariable int id){
        ProductGetService productGet = context.getBean("productGetService", ProductGetService.class);
        Product product = productGet.getProduct(id);

        model.addAttribute("product", product);

        return "product";
    }
}
