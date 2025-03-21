package com.example.api_project.pedido;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "PEDIDO")
public class Pedido {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "num_pedido", unique = true)
    private String numPedido;

    @Column(name = "id_produto")
    private Long idProduto;

    @Column(name = "id_cliente")
    private Long idCliente;

    @Column(name = "id_fornecedor")
    private Long idFornecedor;

    @Column(name = "valor_total")
    private String valorTotal;

    // Construtor padrão
    public Pedido() {
    }

	public Pedido(Long id, String numPedido, Long idProduto, Long idCliente, Long idFornecedor, String valorTotal) {
		super();
		this.id = id;
		this.numPedido = numPedido;
		this.idProduto = idProduto;
		this.idCliente = idCliente;
		this.idFornecedor = idFornecedor;
		this.valorTotal = valorTotal;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumPedido() {
		return numPedido;
	}

	public void setNumPedido(String numPedido) {
		this.numPedido = numPedido;
	}

	public Long getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Long idProduto) {
		this.idProduto = idProduto;
	}

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

	public Long getIdFornecedor() {
		return idFornecedor;
	}

	public void setIdFornecedor(Long idFornecedor) {
		this.idFornecedor = idFornecedor;
	}

	public String getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(String valorTotal) {
		this.valorTotal = valorTotal;
	}

    
    
}
