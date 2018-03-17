package com.demooo.domain;

import javax.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Aldeano extends Persona {

    private String cultivo;

    public Aldeano(String nombre, String apellido, int edad, Tipo tipo, Pueblo pueblo, String cultivo) {
        super(nombre, apellido, edad, tipo, pueblo);
        this.cultivo = cultivo;
    }

    public Aldeano() {
    }

}
