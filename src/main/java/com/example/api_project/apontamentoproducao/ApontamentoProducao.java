package com.example.api_project.apontamentoproducao;

import java.security.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "APONTAMENTO_PRODUCAO")
public class ApontamentoProducao {

    @Id
    @Column(name = "id", nullable = false)
    private Long id; // NUMBER(10) mapeado como Long para PK

    @Column(name = "ordem_producao_id", nullable = false)
    private Long ordemProducaoId; // FK para OrdemProducao

    @Column(name = "pedido_id", nullable = false)
    private Long pedidoId; // FK para Pedido

    @Column(name = "usuario_id", nullable = false)
    private Long usuarioId; // FK para Usuario

    @Column(name = "data_apontamento")
    private Timestamp dataApontamento; // TIMESTAMP

    @Column(name = "quantidade_produzida")
    private Integer quantidadeProduzida; // NUMBER sem decimal

    @Column(name = "status_observacoes", length = 255)
    private String statusObservacoes; // VARCHAR2(255)

    // Construtor padrão
    public ApontamentoProducao() {
    }

	public ApontamentoProducao(Long id, Long ordemProducaoId, Long pedidoId, Long usuarioId, Timestamp dataApontamento,
			Integer quantidadeProduzida, String statusObservacoes) {
		super();
		this.id = id;
		this.ordemProducaoId = ordemProducaoId;
		this.pedidoId = pedidoId;
		this.usuarioId = usuarioId;
		this.dataApontamento = dataApontamento;
		this.quantidadeProduzida = quantidadeProduzida;
		this.statusObservacoes = statusObservacoes;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getOrdemProducaoId() {
		return ordemProducaoId;
	}

	public void setOrdemProducaoId(Long ordemProducaoId) {
		this.ordemProducaoId = ordemProducaoId;
	}

	public Long getPedidoId() {
		return pedidoId;
	}

	public void setPedidoId(Long pedidoId) {
		this.pedidoId = pedidoId;
	}

	public Long getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(Long usuarioId) {
		this.usuarioId = usuarioId;
	}

	public Timestamp getDataApontamento() {
		return dataApontamento;
	}

	public void setDataApontamento(Timestamp dataApontamento) {
		this.dataApontamento = dataApontamento;
	}

	public Integer getQuantidadeProduzida() {
		return quantidadeProduzida;
	}

	public void setQuantidadeProduzida(Integer quantidadeProduzida) {
		this.quantidadeProduzida = quantidadeProduzida;
	}

	public String getStatusObservacoes() {
		return statusObservacoes;
	}

	public void setStatusObservacoes(String statusObservacoes) {
		this.statusObservacoes = statusObservacoes;
	}
    
    
    
    
}