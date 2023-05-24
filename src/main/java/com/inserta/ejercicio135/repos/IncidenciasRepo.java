package com.inserta.ejercicio135.repos;

import com.inserta.ejercicio135.models.Incidencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
@RepositoryRestResource(path = "incidencias")
public interface IncidenciasRepo extends JpaRepository<Incidencia, Integer> {

    public List<Incidencia> findByResueltaIsTrue();
    public List<Incidencia> findByFechaBetween(LocalDateTime inicio, LocalDateTime fin);

}
