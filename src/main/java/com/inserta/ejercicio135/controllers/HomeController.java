package com.inserta.ejercicio135.controllers;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(HttpSession session){
        if (session.getAttribute("userValido") == null) {
            return "login";
        } else {
            return "index";
        }
    }


}
