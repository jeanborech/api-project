package com.example.api_project.estoquedeposito;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstoqueDepositoRepository extends JpaRepository<EstoqueDeposito, Integer> {
    // Método para refletir os nomes das propriedades
    Optional<EstoqueDeposito> findByDepositoIdDepositoAndProdutoId(int depositoId, int produtoId);
}