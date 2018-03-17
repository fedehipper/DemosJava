package com.demooo.service;

import com.demooo.domain.Guerrero;
import com.demooo.repository.GuerreroRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GuerreroService {

    @Autowired
    private GuerreroRepository guerreroRepository;

    public Guerrero buscarPorId(Long id) {
        return guerreroRepository.findOne(id);
    }

    public List<Guerrero> buscarTodos() {
        return guerreroRepository.findAll();
    }

}
