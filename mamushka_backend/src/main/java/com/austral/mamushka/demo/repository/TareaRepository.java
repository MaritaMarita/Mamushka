package com.austral.mamushka.demo.repository;

import com.austral.mamushka.demo.model.Tarea;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


import javax.persistence.Id;
import java.util.List;

@Repository
public interface TareaRepository<tarea> extends MongoRepository<Tarea, tarea> {

    // List<Tarea> findById(Id);
}

