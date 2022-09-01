package com.austral.mamushka.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "tareas")
public class Tarea {
    @Id
    private String id;
    private String nombre;
    private String description;
    private Integer score;

    private Estado estado;

    public Tarea() {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Estado getEstado() { return estado; }
    public void setEstado(Estado estado) { this.estado = estado; }

    @Override
    public String toString() {
        return "Tarea{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", description='" + description + '\'' +
                ", score=" + score +
                ", estado=" + estado +
                '}';
    }
}


