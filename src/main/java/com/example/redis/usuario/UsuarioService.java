package com.example.redis.usuario;

import lombok.AllArgsConstructor;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public Usuario saveUsuario(Usuario usuario){
         return usuarioRepository.save(usuario);
    }

    @Cacheable(value = "usuarioCache")
    public List<Usuario> findAll(){
        System.out.println("chamou");
        return usuarioRepository.findAll();
    }
}
