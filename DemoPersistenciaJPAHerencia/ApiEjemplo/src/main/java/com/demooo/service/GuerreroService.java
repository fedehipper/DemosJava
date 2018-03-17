package com.demooo.service;

import com.demooo.domain.Guerrero;
import com.demooo.repository.GuerreroRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GuerreroService {

    @Autowired
    private GuerreroRepository guerreroRepository;

    public Optional<Guerrero> buscarPorId(Long id) {
        return guerreroRepository.findById(id);
    }

    public List<Guerrero> buscarTodos() {
        return guerreroRepository.findAll();
    }

}
