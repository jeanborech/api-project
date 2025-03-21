package com.example.api_project.cadastroempresa;

import jakarta.persistence.*;

@Entity
@Table(name = "CADASTRO_EMPRESA")
public class CadastroEmpresa {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cadastro_empresa_seq_generator")
	@SequenceGenerator(name = "cadastro_empresa_seq_generator", sequenceName = "cadastro_empresa_seq", allocationSize = 1)
	@Column(name = "id")
	private int id;

	@Column(name = "nome_empresa")
	private String nomeEmpresa;

	@Column(name = "cnpj")
	private String cnpj;

	@Column(name = "rua")
	private String rua;

	@Column(name = "numero_endereco")
	private String numeroEndereco;

	@Column(name = "complemento")
	private String complemento;

	@Column(name = "bairro")
	private String bairro;

	@Column(name = "cidade")
	private String cidade;

	@Column(name = "estado")
	private String estado;

	@Column(name = "cep")
	private String cep;

	@Column(name = "telefone")
	private String telefone;

	@Column(name = "email")
	private String email;

	@Column(name = "regime_tributario")
	private String regimeTributario;

	// Construtor padrão
	public CadastroEmpresa() {
	}

	// Construtor com parâmetros
	public CadastroEmpresa(String nomeEmpresa, String cnpj, String rua, String numeroEndereco, String complemento,
			String bairro, String cidade, String estado, String cep, String telefone, String email,
			String regimeTributario) {
		this.nomeEmpresa = nomeEmpresa;
		this.cnpj = cnpj;
		this.rua = rua;
		this.numeroEndereco = numeroEndereco;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
		this.telefone = telefone;
		this.email = email;
		this.regimeTributario = regimeTributario;
	}

	// Getters e Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getNumeroEndereco() {
		return numeroEndereco;
	}

	public void setNumeroEndereco(String numeroEndereco) {
		this.numeroEndereco = numeroEndereco;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRegimeTributario() {
		return regimeTributario;
	}

	public void setRegimeTributario(String regimeTributario) {
		this.regimeTributario = regimeTributario;
	}

}
