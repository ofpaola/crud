package br.com.crud.usuarios.repository;

import br.com.crud.usuarios.external.model.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UsuarioRepository extends MongoRepository<Usuario, String> {

    Optional<Usuario> findByDocumento(String documento);
}
