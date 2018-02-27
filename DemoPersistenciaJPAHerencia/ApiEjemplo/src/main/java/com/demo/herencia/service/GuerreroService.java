package com.demo.herencia.service;

import com.demo.herencia.domain.Guerrero;
import com.demo.herencia.repository.GuerreroRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class GuerreroService {

    GuerreroRepository guerreroRepository;

    public GuerreroService(GuerreroRepository guerreroRepository) {
        this.guerreroRepository = guerreroRepository;
    }
    
    public List<Guerrero> buscarTodos() {
        return guerreroRepository.findAll();
    }

}
