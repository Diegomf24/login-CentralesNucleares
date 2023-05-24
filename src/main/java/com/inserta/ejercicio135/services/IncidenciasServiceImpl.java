package com.inserta.ejercicio135.services;

import com.inserta.ejercicio135.models.Incidencia;
import com.inserta.ejercicio135.repos.IncidenciasRepo;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class IncidenciasServiceImpl implements IncidenciasService{

    private final IncidenciasRepo incidenciasRepo;

    public IncidenciasServiceImpl(IncidenciasRepo incidenciasRepo) {
        this.incidenciasRepo = incidenciasRepo;
    }

    @Override
    public List<Incidencia> listaIncidencias() {
        return incidenciasRepo.findAll();
    }

    @Override
    public List<Incidencia> getIncidenciaByResueltaTrue() {
        return incidenciasRepo.findByResueltaIsTrue();
    }

    @Override
    public List<Incidencia> entreFechas(LocalDateTime inicio, LocalDateTime fin) {
        return incidenciasRepo.findByFechaBetween(inicio, fin);
    }

}
