package com.demo.herencia.domain;

import javax.persistence.Entity;

@Entity
public class Guerrero extends Persona {

    private String habilidad;
    private int rango;

    public Guerrero(Long id, String nombre, String apellido, int edad, String habilidad, int rango) {
        super(id, nombre, apellido, edad);
        this.habilidad = habilidad;
        this.rango = rango;
    }

    public Guerrero() {
    }

}
