package com.inserta.ejercicio135.repos;

import com.inserta.ejercicio135.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RepositoryRestResource(path = "usuarios")
public interface UsuarioRepo extends JpaRepository<User, Integer> {

    public User findByCorreo(String correo);
    public List<User> findByNombre(String nombre);
    public List<User> findByCorreoContainsIgnoreCase(String correoParcial);
    public User findByCorreoAndClave(String correo, String clave);

}
