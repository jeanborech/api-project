package com.example.api_project.pedidovenda;

import java.sql.Timestamp;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "PEDIDO_VENDA")
public class PedidoVenda {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "numero_pedido")
    private String numeroPedido;

    @Column(name = "data_pedido")
    private java.util.Date dataPedido;

    @Column(name = "cliente_id")
    private Long clienteId;

    @Column(name = "produto_id")
    private Long produtoId;

    @Column(name = "quantidade")
    private Long quantidade;

    @Column(name = "valor_total")
    private Double valorTotal;

    @Column(name = "data_criacao")
    private java.sql.Timestamp dataCriacao;

    // Construtor padrão
    public PedidoVenda() {
    }

	public PedidoVenda(Long id, String numeroPedido, Date dataPedido, Long clienteId, Long produtoId, Long quantidade,
			Double valorTotal, Timestamp dataCriacao) {
		super();
		this.id = id;
		this.numeroPedido = numeroPedido;
		this.dataPedido = dataPedido;
		this.clienteId = clienteId;
		this.produtoId = produtoId;
		this.quantidade = quantidade;
		this.valorTotal = valorTotal;
		this.dataCriacao = dataCriacao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumeroPedido() {
		return numeroPedido;
	}

	public void setNumeroPedido(String numeroPedido) {
		this.numeroPedido = numeroPedido;
	}

	public java.util.Date getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(java.util.Date dataPedido) {
		this.dataPedido = dataPedido;
	}

	public Long getClienteId() {
		return clienteId;
	}

	public void setClienteId(Long clienteId) {
		this.clienteId = clienteId;
	}

	public Long getProdutoId() {
		return produtoId;
	}

	public void setProdutoId(Long produtoId) {
		this.produtoId = produtoId;
	}

	public Long getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Long quantidade) {
		this.quantidade = quantidade;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public java.sql.Timestamp getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(java.sql.Timestamp dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

    
    
}
