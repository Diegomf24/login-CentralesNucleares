package com.inserta.ejercicio135.models;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@NoArgsConstructor @AllArgsConstructor
@Getter @Setter @ToString
@Entity @Table(name = "centrales")
public class Central {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int idTipo;
    private int potencia;
    private boolean activa;
    private String latitud;
    private String longitud;
    private String descripcion;
    private String imagen;
    private String idProvincia;
    private String observaciones;
    private LocalDateTime inicio;
    private LocalDateTime fin;

}
