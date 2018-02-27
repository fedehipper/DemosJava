package com.demo.herencia.repository;

import com.demo.herencia.HerenciaApplicationTests;
import com.demo.herencia.domain.Aldeano;
import com.demo.herencia.domain.Guerrero;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class PersonaRepositoryTest extends HerenciaApplicationTests {

    @Autowired
    AldeanoRepository aldeanoRepository;

    @Autowired
    GuerreroRepository guerreoRepository;

    @Test
    public void buscarTodos_conAldeanos_devuelveTodosLosAldeanos() {
        List<Aldeano> aldeanos = aldeanoRepository.findAll();
        assertThat(new Aldeano(3L, "julieta", "granola", 20, "tomates"))
                .isEqualToComparingFieldByField(aldeanos.get(0));
    }

    @Test
    public void buscarTodos_conGuerreros_devuelveTodosLosGuerreros() {
        List<Guerrero> guerreros = guerreoRepository.findAll();
        assertThat(new Guerrero(1L, "carlos", "calvo", 22, "cortar cabezas", 1))
                .isEqualToComparingFieldByField(guerreros.get(0));
        assertThat(new Guerrero(2L, "juan", "garcia", 25, "cortar brazos", 2))
                .isEqualToComparingFieldByField(guerreros.get(1));
    }

}
