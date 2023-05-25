package com.inserta.ejercicio135.controllers;

import com.inserta.ejercicio135.models.Central;
import com.inserta.ejercicio135.models.Tipo;
import com.inserta.ejercicio135.services.CentralesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;
import java.util.List;

@Controller
@RequestMapping("/centrales")
public class CentralController {

    private final CentralesService centralesService;

    public CentralController(CentralesService centralesService) {
        this.centralesService = centralesService;
    }

    //Mostrar todas las centrales:
    @GetMapping("")
    public String listadoCentrales(Model model){
        List<Central> lista = centralesService.listaCentrales();
        model.addAttribute("lista", lista);
        return "pages/listado-centrales";
    }

    //Mostrar las centrales de tipo X:
    @GetMapping("/tipo/{id}")
    public String tipo(Model model, @PathVariable Integer id){
        Tipo tipo = new Tipo();
        tipo.setId(id);
        List<Central> tipo1 = centralesService.findByTipoo(tipo);
        model.addAttribute("lista", tipo1);
        return "pages/listado-centrales";
    }

    //Mostrar las centrales de tipo X:


    @GetMapping("/activas")
    public String activa(Model model){
        List<Central> activa = centralesService.findByActiveTrue();
        model.addAttribute("lista",activa);
        return "pages/listado-centrales";
    }

    @GetMapping("/fecha/{year}")
    public String fecha(Model model, @PathVariable Integer year){
        LocalDateTime fechaAntigua = LocalDateTime.of(year, 1, 1, 0, 0);
        List<Central> fecha = centralesService.findByInicioLessThan(fechaAntigua);
        model.addAttribute("lista", fecha);
        return "pages/listado-centrales";
    }

    @GetMapping("/fecha")
    public String fecha(Model model){
        LocalDateTime fechaAntigua = LocalDateTime.of(1975, 1, 1, 0, 0);
        List<Central> fecha = centralesService.findByInicioLessThan(fechaAntigua);
        model.addAttribute("lista", fecha);
        return "pages/listado-centrales";
    }

}
