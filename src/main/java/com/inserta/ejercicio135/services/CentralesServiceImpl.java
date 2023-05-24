package com.inserta.ejercicio135.services;

import com.inserta.ejercicio135.models.Central;
import com.inserta.ejercicio135.repos.CentralesRepo;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class CentralesServiceImpl implements CentralesService{

    private final CentralesRepo centralesRepo;

    public CentralesServiceImpl(CentralesRepo centralesRepo) {
        this.centralesRepo = centralesRepo;
    }

    @Override
    public List<Central> listaCentrales() {
        return centralesRepo.findAll();
    }

    @Override
    public List<Central> findByIdTipo(int idTipo) {
        return centralesRepo.findByIdTipo(idTipo);
    }

    @Override
    public List<Central> findByInicioLessThan(LocalDateTime fecha) {
        return centralesRepo.findByInicioLessThan(fecha);
    }

    @Override
    public List<Central> findByActiveTrue() {
        return centralesRepo.findByActivaTrue();
    }



}
