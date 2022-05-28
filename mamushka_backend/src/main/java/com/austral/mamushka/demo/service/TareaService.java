package com.austral.mamushka.demo.service;

import com.austral.mamushka.demo.model.Tarea;
import com.austral.mamushka.demo.repository.TareaRepository;
import com.sun.xml.bind.v2.model.core.ID;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TareaService {

    private final TareaRepository tareaRepository;

    public TareaService(TareaRepository tareaRepository) {
        this.tareaRepository = tareaRepository;
    }

    public Tarea agregar(Tarea tarea){
        return (Tarea) tareaRepository.save(tarea);
    }

    public List<Tarea> listar(){
        return tareaRepository.findAll();
    }

    // public List<Tarea> tarea_por_id(){
    //return tareaRepository.findById(Tarea);}

    public Iterable<Tarea> findById(
            Iterable<ID> ids
    ) {
        return null;
    }


}

