package com.demooo.repository;

import com.demooo.domain.Guerrero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuerreroRepository extends JpaRepository<Guerrero, Long> {
    
}
