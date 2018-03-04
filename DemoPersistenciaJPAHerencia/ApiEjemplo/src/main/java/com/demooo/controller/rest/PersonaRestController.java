package com.demooo.controller.rest;

import com.demooo.domain.Aldeano;
import com.demooo.domain.Guerrero;
import com.demooo.service.AldeanoService;
import com.demooo.service.GuerreroService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/personas")
public class PersonaRestController {

    AldeanoService aldeanoService;
    GuerreroService guerreroService;

    public PersonaRestController(AldeanoService aldeanoService, GuerreroService guerreroService) {
        this.aldeanoService = aldeanoService;
        this.guerreroService = guerreroService;
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
