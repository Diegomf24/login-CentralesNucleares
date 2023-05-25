package com.inserta.ejercicio135.controllers;

import com.inserta.ejercicio135.models.User;
import com.inserta.ejercicio135.services.UserService;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/bienvenido")
    public String accesoValido(@RequestParam String email, @RequestParam String password, HttpSession session, Model model){
        User userValido = userService.findByCorreoAndClave(email, password);

        if (userValido == null) {
            model.addAttribute("mensaje", "Tus credenciales son incorrectas, por favor intentelo otra vez");
            return "login";
        } else {
            session.setAttribute("userValido", userValido);
            session.setAttribute("idSession", session.getId());
            return "index";
        }

    }

    @RequestMapping("/logout")
    public String salir(HttpSession session){
        session.invalidate();
        return "redirect:/";
    }
}
