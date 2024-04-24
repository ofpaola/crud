package controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import usecase.UsuarioUseCase;

@RestController
@RequiredArgsConstructor
@RequestMapping("usuario")
public class UsuarioController {

    private final UsuarioUseCase useCase;

//    @PostMapping
//    public ResponseEntity<UsuarioDTO> save(@RequestBody UsuarioDTO usuarioDTO){
//        return ResponseEntity.ok(useCase.saveUsuario(usuarioDTO));
//    }
//
//    @GetMapping
//    public ResponseEntity<UsuarioDTO> find(@RequestParam ("documento") String documento){
//        return ResponseEntity.ok(useCase.findUsuario(documento));
//    }
//
//    @PutMapping
//    public ResponseEntity<UsuarioDTO> update(@RequestBody UsuarioDTO usuarioDTO){
//        return ResponseEntity.ok(useCase.updateUsuario(usuarioDTO));
//    }
}
