package com.demooo.service;

import com.demooo.domain.Persona;
import com.demooo.excepcion.ErrorException;
import java.util.NoSuchElementException;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {

    @Autowired
    private GuerreroService guerreroService;

    @Autowired
    private AldeanoService aldeanoService;

    public Persona buscarPorTipoPersonaEIdPersonsa(String tipoPersona, Long idPersona) {
        if (tipoPersona.equals("aldeanos")) {
            Optional persona = aldeanoService.buscarPorId(idPersona);
            if (persona.isPresent()) {
                return (Persona) persona.get();
            } else {
                throw new ErrorException("UND001");
            }
        } else if (tipoPersona.equals("guerreros")) {
            Optional persona = guerreroService.buscarPorId(idPersona);
            if (persona.isPresent()) {
                return (Persona) persona.get();
            } else {
                throw new NoSuchElementException("Se ingreso un id inexistente");
            }
        } else {
            throw new NoSuchElementException("Se ingreso un tipo de persona incorrecta");
        }
    }

}
