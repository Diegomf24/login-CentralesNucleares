package com.inserta.ejercicio135.services;

import com.inserta.ejercicio135.models.User;

import java.util.List;

public interface UserService {

    public User findByCorreo(String correo);
    public List<User> findByNombre(String nombre);
    public List<User> findByCorreoContainsIgnoreCase(String correoParcial);
    public User findByCorreoAndClave(String correo, String clave);

}
