package com.demooo.domain;

import javax.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Guerrero extends Persona {

    private String habilidad;
    private int rango;

    public Guerrero(Long id, String nombre, String apellido, int edad, Tipo tipo, Pueblo pueblo, String habilidad, int rango) {
        super(id, nombre, apellido, edad, tipo, pueblo);
        this.habilidad = habilidad;
        this.rango = rango;
    }

    public Guerrero() {
    }

}
