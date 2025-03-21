package com.example.api_project.cadastroempresa;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CadastroEmpresaRepository extends JpaRepository<CadastroEmpresa, Integer> {
    // Métodos personalizados podem ser adicionados aqui
}