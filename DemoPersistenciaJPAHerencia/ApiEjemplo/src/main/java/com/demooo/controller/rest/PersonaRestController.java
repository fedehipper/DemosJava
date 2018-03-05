package com.demooo.controller.rest;

import com.demooo.domain.Aldeano;
import com.demooo.domain.Guerrero;
import com.demooo.domain.Persona;
import com.demooo.service.AldeanoService;
import com.demooo.service.GuerreroService;
import com.demooo.service.PersonaService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/personas")
public class PersonaRestController {

    @Autowired
    AldeanoService aldeanoService;
    @Autowired
    GuerreroService guerreroService;
    @Autowired
    PersonaService personaService;

    @GetMapping("/{tipoPersona}/{idPersona}")
    public Persona obtenerGuerreros(@PathVariable String tipoPersona, @PathVariable Long idPersona) {
        return personaService.buscarPorTipoPersonaEIdPersonsa(tipoPersona, idPersona);
    }

    @GetMapping("/guerreros")
    public List<Guerrero> obtenerGuerreros() {
        return guerreroService.buscarTodos();
    }

    @GetMapping("/aldeanos")
    public List<Aldeano> obtenerAldeanos() {
        return aldeanoService.buscarTodos();
    }

    @GetMapping
    public List obtenerPersonas() {
        List personas = new ArrayList<>();
        aldeanoService.buscarTodos().forEach(aldeano -> personas.add(aldeano));
        guerreroService.buscarTodos().forEach(guerrero -> personas.add(guerrero));
        return personas;
    }

}
