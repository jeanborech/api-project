package com.example.api_project.deposito;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class DepositoService {

    @Autowired
    private DepositoRepository depositoRepository;

    // Método para listar todos os depósitos
    public List<Deposito> listarTodosDepositos() {
        return depositoRepository.findAll();
    }

    // Método para criar um novo depósito
    public Deposito criarDeposito(String nomeDeposito, String enderecoDeposito, int capacidade, String tipoDeposito, Date dataCriacao, Date dataAtualizacao, int statusDeposito, int idCadastroEmpresa, int responsavelDeposito, String telefoneContato, String emailContato) {
        // Validações básicas
        if (nomeDeposito == null || nomeDeposito.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome do depósito é obrigatório.");
        }
        if (enderecoDeposito == null || enderecoDeposito.trim().isEmpty()) {
            throw new IllegalArgumentException("Endereço do depósito é obrigatório.");
        }

        // Criação do objeto Deposito
        Deposito deposito = new Deposito();
        deposito.setNomeDeposito(nomeDeposito);
        deposito.setEnderecoDeposito(enderecoDeposito);
        deposito.setCapacidade(capacidade);
        deposito.setTipoDeposito(tipoDeposito);
        deposito.setDataCriacao(dataCriacao);
        deposito.setDataAtualizacao(dataAtualizacao);
        deposito.setStatusDeposito(statusDeposito);
        deposito.setIdCadastroEmpresa(idCadastroEmpresa);
        deposito.setResponsavelDeposito(responsavelDeposito);
        deposito.setTelefoneContato(telefoneContato);
        deposito.setEmailContato(emailContato);

        return depositoRepository.save(deposito);
    }

    // Método para atualizar um depósito existente
    public Deposito atualizarDeposito(int idDeposito, String nomeDeposito, String enderecoDeposito, int capacidade, String tipoDeposito, Date dataAtualizacao, int statusDeposito, int responsavelDeposito, String telefoneContato, String emailContato) {
        Deposito deposito = depositoRepository.findById(idDeposito)
                .orElseThrow(() -> new IllegalArgumentException("Depósito não encontrado"));

        if (nomeDeposito != null) deposito.setNomeDeposito(nomeDeposito);
        if (enderecoDeposito != null) deposito.setEnderecoDeposito(enderecoDeposito);
        if (capacidade > 0) deposito.setCapacidade(capacidade);
        if (tipoDeposito != null) deposito.setTipoDeposito(tipoDeposito);
        if (dataAtualizacao != null) deposito.setDataAtualizacao(dataAtualizacao);
        deposito.setStatusDeposito(statusDeposito);
        if (responsavelDeposito > 0) deposito.setResponsavelDeposito(responsavelDeposito);
        if (telefoneContato != null) deposito.setTelefoneContato(telefoneContato);
        if (emailContato != null) deposito.setEmailContato(emailContato);

        return depositoRepository.save(deposito);
    }
}
