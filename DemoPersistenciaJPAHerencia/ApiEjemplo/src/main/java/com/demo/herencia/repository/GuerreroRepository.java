package com.demo.herencia.repository;

import com.demo.herencia.domain.Guerrero;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuerreroRepository extends JpaRepository<Guerrero, Long> {
   
    List<Guerrero> findByNombreAndApellido(String nombre, String apellido);
    
}
