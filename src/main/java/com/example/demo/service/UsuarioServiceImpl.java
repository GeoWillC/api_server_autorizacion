package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
//Importacion estatica
import static java.util.Collections.EMPTY_LIST;

import com.example.demo.repository.IUsuarioRepository;
import com.example.demo.repository.modelo.Usuario;

@Service
public class UsuarioServiceImpl implements UserDetailsService {


    @Autowired
    private IUsuarioRepository iUsuarioRepository;
    
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario=this.iUsuarioRepository.consultarPorNombre(username);
        
       return  new User(usuario.getNombre(),usuario.getPassword(),EMPTY_LIST) ;
    }
}
