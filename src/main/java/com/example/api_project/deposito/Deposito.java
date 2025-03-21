package com.example.api_project.deposito;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "DEPOSITO")
public class Deposito {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "deposito_seq_generator")
    @SequenceGenerator(name = "deposito_seq_generator", sequenceName = "deposito_seq", allocationSize = 1)
    @Column(name = "id_deposito")
    private int idDeposito;

    @Column(name = "nome_deposito")
    private String nomeDeposito;

    @Column(name = "endereco_deposito")
    private String enderecoDeposito;

    @Column(name = "capacidade")
    private int capacidade;

    @Column(name = "tipo_deposito")
    private String tipoDeposito;

    @Column(name = "data_criacao")
    @Temporal(TemporalType.DATE)
    private Date dataCriacao;

    @Column(name = "data_atualizacao")
    @Temporal(TemporalType.DATE)
    private Date dataAtualizacao;

    @Column(name = "status_deposito")
    private int statusDeposito;

    @Column(name = "id_cadastro_empresa")
    private int idCadastroEmpresa;

    @Column(name = "responsavel_deposito")
    private int responsavelDeposito;

    @Column(name = "telefone_contato")
    private String telefoneContato;

    @Column(name = "email_contato")
    private String emailContato;

    // Construtor padrão
    public Deposito() {
    }

    // Construtor com parâmetros
    public Deposito(String nomeDeposito, String enderecoDeposito, int capacidade, String tipoDeposito, Date dataCriacao, Date dataAtualizacao, int statusDeposito, int idCadastroEmpresa, int responsavelDeposito, String telefoneContato, String emailContato) {
        this.nomeDeposito = nomeDeposito;
        this.enderecoDeposito = enderecoDeposito;
        this.capacidade = capacidade;
        this.tipoDeposito = tipoDeposito;
        this.dataCriacao = dataCriacao;
        this.dataAtualizacao = dataAtualizacao;
        this.statusDeposito = statusDeposito;
        this.idCadastroEmpresa = idCadastroEmpresa;
        this.responsavelDeposito = responsavelDeposito;
        this.telefoneContato = telefoneContato;
        this.emailContato = emailContato;
    }

    // Getters e Setters
    public int getIdDeposito() {
        return idDeposito;
    }

    public void setIdDeposito(int idDeposito) {
        this.idDeposito = idDeposito;
    }

    public String getNomeDeposito() {
        return nomeDeposito;
    }

    public void setNomeDeposito(String nomeDeposito) {
        this.nomeDeposito = nomeDeposito;
    }

    public String getEnderecoDeposito() {
        return enderecoDeposito;
    }

    public void setEnderecoDeposito(String enderecoDeposito) {
        this.enderecoDeposito = enderecoDeposito;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String getTipoDeposito() {
        return tipoDeposito;
    }

    public void setTipoDeposito(String tipoDeposito) {
        this.tipoDeposito = tipoDeposito;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Date getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setDataAtualizacao(Date dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }

    public int getStatusDeposito() {
        return statusDeposito;
    }

    public void setStatusDeposito(int statusDeposito) {
        this.statusDeposito = statusDeposito;
    }

    public int getIdCadastroEmpresa() {
        return idCadastroEmpresa;
    }

    public void setIdCadastroEmpresa(int idCadastroEmpresa) {
        this.idCadastroEmpresa = idCadastroEmpresa;
    }

    public int getResponsavelDeposito() {
        return responsavelDeposito;
    }

    public void setResponsavelDeposito(int responsavelDeposito) {
        this.responsavelDeposito = responsavelDeposito;
    }

    public String getTelefoneContato() {
        return telefoneContato;
    }

    public void setTelefoneContato(String telefoneContato) {
        this.telefoneContato = telefoneContato;
    }

    public String getEmailContato() {
        return emailContato;
    }

    public void setEmailContato(String emailContato) {
        this.emailContato = emailContato;
    }
}
