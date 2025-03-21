package com.example.api_project.clienteproduto;

import java.security.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CLIENTE_PRODUTO")
public class ClienteProduto {

    @Id
    @Column(name = "id_cliente")
    private Long id_cliente;

    @Column(name = "id_produto")
    private Long id_produto;

    @Column(name = "data_compra")
    private Timestamp data_compra;

    @Column(name = "quantidade")
    private Long quantidade;

    public ClienteProduto() {
    	
    }
    
	public ClienteProduto(Long id_cliente, Long id_produto, Timestamp data_compra, Long quantidade) {
		super();
		this.id_cliente = id_cliente;
		this.id_produto = id_produto;
		this.data_compra = data_compra;
		this.quantidade = quantidade;
	}

	public Long getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(Long id_cliente) {
		this.id_cliente = id_cliente;
	}

	public Long getId_produto() {
		return id_produto;
	}

	public void setId_produto(Long id_produto) {
		this.id_produto = id_produto;
	}

	public Timestamp getData_compra() {
		return data_compra;
	}

	public void setData_compra(Timestamp data_compra) {
		this.data_compra = data_compra;
	}

	public Long getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Long quantidade) {
		this.quantidade = quantidade;
	}
    
    
    
}
