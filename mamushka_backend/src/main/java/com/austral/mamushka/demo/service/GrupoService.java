package com.austral.mamushka.demo.service;

import com.austral.mamushka.demo.model.Grupo;
import com.austral.mamushka.demo.repository.GrupoRepository;
import com.sun.xml.bind.v2.model.core.ID;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GrupoService {

    private final GrupoRepository grupoRepository;

    public GrupoService(GrupoRepository grupoRepository) { this.grupoRepository = grupoRepository;}

    public Grupo agregar(Grupo grupo) { return (Grupo) grupoRepository.save(grupo);}

    public List<Grupo> listar() { return grupoRepository.findAll();}

    public Iterable<Grupo> findById(
            Iterable<ID> ids
    ) {
        return null;
    }
}
