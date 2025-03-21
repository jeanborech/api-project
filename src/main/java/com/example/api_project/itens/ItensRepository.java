package com.example.api_project.itens;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ItensRepository extends JpaRepository<Itens, Integer> {
    // Métodos personalizados podem ser adicionados aqui
}
