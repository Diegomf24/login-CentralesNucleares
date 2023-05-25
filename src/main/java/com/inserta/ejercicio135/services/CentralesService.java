package com.inserta.ejercicio135.services;


import com.inserta.ejercicio135.models.Central;
import com.inserta.ejercicio135.models.Tipo;

import java.time.LocalDateTime;
import java.util.List;

public interface CentralesService {
    public List<Central> listaCentrales();

    public List<Central> findByInicioLessThan(LocalDateTime fecha);
    public List<Central> findByActiveTrue();
    public List<Central> findByTipoo(Tipo tipo);
}
