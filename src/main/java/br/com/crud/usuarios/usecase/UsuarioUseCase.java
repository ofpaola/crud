package br.com.crud.usuarios.usecase;

import br.com.crud.usuarios.external.dto.UsuarioDTO;
import br.com.crud.usuarios.external.model.Usuario;
import br.com.crud.usuarios.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UsuarioUseCase {

    private final UsuarioRepository repository;

    public Usuario saveUsuario(UsuarioDTO usuarioDTO) {
        Usuario user = new Usuario(usuarioDTO.getId(), usuarioDTO.getNome(), usuarioDTO.getEmail(), usuarioDTO.getDocumento());
        return repository.save(user);
    }

    public List<Usuario> findUsuario() {
        List<Usuario> usuarioList = new ArrayList<>();
        try{
            usuarioList = repository.findAll();
        } catch(Exception e) {

        }
        return usuarioList;
    }

    public Usuario updateUsuario(UsuarioDTO usuarioDTO) {
        Usuario user = new Usuario(usuarioDTO.getId(), usuarioDTO.getNome(), usuarioDTO.getEmail(), usuarioDTO.getDocumento());
        return repository.save(user);
    }
}
