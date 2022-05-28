package com.austral.mamushka.demo.controller;

import com.austral.mamushka.demo.model.Assign;
import com.austral.mamushka.demo.service.AssignService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/asignaciones")

public class AssignController {
    private AssignService assignService;

    public AssignController(AssignService assignService) {
        this.assignService = assignService;
    }
    //@Operation(summary = "registramos una nueva asignación")

    @PostMapping
    public Assign registrar(@RequestBody Assign assign){
        return assignService.agregar(assign);
    }
    //@Operation(summary = "listamos las asignaciones")

    @GetMapping
    public List<Assign> listar(){
        return assignService.listar();
    }

    @GetMapping("/ahora")
    public List<Assign> asignaciones_en_curso(){
        return assignService.asignaciones_en_curso();
    }
}
