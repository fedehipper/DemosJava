package com.demooo.domain;

import javax.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;

@Embeddable
@AllArgsConstructor
@Data
public class Pueblo {

    private String nombrePueblo;
    private long poblacion;

    public Pueblo() {
    }

}
