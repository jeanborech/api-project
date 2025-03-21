package com.example.api_project.usuario;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "USUARIO")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usuario_seq_generator")
    @SequenceGenerator(name = "usuario_seq_generator", sequenceName = "usuario_seq", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "id_cadastro_empresa")
    private int idCadastroEmpresa;

    @Column(name = "nome")
    private String nome;

    @Column(name = "email")
    private String email;

    @Column(name = "senha")
    private String senha;

    @Column(name = "data_nascimento")
    @Temporal(TemporalType.DATE)
    private Date dataNascimento;

    @Column(name = "data_criacao")
    @Temporal(TemporalType.DATE)
    private Date dataCriacao;

    @Column(name = "ultimo_login")
    @Temporal(TemporalType.DATE)
    private Date ultimoLogin;

    @Column(name = "status")
    private int status;

    // Construtor padrão
    public Usuario() {
    }

    // Construtor com parâmetros
    public Usuario(int idCadastroEmpresa, String nome, String email, String senha, Date dataNascimento, Date dataCriacao, Date ultimoLogin, int status) {
        this.idCadastroEmpresa = idCadastroEmpresa;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.dataNascimento = dataNascimento;
        this.dataCriacao = dataCriacao;
        this.ultimoLogin = ultimoLogin;
        this.status = status;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCadastroEmpresa() {
        return idCadastroEmpresa;
    }

    public void setIdCadastroEmpresa(int idCadastroEmpresa) {
        this.idCadastroEmpresa = idCadastroEmpresa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Date getUltimoLogin() {
        return ultimoLogin;
    }

    public void setUltimoLogin(Date ultimoLogin) {
        this.ultimoLogin = ultimoLogin;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}