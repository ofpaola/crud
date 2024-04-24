package br.com.crud.usuarios.controller;

import br.com.crud.usuarios.external.dto.UsuarioDTO;
import br.com.crud.usuarios.external.model.Usuario;
import br.com.crud.usuarios.usecase.UsuarioUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/usuario")
public class UsuarioController {

    private final UsuarioUseCase useCase;

    @PostMapping
    public ResponseEntity<UsuarioDTO> save(@RequestBody UsuarioDTO usuarioDTO){
        Usuario usuario = useCase.saveUsuario(usuarioDTO);

        if(usuario != null) {
            return new ResponseEntity<>(new UsuarioDTO(usuarioDTO.getId(), usuarioDTO.getNome(), usuarioDTO.getEmail(), usuarioDTO.getDocumento()), HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

//    @GetMapping
//    public ResponseEntity<List<UsuarioDTO>> find(){
//        List<Usuario> usuarios = useCase.findUsuario();
////        return ResponseEntity.ok(usuarios);
////    }

//    @PutMapping
//    public ResponseEntity<Usuario> update(@RequestBody Usuario usuario){
//        return ResponseEntity.ok(useCase.updateUsuario(usuario));
//    }


}
