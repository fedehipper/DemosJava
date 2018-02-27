package com.demo.herencia.service;

import com.demo.herencia.domain.Aldeano;
import com.demo.herencia.repository.AldeanoRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class AldeanoService {

    AldeanoRepository aldeanoRepository;
    
    public AldeanoService(AldeanoRepository aldeanoRepository) {
        this.aldeanoRepository = aldeanoRepository;
    }
        
    public List<Aldeano> buscarTodos() {
        return aldeanoRepository.findAll();
    }
    
}
