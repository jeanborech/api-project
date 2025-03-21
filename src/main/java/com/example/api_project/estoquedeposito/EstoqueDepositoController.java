package com.example.api_project.estoquedeposito;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/estoque-deposito")
public class EstoqueDepositoController {

    @Autowired
    private EstoqueDepositoService estoqueDepositoService;

    // Endpoint para listar todos os estoques
    @GetMapping
    public ResponseEntity<List<EstoqueDeposito>> listarTodosEstoques() {
        List<EstoqueDeposito> estoques = estoqueDepositoService.listarTodosEstoques();
        return ResponseEntity.ok(estoques);
    }

    // Endpoint para criar um novo estoque
    @PostMapping
    public ResponseEntity<EstoqueDeposito> criarEstoqueDeposito(
            @RequestParam("idDeposito") int idDeposito, // Alterado para int
            @RequestParam("idProduto") int idProduto, // Alterado para int
            @RequestParam("quantidadeEstoque") int quantidadeEstoque, // Alterado para int
            @RequestParam(value = "dataUltimaAtualizacao", required = false) @DateTimeFormat(pattern = "yyyy-MM-dd") Date dataUltimaAtualizacao) {

        try {
            // Se a data não for fornecida, usa a data atual
            if (dataUltimaAtualizacao == null) {
                dataUltimaAtualizacao = new Date();
            }

            // Chama o serviço para criar o estoque
            EstoqueDeposito novoEstoque = estoqueDepositoService.criarEstoqueDeposito(
                    idDeposito, idProduto, quantidadeEstoque, dataUltimaAtualizacao);
            return ResponseEntity.status(201).body(novoEstoque);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(null); // Retorna 400 em caso de erro de validação
        } catch (Exception e) {
            return ResponseEntity.status(500).body(null); // Retorna 500 em caso de erro inesperado
        }
    }

    // Endpoint para atualizar um estoque existente
    @PutMapping
    public ResponseEntity<EstoqueDeposito> atualizarEstoqueDeposito(
            @RequestParam("idDeposito") int idDeposito, // Alterado para int
            @RequestParam("idProduto") int idProduto, // Alterado para int
            @RequestParam("quantidadeEstoque") int quantidadeEstoque,
            @RequestParam(value = "dataUltimaAtualizacao", required = false) @DateTimeFormat(pattern = "yyyy-MM-dd") Date dataUltimaAtualizacao) {

        try {
            // Chama o serviço para atualizar o estoque
            EstoqueDeposito estoqueAtualizado = estoqueDepositoService.atualizarEstoqueDeposito(
                    idDeposito, idProduto, quantidadeEstoque, dataUltimaAtualizacao);
            return ResponseEntity.ok(estoqueAtualizado);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(null); // Retorna 400 em caso de erro de validação
        } catch (Exception e) {
            return ResponseEntity.status(500).body(null); // Retorna 500 em caso de erro inesperado
        }
    }
}
