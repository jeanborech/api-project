package com.example.api_project.fornecedor;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "FORNECEDORES")
public class Fornecedores {

    @Id
    @Column(name = "id", nullable = false)
    private Long id; // NUMBER(10) mapeado como Long para PK

    @Column(name = "nome", length = 255)
    private String nome; // VARCHAR2(255)

    @Column(name = "cnpj", length = 20, unique = true)
    private String cnpj; // VARCHAR2(20) com restrição UNIQUE

    @Column(name = "contato", length = 100)
    private String contato; // VARCHAR2(100)

    @Column(name = "email", length = 100)
    private String email; // VARCHAR2(100)

    @Column(name = "rua", length = 255)
    private String rua; // VARCHAR2(255)

    @Column(name = "numero", length = 10)
    private String numero; // VARCHAR2(10)

    @Column(name = "bairro", length = 100)
    private String bairro; // VARCHAR2(100)

    @Column(name = "complemento", length = 255)
    private String complemento; // VARCHAR2(255)

    @Column(name = "cidade", length = 100)
    private String cidade; // VARCHAR2(100)

    @Column(name = "estado", length = 50)
    private String estado; // VARCHAR2(50)

    @Column(name = "data_cadastro")
    private Date dataCadastro; // DATE

    // Construtor padrão
    public Fornecedores() {
    }

	public Fornecedores(Long id, String nome, String cnpj, String contato, String email, String rua, String numero,
			String bairro, String complemento, String cidade, String estado, Date dataCadastro) {
		super();
		this.id = id;
		this.nome = nome;
		this.cnpj = cnpj;
		this.contato = contato;
		this.email = email;
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.complemento = complemento;
		this.cidade = cidade;
		this.estado = estado;
		this.dataCadastro = dataCadastro;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
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

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

    
    
}
