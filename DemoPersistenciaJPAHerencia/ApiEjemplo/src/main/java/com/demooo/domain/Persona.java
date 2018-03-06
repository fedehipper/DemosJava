package com.demooo.domain;

import java.io.Serializable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import lombok.Data;

@Entity
@Data
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Persona implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
    protected String nombre;
    protected String apellido;
    protected int edad;
    @Enumerated(EnumType.STRING)
    protected Tipo tipo;
    @Embedded
    protected Pueblo pueblo;

    public Persona(Long id, String nombre, String apellido, int edad, Tipo tipo, Pueblo pueblo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.tipo = tipo;
        this.pueblo = pueblo;
    }

    public Persona() {
    }

}
