package com.austral.mamushka.demo.service;

import com.austral.mamushka.demo.model.Usuario;
import com.austral.mamushka.demo.repository.UsuarioRepository;
import com.sun.xml.bind.v2.model.core.ID;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public Optional usuario_por_id(){
        return usuarioRepository.findById(Id);}

    public Iterable<Usuario> findById(
            Iterable<ID> ids
    ) {
        return null;
    }

}
