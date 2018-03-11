package com.demooo.excepcion;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ErrorException extends RuntimeException {
    
    private String codigo;
    
}
