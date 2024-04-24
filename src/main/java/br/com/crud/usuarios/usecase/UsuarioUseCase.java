package br.com.crud.usuarios.usecase;

import br.com.crud.usuarios.external.dto.UsuarioDTO;
import br.com.crud.usuarios.external.model.Usuario;
import br.com.crud.usuarios.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UsuarioUseCase {

    private final UsuarioRepository repository;

    public Usuario saveUsuario(UsuarioDTO usuarioDTO) {
        Usuario user = new Usuario(usuarioDTO.getId(), usuarioDTO.getNome(), usuarioDTO.getEmail(), usuarioDTO.getDocumento());
        return repository.save(user);
    }

    public List<Usuario> findUsuario() {
        return repository.findAll();
    }

    public Optional<Usuario> findUsuarioByDocumento(String documento) {
        return repository.findByDocumento(documento);
    }

//    public Usuario updateUsuario(Usuario usuario) {
//        return br.com.crud.usuarios.repository.save(usuario);
//    }
}
