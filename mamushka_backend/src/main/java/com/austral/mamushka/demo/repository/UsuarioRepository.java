package com.austral.mamushka.demo.repository;

import com.austral.mamushka.demo.model.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


import javax.persistence.Id;
import java.util.List;

@Repository
public interface UsuarioRepository<usuario> extends MongoRepository<Usuario, usuario> {

    // List<Usuario> findById(Id);
}


