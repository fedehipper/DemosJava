package com.demooo.service;

import com.demooo.domain.Aldeano;
import com.demooo.repository.AldeanoRepository;
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
