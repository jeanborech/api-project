package com.example.api_project.deposito;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/deposito")
public class DepositoController {

    @Autowired
    private DepositoService depositoService;

    // Endpoint para listar todos os depósitos
    @GetMapping
    public ResponseEntity<List<Deposito>> listarTodosDepositos() {
        List<Deposito> depositos = depositoService.listarTodosDepositos();
        return ResponseEntity.ok(depositos);
    }

    // Endpoint para criar um novo depósito
    @PostMapping
    public ResponseEntity<Deposito> criarDeposito(
            @RequestParam("nomeDeposito") String nomeDeposito,
            @RequestParam("enderecoDeposito") String enderecoDeposito,
            @RequestParam("capacidade") int capacidade,
            @RequestParam("tipoDeposito") String tipoDeposito,
            @RequestParam("dataCriacao") @DateTimeFormat(pattern = "yyyy-MM-dd") Date dataCriacao,
            @RequestParam(value = "dataAtualizacao", required = false) @DateTimeFormat(pattern = "yyyy-MM-dd") Date dataAtualizacao,
            @RequestParam("statusDeposito") int statusDeposito,
            @RequestParam("idCadastroEmpresa") int idCadastroEmpresa,
            @RequestParam("responsavelDeposito") int responsavelDeposito,
            @RequestParam(value = "telefoneContato", required = false) String telefoneContato,
            @RequestParam(value = "emailContato", required = false) String emailContato) {

        try {
            Deposito novoDeposito = depositoService.criarDeposito(
                    nomeDeposito, enderecoDeposito, capacidade, tipoDeposito, dataCriacao, dataAtualizacao, statusDeposito, idCadastroEmpresa, responsavelDeposito, telefoneContato, emailContato);
            return ResponseEntity.status(201).body(novoDeposito);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(null);
        } catch (Exception e) {
            return ResponseEntity.status(500).body(null);
        }
    }

    // Endpoint para atualizar um depósito existente
    @PutMapping("/{idDeposito}")
    public ResponseEntity<Deposito> atualizarDeposito(
            @PathVariable int idDeposito,
            @RequestParam(value = "nomeDeposito", required = false) String nomeDeposito,
            @RequestParam(value = "enderecoDeposito", required = false) String enderecoDeposito,
            @RequestParam(value = "capacidade", required = false) Integer capacidade,
            @RequestParam(value = "tipoDeposito", required = false) String tipoDeposito,
            @RequestParam(value = "dataAtualizacao", required = false) @DateTimeFormat(pattern = "yyyy-MM-dd") Date dataAtualizacao,
            @RequestParam(value = "statusDeposito", required = false) Integer statusDeposito,
            @RequestParam(value = "responsavelDeposito", required = false) Integer responsavelDeposito,
            @RequestParam(value = "telefoneContato", required = false) String telefoneContato,
            @RequestParam(value = "emailContato", required = false) String emailContato) {

        try {
            Deposito depositoAtualizado = depositoService.atualizarDeposito(
                    idDeposito, nomeDeposito, enderecoDeposito, capacidade, tipoDeposito, dataAtualizacao, statusDeposito, responsavelDeposito, telefoneContato, emailContato);
            return ResponseEntity.ok(depositoAtualizado);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(null);
        } catch (Exception e) {
            return ResponseEntity.status(500).body(null);
        }
    }
}