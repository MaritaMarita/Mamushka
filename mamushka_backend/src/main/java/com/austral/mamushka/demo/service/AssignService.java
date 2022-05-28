package com.austral.mamushka.demo.service;

import com.austral.mamushka.demo.model.Assign;
import com.austral.mamushka.demo.model.Estado;
import org.springframework.stereotype.Service;
import com.austral.mamushka.demo.repository.AssignRepository;

import java.util.List;

@Service
public class AssignService {

    private final AssignRepository assignRepository;

    public AssignService(AssignRepository assignRepository) {
        this.assignRepository = assignRepository;
    }

    public Assign agregar(Assign assign){
        return (Assign) assignRepository.save(assign);
    }

    public List<Assign> listar(){
        return assignRepository.findAll();
    }

    public List<Assign> asignaciones_en_curso(){
        return assignRepository.findAllByEstado(Estado.PENDIENTE);
    }
}
