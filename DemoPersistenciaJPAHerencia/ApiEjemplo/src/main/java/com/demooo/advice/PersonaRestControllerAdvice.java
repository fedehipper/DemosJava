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
    public ErrorVo handlePersonaErronea(Exception exception) throws IOException {
        return new ErrorVo("UND001", "No existe la persona.");
    }
    
}
