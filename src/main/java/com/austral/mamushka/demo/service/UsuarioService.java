package com.austral.mamushka.demo.service;

import com.austral.mamushka.demo.model.Usuario;
import com.austral.mamushka.demo.repository.UsuarioRepository;
import com.sun.xml.bind.v2.model.core.ID;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario agregar(Usuario usuario){
        return (Usuario) usuarioRepository.save(usuario);
    }

    public List<Usuario> listar(){
        return usuarioRepository.findAll();
    }

    // public List<Usuario> usuarios_por_id(){
        //return usuarioRepository.findById(Usuario);}

    public Iterable<Usuario> findById(
            Iterable<ID> ids
    ) {
        return null;
    }


}
