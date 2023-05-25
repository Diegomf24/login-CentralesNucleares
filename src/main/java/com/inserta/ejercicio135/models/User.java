package com.inserta.ejercicio135.models;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor @AllArgsConstructor
@Getter @Setter @ToString
@Entity @Table(name = "usuarios")
public class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "id_rol", referencedColumnName = "id")
    private  Rol rol;
    private String nombre;
    private String clave;
    private String correo;

}
