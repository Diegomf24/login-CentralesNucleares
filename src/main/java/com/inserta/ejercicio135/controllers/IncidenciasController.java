package com.inserta.ejercicio135.controllers;

import com.inserta.ejercicio135.models.Central;
import com.inserta.ejercicio135.models.Incidencia;
import com.inserta.ejercicio135.services.CentralesService;
import com.inserta.ejercicio135.services.IncidenciasService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;
import java.util.List;

@Controller
@RequestMapping("/incidencias")
public class IncidenciasController {

    private final CentralesService centralesService;
    private final IncidenciasService incidenciasService;

    public IncidenciasController(CentralesService centralesService, IncidenciasService incidenciasService) {
        this.centralesService = centralesService;
        this.incidenciasService = incidenciasService;
    }


    //Mostrar todas las incidencias:
    @GetMapping("/listado-incidencias")
    public String listadoIncidencias(Model model){
        List<Incidencia> listaIncidencias = incidenciasService.listaIncidencias();
        model.addAttribute("listaIncidencias", listaIncidencias);
        return "pages/listado-incidencias";
    }


    @GetMapping("/fecha/{year}")
    public String fecha(Model model, @PathVariable Integer year){
        LocalDateTime fechaAntigua = LocalDateTime.of(year, 1, 1, 0, 0);
        model.addAttribute("lista", fechaAntigua);
        return "pages/listado-incidencias";
    }

    @GetMapping("/resueltas")
    public String incidencias(Model model){
        model.addAttribute("lista", incidenciasService.getIncidenciaByResueltaTrue());
        return "pages/listado-incidencias";
    }


}
