package com.example.api_project.estoquedeposito;

import com.example.api_project.deposito.Deposito;
import com.example.api_project.produto.Produto;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ESTOQUE_DEPOSITO")
public class EstoqueDeposito {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "estoque_deposito_seq_generator")
    @SequenceGenerator(name = "estoque_deposito_seq_generator", sequenceName = "estoque_deposito_seq", allocationSize = 1)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "id_deposito")
    private Deposito deposito;

    @ManyToOne
    @JoinColumn(name = "id_produto")
    private Produto produto;

    @Column(name = "quantidade_estoque")
    private int quantidadeEstoque;

    @Column(name = "data_ultima_atualizacao")
    @Temporal(TemporalType.DATE)
    private Date dataUltimaAtualizacao;

    // Construtor padrão
    public EstoqueDeposito() {
    }

    // Construtor com parâmetros
    public EstoqueDeposito(Deposito deposito, Produto produto, int quantidadeEstoque, Date dataUltimaAtualizacao) {
        this.deposito = deposito;
        this.produto = produto;
        this.quantidadeEstoque = quantidadeEstoque;
        this.dataUltimaAtualizacao = dataUltimaAtualizacao;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Deposito getDeposito() {
        return deposito;
    }

    public void setDeposito(Deposito deposito) {
        this.deposito = deposito;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public Date getDataUltimaAtualizacao() {
        return dataUltimaAtualizacao;
    }

    public void setDataUltimaAtualizacao(Date dataUltimaAtualizacao) {
        this.dataUltimaAtualizacao = dataUltimaAtualizacao;
    }
}