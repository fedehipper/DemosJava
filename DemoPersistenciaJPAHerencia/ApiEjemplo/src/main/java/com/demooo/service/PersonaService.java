package com.demooo.service;

import com.demooo.domain.Aldeano;
import com.demooo.domain.Guerrero;
import com.demooo.domain.Persona;
import com.demooo.excepcion.ErrorException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {

    @Autowired
    private GuerreroService guerreroService;

    @Autowired
    private AldeanoService aldeanoService;

    public List<Persona> buscarTodas() {
        List personas = new ArrayList<>();
        personas.addAll(aldeanoService.buscarTodos());
        personas.addAll(guerreroService.buscarTodos());
        return personas;
    }

    public Persona buscarPorId(Long idPersona) {
        Aldeano aldeano = aldeanoService.buscarPorId(idPersona);
        Guerrero guerrero = guerreroService.buscarPorId(idPersona);
        if (aldeano != null) {
            return aldeano;
        } else if (guerrero != null) {
            return guerrero;
        } else {
            throw new ErrorException("UND003", "No existe la persona.");
        }
    }

    public Persona buscarPorTipoPersonaYIdPersonsa(String tipoPersona, Long idPersona) {
        if (tipoPersona.equals("aldeanos")) {
            Persona persona = aldeanoService.buscarPorId(idPersona);
            if (persona != null) {
                return (Persona) persona;
            } else {
                throw new ErrorException("UND001", "No existe el aldeano.");
            }
        } else if (tipoPersona.equals("guerreros")) {
            Persona persona = guerreroService.buscarPorId(idPersona);
            if (persona != null) {
                return (Persona) persona;
            } else {
                throw new ErrorException("UND002", "No existe el guerrero.");
            }
        } else {
            throw new ErrorException("UND003", "No existe la persona.");
        }
    }
}
