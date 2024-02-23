package com.example.demo.security;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

/**
 * JwUtils
 */
@Component
public class JwUtils {

    @Value("${app.jwtSemilla}")
    private String jwtSemilla;
    @Value("${app.jwtExpirationMs}")
    private String jwtExpirationMs;

    public String buildTokenJwt(String nombre) {
        // Expira luego de un tiempo
        return Jwts.builder().setSubject(nombre).setSubject("Hola mundo").setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + this.jwtExpirationMs))
                .signWith(SignatureAlgorithm.HS512, this.jwtSemilla).compact();
    }
}