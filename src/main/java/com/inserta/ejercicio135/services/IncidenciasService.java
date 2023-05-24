package com.inserta.ejercicio135.services;

import com.inserta.ejercicio135.models.Incidencia;

import java.time.LocalDateTime;
import java.util.List;

public interface IncidenciasService {

    public List<Incidencia> listaIncidencias();

    public List<Incidencia> getIncidenciaByResueltaTrue();
    public List<Incidencia> entreFechas(LocalDateTime inicio, LocalDateTime fin);

}
