package com.zorrix.onlineShop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    @RequestMapping("/home")
    public String goHome(){
        return "home";
    }

    @RequestMapping("/product")
    public String openProduct(@ModelAttribute("product") Model model){


        return "product";
    }

    @RequestMapping("/getImage")
    public ModelAndView gettingImage(){
        return new ModelAndView();
    }
}
