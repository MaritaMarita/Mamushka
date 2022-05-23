package com.austral.mamushka.demo.controller;

import com.austral.mamushka.demo.model.Tarea;
import com.austral.mamushka.demo.service.TareaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tareas")

public class TareaController {

    private TareaService tareaService;

    public TareaController(TareaService tareaService) { this.tareaService = tareaService;
    }
    //@Operation(summary = "registramos una nueva tarea")

    @PostMapping
    public Tarea registrar(@RequestBody Tarea tarea){
        return tareaService.agregar(tarea);
    }
    //@Operation(summary = "listamos las tareas")

    @GetMapping
    public List<Tarea> listar(){
        return tareaService.listar();
    }

    /*
    @GetMapping
    public List<Tarea> tareas_por_id(){return tareaService.tareas_por_id();
    }
     */

}
