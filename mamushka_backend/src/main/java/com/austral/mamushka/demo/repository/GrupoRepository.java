package com.austral.mamushka.demo.repository;

import com.austral.mamushka.demo.model.Grupo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GrupoRepository<grupo> extends MongoRepository<Grupo, String> {
}

