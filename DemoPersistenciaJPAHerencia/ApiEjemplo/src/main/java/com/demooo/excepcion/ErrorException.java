package com.demooo.excepcion;

import lombok.Getter;

@Getter
public class ErrorException extends RuntimeException {
    
    private String codigo;
    
    public ErrorException(String codigo, String mensaje) {
        super(mensaje);
        this.codigo = codigo;
    }
    
}

