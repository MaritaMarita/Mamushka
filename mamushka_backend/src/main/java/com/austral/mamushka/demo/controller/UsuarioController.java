package com.austral.mamushka.demo.controller;

import com.austral.mamushka.demo.model.Assign;
import com.austral.mamushka.demo.model.Usuario;
import com.austral.mamushka.demo.service.UsuarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")

public class UsuarioController {

    private UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) { this.usuarioService = usuarioService;
    }
    //@Operation(summary = "registramos un nuevo usuario")

    @PostMapping
    public Usuario registrar(@RequestBody Usuario usuario){
        return usuarioService.agregar(usuario);
    }
    //@Operation(summary = "listamos los usuarios")

    @GetMapping
    public List<Usuario> listar(){
        return usuarioService.listar();
    }

    /*
    @GetMapping
    public List<Usuario> usuarios_por_id(){ return usuarioService.usuarios_por_id();
    }
     */
}
