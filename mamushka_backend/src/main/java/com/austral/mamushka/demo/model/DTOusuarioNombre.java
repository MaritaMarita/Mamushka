package com.austral.mamushka.demo.model;
import java.io.Serializable;

public class DTOusuarioNombre implements Serializable {

    private String nombreUsuario;

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
}
