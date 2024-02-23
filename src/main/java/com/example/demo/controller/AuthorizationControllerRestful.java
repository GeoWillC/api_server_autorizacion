package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.security.JwUtils;
import com.example.demo.service.to.UsuarioTO;

@RestController
@RequestMapping(path = "/autorizaciones")
public class AuthorizationControllerRestful {

    @Autowired 
    private JwUtils jwt;
        //Autorizacion 
        //Validar que el usuario y el password sean correctos

        @GetMapping(path = "/jwt")
        public String obtenerToken(@RequestBody UsuarioTO usuario){
            
            return this.jwt.buildTokenJwt(usuario.getNombre());
        }
    
}