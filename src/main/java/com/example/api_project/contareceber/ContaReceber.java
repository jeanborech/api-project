package com.example.api_project.contareceber;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CONTA_RECEBER")
public class ContaReceber {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "id_pedido_venda")
    private Long idPedidoVenda;

    @Column(name = "data_emissao")
    private java.util.Date dataEmissao;

    @Column(name = "data_vencimento")
    private java.util.Date dataVencimento;

    @Column(name = "valor")
    private Double valor;

    @Column(name = "situacao")
    private String situacao;

    @Column(name = "tipo_origem")
    private String tipoOrigem;

    // Construtor padrão
    public ContaReceber() {
    }

	public ContaReceber(Long id, Long idPedidoVenda, Date dataEmissao, Date dataVencimento, Double valor,
			String situacao, String tipoOrigem) {
		super();
		this.id = id;
		this.idPedidoVenda = idPedidoVenda;
		this.dataEmissao = dataEmissao;
		this.dataVencimento = dataVencimento;
		this.valor = valor;
		this.situacao = situacao;
		this.tipoOrigem = tipoOrigem;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdPedidoVenda() {
		return idPedidoVenda;
	}

	public void setIdPedidoVenda(Long idPedidoVenda) {
		this.idPedidoVenda = idPedidoVenda;
	}

	public java.util.Date getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(java.util.Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public java.util.Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(java.util.Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public String getTipoOrigem() {
		return tipoOrigem;
	}

	public void setTipoOrigem(String tipoOrigem) {
		this.tipoOrigem = tipoOrigem;
	}
    
    
}
