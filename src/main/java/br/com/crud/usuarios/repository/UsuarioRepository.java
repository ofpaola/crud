package br.com.crud.usuarios.repository;

import br.com.crud.usuarios.external.model.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsuarioRepository extends MongoRepository<Usuario, String> {

}
