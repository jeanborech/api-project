package com.example.api_project.pedidocompra;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "PEDIDO_COMPRA")
public class PedidoCompra {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "numero_pedido")
    private String numeroPedido;

    @Column(name = "data_pedido")
    private java.util.Date dataPedido;

    @Column(name = "fornecedor")
    private Long fornecedor;

    @Column(name = "produto_id")
    private Long produtoId;

    // Construtor padrão
    public PedidoCompra() {
    }

	public PedidoCompra(Long id, String numeroPedido, Date dataPedido, Long fornecedor, Long produtoId) {
		super();
		this.id = id;
		this.numeroPedido = numeroPedido;
		this.dataPedido = dataPedido;
		this.fornecedor = fornecedor;
		this.produtoId = produtoId;
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

	public Long getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Long fornecedor) {
		this.fornecedor = fornecedor;
	}

	public Long getProdutoId() {
		return produtoId;
	}

	public void setProdutoId(Long produtoId) {
		this.produtoId = produtoId;
	}

    
    
}
