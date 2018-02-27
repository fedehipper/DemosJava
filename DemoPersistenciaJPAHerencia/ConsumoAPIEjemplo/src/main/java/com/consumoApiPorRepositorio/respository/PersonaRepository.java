
package com.consumoApiPorRepositorio.respository;

import com.consumoApiPorRepositorio.domain.Persona;
import java.util.List;

public interface PersonaRepository {
    
    List<Persona> buscarTodas();
    
}
