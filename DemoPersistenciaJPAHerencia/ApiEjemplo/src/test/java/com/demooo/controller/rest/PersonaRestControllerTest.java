package com.demooo.controller.rest;

import com.demooo.ApiEjemploApplicationTests;
import com.demooo.domain.Aldeano;
import com.demooo.domain.Guerrero;
import com.demooo.service.PersonaService;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import com.demooo.domain.Persona;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import static java.util.Arrays.asList;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;
import static org.springframework.restdocs.mockmvc.RestDocumentationRequestBuilders.get;
import static org.springframework.restdocs.operation.preprocess.Preprocessors.preprocessResponse;
import static org.springframework.restdocs.operation.preprocess.Preprocessors.prettyPrint;
import static org.springframework.restdocs.payload.PayloadDocumentation.fieldWithPath;
import static org.springframework.restdocs.payload.PayloadDocumentation.responseFields;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@AutoConfigureMockMvc
@AutoConfigureRestDocs("target/generated-snippets")
public class PersonaRestControllerTest extends ApiEjemploApplicationTests {

    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private ObjectMapper objectMapper;
    @MockBean
    private PersonaService personaService;

    @Test
    public void obtenerPersonasTest() throws Exception {
        Mockito.when(personaService.buscarTodas()).thenReturn(leerPeronasDesdeJson());
        mockMvc
                .perform(get("/personas").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
                .andDo(
                        document("{ClassName}/{methodName}",
                                preprocessResponse(prettyPrint()),
                                responseFields(
                                        fieldWithPath("[]").description("Personas.")).andWithPrefix("[].",
                                        fieldWithPath("id").description("Id de la persona."),
                                        fieldWithPath("nombre").description("Nombre de la persona."),
                                        fieldWithPath("apellido").description("Apellido de la persona."),
                                        fieldWithPath("tipo").description("Tipo de persona."),
                                        fieldWithPath("cultivo").description("Tipo de cultivo."),
                                        fieldWithPath("rango").description("Rango de la persona."),
                                        fieldWithPath("habilidad").description("Habilidad de la persona."),
                                        fieldWithPath("pueblo").description("Pueblo de la persona.")
                                ))
                );
    }

    private List<Persona> leerPeronasDesdeJson() throws IOException {
        List<Aldeano> aldeanos = asList(objectMapper.readValue(leerDeJson("aldeanos"), Aldeano[].class));
        List<Guerrero> guerreros = asList(objectMapper.readValue(leerDeJson("guerreros"), Guerrero[].class));
        List<Persona> personas = new ArrayList<>();
        personas.addAll(aldeanos);
        personas.addAll(guerreros);
        return personas;
    }

    private File leerDeJson(String nombreJson) {
        return new File("src/test/resources/json/" + nombreJson + ".json");
    }

}
