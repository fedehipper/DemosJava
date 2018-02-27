package com.consumoApiPorRepositorio.controller.rest;

import com.consumoApiPorRepositorio.domain.Persona;
import com.consumoApiPorRepositorio.respository.PersonaRepository;
import java.util.List;
import static java.util.stream.Collectors.toList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/personas")
public class PersonaRestController {
    
    @Autowired
    private PersonaRepository personaRepository;
    
    @GetMapping
    public List obtenerPersonas() {           
        return personaRepository.buscarTodas();
    }
    
}
