package com.demo.herencia.domain;

import javax.persistence.Entity;

@Entity
public class Aldeano extends Persona {

    private String cultivo;

    public Aldeano(Long id, String nombre, String apellido, int edad, String cultivo) {
        super(id, nombre, apellido, edad);
        this.cultivo = cultivo;
    }

    public Aldeano() {
    }

}
