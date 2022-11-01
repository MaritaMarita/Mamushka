package com.austral.mamushka.demo.service;

import com.austral.mamushka.demo.controller.UsuarioController;
import com.austral.mamushka.demo.model.DTOusuarioNombre;
import com.austral.mamushka.demo.model.Grupo;
import com.austral.mamushka.demo.model.Tarea;
import com.austral.mamushka.demo.model.Usuario;
import com.austral.mamushka.demo.repository.GrupoRepository;
import com.sun.istack.NotNull;
import com.sun.xml.bind.v2.model.core.ID;
import org.apache.catalina.connector.Response;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.persistence.Id;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class GrupoService {

    private final GrupoRepository grupoRepository;

    public GrupoService(GrupoRepository grupoRepository) { this.grupoRepository = grupoRepository;}

    public Grupo agregar(Grupo grupo) { return (Grupo) grupoRepository.save(grupo);}

    public List<Grupo> listar() {
        return grupoRepository.findAll();
    }

    public List<DTOusuarioNombre> listarUsuarios() {
        return grupoRepository.findAll().stream().map(this.convertEntityToDto(Usuaripepe2)).collect(Collectors.toList());

    }

    public Iterable<Grupo> findById(
            Iterable<ID> ids
    ) {
        return null;
    }

    private DTOusuarioNombre convertEntityToDto(Usuario pepe1) {

        //Create dto
        DTOusuarioNombre dto = new DTOusuarioNombre();
        dto.setNombreUsuario(pepe1.getNombreUsuario());

        //Return DTO
        return dto;
    }
}

/*
    private Response findCustomer(("customerId") Long customerId) {
        Customer customer = customerDAO.findCustomerById(customerId);
        Address address = customerDAO.findAddressByCustomer(customerId);

        //Create dto
        CustomerDTO dto = new CustomerDTO();
        dto.setAddress(address.getAddress());
        dto.setCountry(address.getCountry());
        dto.setZipCode(address.getZipCode());
        dto.setFullName(customer.getFirstname() + " " + customer.getLastname());
        dto.setId(customer.getId());

        //Return DTO
        return Response.ok(dto, MediaType.APPLICATION_JSON).build();
    }
}
*/