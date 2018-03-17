package com.demooo.service;

import com.demooo.domain.Aldeano;
import com.demooo.repository.AldeanoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AldeanoService {

    @Autowired
    private AldeanoRepository aldeanoRepository;

    public Aldeano buscarPorId(Long id) {
        return aldeanoRepository.findOne(id);
    }

    public List<Aldeano> buscarTodos() {
        return aldeanoRepository.findAll();
    }

}
