package com.inserta.ejercicio135.services;

import com.inserta.ejercicio135.models.User;
import com.inserta.ejercicio135.repos.UsuarioRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    private final UsuarioRepo usuarioRepo;

    public UserServiceImpl(UsuarioRepo usuarioRepo) {
        this.usuarioRepo = usuarioRepo;
    }

    @Override
    public User findByCorreo(String correo) {
        return usuarioRepo.findByCorreo(correo);
    }

    @Override
    public List<User> findByNombre(String nombre) {
        return usuarioRepo.findByNombre(nombre);
    }

    @Override
    public List<User> findByCorreoContainsIgnoreCase(String correoParcial) {
        return usuarioRepo.findByCorreoContainsIgnoreCase(correoParcial);
    }

    @Override
    public User findByCorreoAndClave(String correo, String clave) {
        return usuarioRepo.findByCorreoAndClave(correo, clave);
    }
}
