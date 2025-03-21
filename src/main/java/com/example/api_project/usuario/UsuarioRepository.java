package com.example.api_project.usuario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    // Métodos personalizados podem ser adicionados aqui
}
