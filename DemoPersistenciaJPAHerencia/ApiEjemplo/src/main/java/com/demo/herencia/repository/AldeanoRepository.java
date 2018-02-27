package com.demo.herencia.repository;

import com.demo.herencia.domain.Aldeano;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AldeanoRepository extends JpaRepository<Aldeano, Long> {
    
    List<Aldeano> findByNombreAndApellido(String nombre, String apellido);
    
}
