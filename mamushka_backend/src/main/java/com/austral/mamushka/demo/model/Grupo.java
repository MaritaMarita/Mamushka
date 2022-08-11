package com.austral.mamushka.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "grupos")
public class Grupo {
    @Id
    private String id;
    private String nombre;
    private List<Usuario> usuarioList;
    private List<Tarea> tareaList;
    private List<Assign> assignList;


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

    public List<Usuario> getUsuarioList() {
        return usuarioList;
    }

    public void setUsuarioList(List<Usuario> usuarioList) {
        this.usuarioList = usuarioList;
    }

    public List<Tarea> getTareaList() {
        return tareaList;
    }

    public void setTareaList(List<Tarea> tareaList) {
        this.tareaList = tareaList;
    }

    public List<Assign> getAssignList() {
        return assignList;
    }

    public void setAssignList(List<Assign> assignList) {
        this.assignList = assignList;
    }

    @Override
    public String toString() {
        return "Grupo{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", usuarioList=" + usuarioList +
                ", tareaList=" + tareaList +
                ", assignList=" + assignList +
                '}';
    }
}
