package com.project.monitore.entity;




import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table (name="Cadastros")
public class Cadastro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator ="seq_cadastro")
	private Long id;
	
	@Column(name="nome", nullable = false)
	private String nome;
	
	@Column(name="endereco")
	private String endereco;
	
	@Column(name="cep")
	private String cep;
	
	@Column(name="cpf")
	private String cpf;
	
	@Column(name="celular1")
	private String celular1;
	
	@Column(name="email")
	private String email;
	
	@Column(name="senha")
	private String senha;
	
	@Column(name="necessidade")
	private String necessidade;

	public Cadastro() {
		
	}

	public Cadastro(String nome, String endereco, String cep, String cpf, String celular1, String email, String senha, String necessidade) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.cep = cep;
		this.cpf = cpf;
		this.celular1 = celular1;
		this.email = email;
		this.senha = senha;
		this.necessidade = necessidade;
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
	
	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCelular1() {
		return celular1;
	}

	public void setCelular1(String celular1) {
		this.celular1 = celular1;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNecessidade() {
		return necessidade;
	}

	public void setNecessidade(String necessidade) {
		this.necessidade = necessidade;
	}
	
	
	

}
