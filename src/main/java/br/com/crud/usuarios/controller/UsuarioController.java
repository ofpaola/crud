package br.com.crud.usuarios.controller;

import br.com.crud.usuarios.external.dto.UsuarioDTO;
import br.com.crud.usuarios.external.model.Usuario;
import br.com.crud.usuarios.usecase.UsuarioUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/usuario")
public class UsuarioController {

    private final UsuarioUseCase useCase;

    @PostMapping(value = "/cadastrar")
    public ResponseEntity<Usuario> save(@RequestBody UsuarioDTO usuarioDTO){
        return ResponseEntity.ok(useCase.saveUsuario(usuarioDTO));
    }

    @GetMapping(value = "/buscar")
    public List<Usuario> find(){
        return useCase.findUsuario();
    }

    @PutMapping(value = "/atualizar")
    public ResponseEntity<Usuario> update(@RequestBody UsuarioDTO usuarioDTO){
        return ResponseEntity.ok(useCase.updateUsuario(usuarioDTO));
}

}
