package com.demo.herencia.controller.rest;

import com.demo.herencia.domain.Aldeano;
import com.demo.herencia.domain.Guerrero;
import com.demo.herencia.service.AldeanoService;
import com.demo.herencia.service.GuerreroService;
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

}
