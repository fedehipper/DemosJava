package com.demooo.repository;

import com.demooo.domain.Aldeano;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AldeanoRepository extends JpaRepository<Aldeano, Long> {
    
    List<Aldeano> findByNombreAndApellido(String nombre, String apellido);
    
}
