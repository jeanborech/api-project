package com.example.api_project.produto;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
    // Métodos personalizados podem ser adicionados aqui
}