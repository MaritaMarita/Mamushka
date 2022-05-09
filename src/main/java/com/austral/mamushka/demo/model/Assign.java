package com.austral.mamushka.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "asignaciones")
public class Assign {
    @Id
    private Integer id;
    private Usuario usuario;
    private Tarea tarea;
    private boolean estado;

    public Assign() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Tarea getTarea() {
        return tarea;
    }

    public void setTarea(Tarea tarea) {
        this.tarea = tarea;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Assign{" +
                "id=" + id +
                ", usuario=" + usuario +
                ", tarea=" + tarea +
                ", estado=" + estado +
                '}';
    }
}