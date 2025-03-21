package com.example.api_project.deposito;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DepositoRepository extends JpaRepository<Deposito, Integer> {
    // Métodos personalizados podem ser adicionados aqui
}