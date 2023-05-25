package com.inserta.ejercicio135.models;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
@ToString
@Entity
@Table(name = "roles")
public class Rol {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String rol;

}
