package com.demooo.service;

import com.demooo.ApiEjemploApplicationTests;
import com.demooo.domain.Aldeano;
import com.demooo.domain.Guerrero;
import com.demooo.domain.Pueblo;
import com.demooo.domain.Tipo;
import com.demooo.excepcion.ErrorException;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class PersonaServiceTest extends ApiEjemploApplicationTests {

    @Autowired
    private AldeanoService aldeanoService;

    @Autowired
    private GuerreroService guerreroService;

    @Autowired
    private PersonaService personaService;

    @Test
    public void buscarTodos_conAldeanos_devuelveTodosLosAldeanos() {
        List<Aldeano> aldeanos = aldeanoService.buscarTodos();

        assertThat(new Aldeano("julieta", "granola", 20, Tipo.ALDEANO, new Pueblo("lomas", 1000), "tomates"))
                .isEqualToComparingOnlyGivenFields(aldeanos.get(0));
    }

    @Test
    public void buscarPorId_conAldeanoExistente_retornaAldeanoConEseId() {
        Aldeano aldeano = aldeanoService.buscarPorId(3L).get();
        assertThat(new Aldeano("julieta", "granola", 20, Tipo.ALDEANO, new Pueblo("lomas", 1000), "tomates"))
                .isEqualToComparingOnlyGivenFields(aldeano);
    }

    @Test
    public void buscarPorId_conGuerreroExistente_retornaGuerreroConEseId() {
        Guerrero guerrero = guerreroService.buscarPorId(1L).get();
        assertThat(new Guerrero("carlos", "calvo", 22, Tipo.GUERRERO, new Pueblo("lomas", 1000), "cortar cabezas", 1))
                .isEqualToComparingOnlyGivenFields(guerrero);
    }

    @Test
    public void buscarTodos_conGuerreros_devuelveTodosLosGuerreros() {
        List<Guerrero> guerreros = guerreroService.buscarTodos();
        assertThat(new Guerrero("carlos", "calvo", 22, Tipo.GUERRERO, new Pueblo("lomas", 1000), "cortar cabezas", 1))
                .isEqualToComparingOnlyGivenFields(guerreros.get(0));
        assertThat(new Guerrero("juan", "garcia", 25, Tipo.GUERRERO, new Pueblo("lomas", 1000), "cortar brazos", 2))
                .isEqualToComparingOnlyGivenFields(guerreros.get(1));
    }

    @Test
    public void buscarPorId_conAldeanoYGuerreroExistentes_devuelvenAldeanoYGuerreroConEseId() {
        Aldeano aldeano = (Aldeano) personaService.buscarPorId(3L);
        Guerrero guerrero = (Guerrero) personaService.buscarPorId(1L);
        assertThat(new Aldeano("julieta", "granola", 20, Tipo.ALDEANO, new Pueblo("lomas", 1000), "tomates"))
                .isEqualToComparingOnlyGivenFields(aldeano);
        assertThat(new Guerrero("carlos", "calvo", 22, Tipo.GUERRERO, new Pueblo("lomas", 1000), "cortar cabezas", 1))
                .isEqualToComparingOnlyGivenFields(guerrero);
    }

    @Test
    public void buscarPorTipoPersonaYIdPersonsa_conAldeanoExistentes_devuelvenAldeanoYGuerreroConEseId() {
        Aldeano aldeano = (Aldeano) personaService.buscarPorTipoPersonaYIdPersonsa("aldeanos", 3L);
        Guerrero guerrero = (Guerrero) personaService.buscarPorTipoPersonaYIdPersonsa("guerreros", 1L);
        assertThat(new Aldeano("julieta", "granola", 20, Tipo.ALDEANO, new Pueblo("lomas", 1000), "tomates"))
                .isEqualToComparingOnlyGivenFields(aldeano);
        assertThat(new Guerrero("carlos", "calvo", 22, Tipo.GUERRERO, new Pueblo("lomas", 1000), "cortar cabezas", 1))
                .isEqualToComparingOnlyGivenFields(guerrero);
    }

    @Test(expected = ErrorException.class)
    public void buscarPorId_conGuerreroInexistente_lanzaExcepcion() {
        personaService.buscarPorId(9999L);
    }
    
    @Test(expected = ErrorException.class)
    public void buscarPorTipoPersonaYIdPersonsa_conTipoGuerrerosExisteYIdNo_lanzaExcepcion() {
        personaService.buscarPorTipoPersonaYIdPersonsa("guerreros", 999L);
    }
    
    @Test(expected = ErrorException.class)
    public void buscarPorTipoPersonaYIdPersonsa_conTipoAldeanosExisteYIdNo_lanzaExcepcion() {
        personaService.buscarPorTipoPersonaYIdPersonsa("aldeanos", 999L);
    }
    
    @Test(expected = ErrorException.class)
    public void buscarPorTipoPersonaYIdPersonsa_conTipoPersonaNoExisteYIdNo_lanzaExcepcion() {
        personaService.buscarPorTipoPersonaYIdPersonsa("saraza", 999L);
    }

}
