package br.com.crud.usuarios.controller;

import br.com.crud.usuarios.external.dto.UsuarioDTO;
import br.com.crud.usuarios.external.model.Usuario;
import br.com.crud.usuarios.repository.UsuarioRepository;
import br.com.crud.usuarios.usecase.UsuarioUseCase;
import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class UsuarioControllerTest {

    @Autowired
    private MockMvc mockMvc;
    @InjectMocks
    private UsuarioController controller;
    @InjectMocks
    private UsuarioUseCase useCase;
    @Mock
    private UsuarioRepository repository;

    @BeforeEach
    void setUp(){
        controller = new UsuarioController(useCase);
        useCase = new UsuarioUseCase(repository);
        this.mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
    }

    @Test
    void save() {
        when(repository.save(any())).thenReturn(any());
        ResponseEntity<Usuario> response = controller.save(UsuarioDTO.builder().id("909").build());
        assertEquals(HttpStatus.OK, response.getStatusCode());
    }

    @Test
    void find() {
        List<Usuario> usuarios = new ArrayList<>();
        when(useCase.findUsuario()).thenReturn(usuarios);
        List<Usuario> response = controller.find();
        assertEquals(usuarios, response);
    }

    @Test
    void update() {
        when(repository.save(any())).thenReturn(any());
        ResponseEntity<Usuario> response = controller.update(UsuarioDTO.builder().id("909").build());
        assertEquals(HttpStatus.OK, response.getStatusCode());
    }
}