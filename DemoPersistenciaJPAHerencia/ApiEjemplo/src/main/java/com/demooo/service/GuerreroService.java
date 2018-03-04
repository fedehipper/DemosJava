package com.demooo.service;

import com.demooo.domain.Guerrero;
import com.demooo.repository.GuerreroRepository;
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
