package com.example.api_project.ordemproducao;

import java.sql.Date;
import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name = "ORDENS_PRODUCAO") // Sugestão de nome, ajuste conforme necessário
public class OrdensProducao {

    @Id
    @Column(name = "id", nullable = false)
    private Long id; // NUMBER(10) geralmente mapeado como Long

    @Column(name = "numero_ordem", nullable = false, unique = true, length = 50)
    private String numeroOrdem;

    @Column(name = "data_ordem")
    private Date dataOrdem;

    @Column(name = "id_item")
    private Long idItem; // FK para tabela de itens

    @Column(name = "quantidade")
    private Integer quantidade; // NUMBER sem decimal

    @Lob
    @Column(name = "roteiro")
    private String roteiro; // CLOB mapeado como String com @Lob

    @Lob
    @Column(name = "estrutura")
    private String estrutura; // CLOB mapeado como String com @Lob

    @Column(name = "data_criacao")
    private Date dataCriacao;

    @Column(name = "data_atualizacao")
    private Date dataAtualizacao;

    @Column(name = "id_pedido")
    private Long idPedido; // FK para tabela de pedidos
    
    
    public OrdensProducao() {
    	
    }

	public OrdensProducao(Long id, String numeroOrdem, Date dataOrdem, Long idItem, Integer quantidade, String roteiro,
			String estrutura, Date dataCriacao, Date dataAtualizacao, Long idPedido) {
		super();
		this.id = id;
		this.numeroOrdem = numeroOrdem;
		this.dataOrdem = dataOrdem;
		this.idItem = idItem;
		this.quantidade = quantidade;
		this.roteiro = roteiro;
		this.estrutura = estrutura;
		this.dataCriacao = dataCriacao;
		this.dataAtualizacao = dataAtualizacao;
		this.idPedido = idPedido;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumeroOrdem() {
		return numeroOrdem;
	}

	public void setNumeroOrdem(String numeroOrdem) {
		this.numeroOrdem = numeroOrdem;
	}

	public Date getDataOrdem() {
		return dataOrdem;
	}

	public void setDataOrdem(Date dataOrdem) {
		this.dataOrdem = dataOrdem;
	}

	public Long getIdItem() {
		return idItem;
	}

	public void setIdItem(Long idItem) {
		this.idItem = idItem;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public String getRoteiro() {
		return roteiro;
	}

	public void setRoteiro(String roteiro) {
		this.roteiro = roteiro;
	}

	public String getEstrutura() {
		return estrutura;
	}

	public void setEstrutura(String estrutura) {
		this.estrutura = estrutura;
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

	public Long getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(Long idPedido) {
		this.idPedido = idPedido;
	}
    
    
    
    
    
}