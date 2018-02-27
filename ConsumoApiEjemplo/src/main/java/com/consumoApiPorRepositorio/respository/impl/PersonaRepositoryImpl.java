package com.consumoApiPorRepositorio.respository.impl;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.consumoApiPorRepositorio.domain.Persona;
import com.consumoApiPorRepositorio.respository.PersonaRepository;
import static java.util.Arrays.asList;
import org.springframework.web.client.RestTemplate;

@Repository
public class PersonaRepositoryImpl implements PersonaRepository {

    @Override
    public List<Persona> buscarTodas() {
        return asList(new RestTemplate().getForObject("http://localhost:8080/personas", Persona[].class));
    }

}