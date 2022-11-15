package com.austral.mamushka.demo.service;

import com.austral.mamushka.demo.model.Usuario;
import com.austral.mamushka.demo.repository.UsuarioRepository;
import com.sun.xml.bind.v2.model.core.ID;
import org.springframework.stereotype.Service;

import javax.persistence.Id;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    private static UsuarioRepository usuarioRepository = null;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario agregar(Usuario usuario){
        return (Usuario) usuarioRepository.save(usuario);
    }

    public List<Usuario> listar(){
        return usuarioRepository.findAll();
    }

    public static List<Usuario> listarUsuarioNombre(String nombre) {
        return usuarioRepository.findUsuarioByNombre(nombre);
    }

    public static Usuario remove(Usuario usuario) {
        usuarioRepository.delete(usuario);
        return usuario;
    }


    public Iterable<Usuario> findById(
            Iterable<ID> ids
    ) {
        return null;
    }

}
