package com.example.api_project.itens;

import com.example.api_project.produto.Produto;
import jakarta.persistence.*;


@Entity
@Table(name = "ITENS")
public class Itens {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "item_seq_generator")
	@SequenceGenerator(name = "item_seq_generator", sequenceName = "item_seq", allocationSize = 1)
	@Column(name = "id")
	private int id;

	@Lob
	@Column(name = "descricao_item")
	private String descricaoItem;

	@ManyToOne
	@JoinColumn(name = "id_produto")
	private Produto produto;

	@Column(name = "quantidade")
	private int quantidade;

	@Column(name = "valor_unitario")
	private Double valorUnitario;

	@Column(name = "valor_total")
	private Double valorTotal;

	// Construtor padrão
	public Itens() {
	}

	// Construtor com parâmetros
	public Itens(String descricaoItem, Produto produto, int quantidade, Double valorUnitario, Double valorTotal) {
		this.descricaoItem = descricaoItem;
		this.produto = produto;
		this.quantidade = quantidade;
		this.valorUnitario = valorUnitario;
		this.valorTotal = valorTotal;
	}

	// Getters e Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricaoItem() {
		return descricaoItem;
	}

	public void setDescricaoItem(String descricaoItem) {
		this.descricaoItem = descricaoItem;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(Double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}
}