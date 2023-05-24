package com.inserta.ejercicio135.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor @AllArgsConstructor
@Getter @Setter @ToString
@Entity @Table(name = "incidencias")
public class Incidencia {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int idUsuario;
    private int idCentral;
    private boolean resuelta;
    private String texto;
    private LocalDateTime fecha;

}
