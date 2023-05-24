package com.inserta.ejercicio135.controllers;

import com.inserta.ejercicio135.models.Central;
import com.inserta.ejercicio135.models.Incidencia;
import com.inserta.ejercicio135.services.CentralesService;
import com.inserta.ejercicio135.services.IncidenciasService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class APIController {

    private final CentralesService centralesService;
    private final IncidenciasService incidenciasService;

    public APIController(CentralesService centralesService, IncidenciasService incidenciasService) {
        this.centralesService = centralesService;
        this.incidenciasService = incidenciasService;
    }

    @GetMapping("/api/v1/centrales")
    public List<Central> obtenerTodasCentrales(){
        return centralesService.listaCentrales();
    }


    @GetMapping("/api/v1/incidencias")
    public List<Incidencia> obtenerTodasIncidencias(){
        return incidenciasService.listaIncidencias();
    }



}
