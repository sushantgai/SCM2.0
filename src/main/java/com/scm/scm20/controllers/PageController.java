package com.scm.scm20.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;




@Controller
public class PageController {

    @RequestMapping(value = "/home")
    public String home(org.springframework.ui.Model model)
    {
        System.out.println("Home Page Handler");
        model.addAttribute("name", "Substring Technologies");
        model.addAttribute("subtext", "Paragraph");
        model.addAttribute("link", "https://www.google.com/");
        return "home";

    }

    // about 
    @RequestMapping("/about")
    public String aboutPage(){

        System.out.println("About Page Handler");
        return "about";
    }

    //services
    @RequestMapping("/services")
    public String servicesPage(){
        System.out.println("Services Page Handler");
        return "services";
    }

    //contact
    @GetMapping("/contact")
    public String getMethodName() {
        return new String("contact");
    }
    

    //login
    @GetMapping("/login")
    public String loginPage(){
        return new String("login");
    }

    //signup
    @GetMapping("/register")
    public String register() {
        return "register";
    }
    

}
