package com.zorrix.onlineShop.controllers;

import com.zorrix.onlineShop.Product;
import jakarta.jws.WebParam;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {
    Product p1 = new Product(1, "Iphone", "Ipont", 700);
    Product[] products1 = new Product[]{p1};
    List<Product> products = new ArrayList<>(List.of(products1));

    @RequestMapping("/home")
    public String goHome(Model model){
        model.addAttribute("product", new Product());
        model.addAttribute("productList", products);

        return "home";
    }

    @RequestMapping("/product")
    public String openProduct(@ModelAttribute("product") Model model){

        return "product";
    }
}
