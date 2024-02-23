package com.example.demo.service.to;


import java.io.Serializable;

import org.springframework.hateoas.RepresentationModel;

public class UsuarioTO extends RepresentationModel<UsuarioTO> implements Serializable {
    private static final long serialVersionUID = 1L;
    private String nombre;
    private String password;


    //SET Y GET 
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    
}
