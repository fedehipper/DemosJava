package com.demooo.repository;

import com.demooo.domain.Guerrero;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuerreroRepository extends JpaRepository<Guerrero, Long> {
   
    List<Guerrero> findByNombreAndApellido(String nombre, String apellido);
    
}
