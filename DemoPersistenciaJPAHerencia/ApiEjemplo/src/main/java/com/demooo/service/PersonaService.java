package com.demooo.service;

import com.demooo.domain.Aldeano;
import com.demooo.domain.Guerrero;
import com.demooo.domain.Persona;
import com.demooo.excepcion.ErrorException;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {

    @Autowired
    private GuerreroService guerreroService;

    @Autowired
    private AldeanoService aldeanoService;

    public Persona buscarPorId(Long idPersona) {
        Optional<Aldeano> aldeano = aldeanoService.buscarPorId(idPersona);
        Optional<Guerrero> guerrero = guerreroService.buscarPorId(idPersona);
        if (aldeano.isPresent()) {
            return aldeano.get();
        } else if (guerrero.isPresent()) {
            return guerrero.get();
        } else {
            throw new ErrorException("UND003", "No existe la persona.");
        }
    }

    public Persona buscarPorTipoPersonaYIdPersonsa(String tipoPersona, Long idPersona) {
        if (tipoPersona.equals("aldeanos")) {
            Optional persona = aldeanoService.buscarPorId(idPersona);
            if (persona.isPresent()) {
                return (Persona) persona.get();
            } else {
                throw new ErrorException("UND001", "No existe el aldeano.");
            }
        } else if (tipoPersona.equals("guerreros")) {
            Optional persona = guerreroService.buscarPorId(idPersona);
            if (persona.isPresent()) {
                return (Persona) persona.get();
            } else {
                throw new ErrorException("UND002", "No existe el guerrero.");
            }
        } else {
            throw new ErrorException("UND003", "No existe la persona.");
        }
    }
}
