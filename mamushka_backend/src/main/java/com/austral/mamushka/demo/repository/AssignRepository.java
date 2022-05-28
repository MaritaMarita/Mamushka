package com.austral.mamushka.demo.repository;

import com.austral.mamushka.demo.model.Assign;
import com.austral.mamushka.demo.model.Estado;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AssignRepository<assign> extends MongoRepository<Assign, assign> {

    List<Assign> findAllByEstado(Estado estado);
}
