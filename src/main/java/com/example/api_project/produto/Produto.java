package com.example.api_project.produto;

import java.sql.Date;

import jakarta.persistence.*;


@Entity
@Table(name = "PRODUTOS")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "produto_seq_generator")
    @SequenceGenerator(name = "produto_seq_generator", sequenceName = "produto_seq", allocationSize = 1)
    @Column(name = "id")
    private int id;

    @Column(name = "codigo_produto")
    private String codigoProduto;

    @Column(name = "referencia_produto")
    private String referenciaProduto;

    @Column(name = "nome")
    private String nome;

    @Lob
    @Column(name = "descricao")
    private String descricao;

    @Lob
    @Column(name = "imagem")
    private byte[] imagem;

    @Column(name = "data_criacao")
    private Date dataCriacao;

    @Column(name = "data_atualizacao")
    private Date dataAtualizacao;

    @Column(name = "custo")
    private Double custo;

    @Column(name = "preco")
    private Double preco;

    //Construtor padrão
    public Produto() {
    }

    // Construtor com parâmetros
    public Produto(String codigoProduto, String referenciaProduto, String nome, String descricao, byte[] imagem,
                  Date dataCriacao, Date dataAtualizacao, Double custo, Double preco) {
        this.codigoProduto = codigoProduto;
        this.referenciaProduto = referenciaProduto;
        this.nome = nome;
        this.descricao = descricao;
        this.imagem = imagem;
        this.dataCriacao = dataCriacao;
        this.dataAtualizacao = dataAtualizacao;
        this.custo = custo;
        this.preco = preco;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(String codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public String getReferenciaProduto() {
        return referenciaProduto;
    }

    public void setReferenciaProduto(String referenciaProduto) {
        this.referenciaProduto = referenciaProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public byte[] getImagem() {
        return imagem;
    }

    public void setImagem(byte[] imagem) {
        this.imagem = imagem;
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

    public Double getCusto() {
        return custo;
    }

    public void setCusto(Double custo) {
        this.custo = custo;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
