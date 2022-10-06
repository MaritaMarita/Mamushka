package com.austral.mamushka.demo.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "grupos")
public class Grupo {
    @Id
    private String id;
    private String nombre;

    private List<Tarea> tareaList;

    // private List<Usuario> usuarioList; // EN LUGAR DE PASAR UNA LISTA DE USUARIOS con todos los datos, pasamos
    // un DTO que lleva solo el nombre del usuario
    private List<DTOusuarioNombre> DTOusuarioNombreList;




    public Grupo() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    /*public List<Usuario> getUsuarioList() {
        return usuarioList;
    }

    public void setUsuarioList(List<Usuario> usuarioList) {
        this.usuarioList = usuarioList;
    }
*/

    public List<DTOusuarioNombre> getDTOusuarioNombreList() {
        return DTOusuarioNombreList;
    }

    public void setDTOusuarioNombreList(List<DTOusuarioNombre> DTOusuarioNombreList) {
        this.DTOusuarioNombreList = DTOusuarioNombreList;
    }

    public List<Tarea> getTareaList() {
        return tareaList;
    }

    public void setTareaList(List<Tarea> tareaList) {
        this.tareaList = tareaList;
    }

    @Override
    public String toString() {
        return "Grupo{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", tareaList=" + tareaList +
                ", DTOusuarioNombreList=" + DTOusuarioNombreList +
                '}';
    }
}
