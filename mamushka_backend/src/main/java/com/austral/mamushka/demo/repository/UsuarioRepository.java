package com.austral.mamushka.demo.repository;

import com.austral.mamushka.demo.model.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface UsuarioRepository<usuario> extends MongoRepository<Usuario, String> {

    List<Usuario> findUsuarioByNombre(String nombre);

}


