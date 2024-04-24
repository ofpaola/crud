package usecase;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import repository.UsuarioRepository;

@Service
@RequiredArgsConstructor
public class UsuarioUseCase {

    private final UsuarioRepository repository;

//    public UsuarioDTO saveUsuario(UsuarioDTO usuario) {
//        return repository.save(usuario);
//    }
//    public UsuarioDTO findUsuario(String documento) {
//        Optional<Usuario> usuario = repository.findByDocumento(documento);
//
//        return usuario != null;
//    }
}
