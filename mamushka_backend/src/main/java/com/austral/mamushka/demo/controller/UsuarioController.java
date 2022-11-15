package com.austral.mamushka.demo.controller;

import com.austral.mamushka.demo.model.Usuario;
import com.austral.mamushka.demo.service.UsuarioService;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@CrossOrigin({"http://localhost:19006/"})
@RestController
@RequestMapping("/usuarios")

public class UsuarioController {

    private static UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) { this.usuarioService = usuarioService;
    }


    @Transactional
    @PostMapping
    public Usuario registrar(@RequestBody Usuario usuario){
        return usuarioService.agregar(usuario);
    }

    @GetMapping
    public List<Usuario> listar(){
        return usuarioService.listar();
    }

    @GetMapping(value="/byNombre/{nombre}")
    @ResponseBody
    public List<Usuario> listByNombre (@PathVariable("nombre") String nombre){
        return usuarioService.listarUsuarioNombre(nombre);
    }

    @DeleteMapping
    public Usuario delete (@RequestBody Usuario usuario){
        return usuarioService.remove(usuario);
    }

}
