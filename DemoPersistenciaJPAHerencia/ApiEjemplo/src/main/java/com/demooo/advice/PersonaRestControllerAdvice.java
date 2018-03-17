package com.demooo.advice;

import com.demooo.excepcion.ErrorException;
import com.demooo.vo.ErrorVo;
import java.io.IOException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class PersonaRestControllerAdvice {
    
    @ExceptionHandler(ErrorException.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    public ErrorVo handlePersonaErronea(ErrorException exception) throws IOException {
        return new ErrorVo(exception.getCodigo(), exception.getMessage());
    }
    
}
