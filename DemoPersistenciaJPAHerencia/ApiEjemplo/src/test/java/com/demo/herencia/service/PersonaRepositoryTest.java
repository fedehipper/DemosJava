package com.demo.herencia.service;

import com.demo.herencia.HerenciaApplicationTests;
import com.demo.herencia.domain.Aldeano;
import com.demo.herencia.domain.Guerrero;
import com.demo.herencia.domain.Tipo;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class PersonaRepositoryTest extends HerenciaApplicationTests {

    @Autowired
    AldeanoService aldeanoService;

    @Autowired
    GuerreroService guerreroService;

    @Test
    public void buscarTodos_conAldeanos_devuelveTodosLosAldeanos() {
        List<Aldeano> aldeanos = aldeanoService.buscarTodos();
        
        assertThat(new Aldeano(3L, "julieta", "granola", 20, Tipo.ALDEANO, "tomates"))
                .isEqualToComparingFieldByField(aldeanos.get(0));
    }

    @Test
    public void buscarTodos_conGuerreros_devuelveTodosLosGuerreros() {
        List<Guerrero> guerreros = guerreroService.buscarTodos();
        assertThat(new Guerrero(1L, "carlos", "calvo", 22, Tipo.GUERRERO, "cortar cabezas", 1))
                .isEqualToComparingFieldByField(guerreros.get(0));
        assertThat(new Guerrero(2L, "juan", "garcia", 25, Tipo.GUERRERO, "cortar brazos", 2))
                .isEqualToComparingFieldByField(guerreros.get(1));
    }

}
