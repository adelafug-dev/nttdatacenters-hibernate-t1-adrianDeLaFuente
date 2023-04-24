package com.nttdata.hibernate.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.UniqueElements;

@Entity
@Table(name = "T_CLIENTE")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer identificador;

    private String nombre;

    private String primerApellido;

    private String segundoApellido;

    @UniqueElements
    @NotNull
    @Max(value = 9, message = "El DNI no puede contener más de 9 carácteres")
    private String dni;

}
