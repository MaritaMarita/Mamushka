package com.austral.mamushka.demo.controller;

import com.austral.mamushka.demo.model.Grupo;
import com.austral.mamushka.demo.service.GrupoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/grupos")

public class GrupoController {

    private GrupoService grupoService;

    public GrupoController(GrupoService grupoService) { this.grupoService = grupoService;
    }

    @PostMapping
    public Grupo registrar(@RequestBody Grupo grupo) { return grupoService.agregar(grupo);}

    @GetMapping
    public List<Grupo> listar() {return grupoService.listar();}

}
