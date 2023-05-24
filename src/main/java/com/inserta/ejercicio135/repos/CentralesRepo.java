package com.inserta.ejercicio135.repos;

import com.inserta.ejercicio135.models.Central;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
@RepositoryRestResource(path = "centrales")
public interface CentralesRepo extends JpaRepository<Central, Integer> {
    public List<Central> findByIdTipo(int idTipo);
    public List<Central> findByInicioLessThan(LocalDateTime fecha);
    public List<Central> findByActivaTrue();
}