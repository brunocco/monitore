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
	/*
	@NotBlank(message = "Campo nome obrigatório.")
	@Size(min = 3, max = 60, message = "O campo nome deve ter entre {min} e {max} caracteres.")*/
	@Column(name="nome", nullable = false, length = 60)
	private String nome;
	
	/*
	@NotBlank(message = "Campo endereco obrigatório.")
	@Size(min = 10, max = 60, message = "O campo endereço deve ter entre {min} e {max} caracteres.")*/
	@Column(name="endereco", nullable = false, length = 60)
	private String endereco;
	
	/*
	@NotBlank(message = "Campo CEP obrigatório.")
	@Pattern(regexp = "^[0-9]{5}-[0-9]{3}$", message ="O campo CEP deve seguir o padrão XXXXX-XXX.")*/
	@Column(name="cep", nullable = false, length = 9)
	private String cep;
	
	/*
	@NotBlank(message = "Campo CPF obrigatório.")
	@Pattern(regexp = "[0-9]{3}\\.?[0-9]{3}\\.?[0-9]{3}\\-?[0-9]{2}", message ="O campo CPF deve seguir o padrão XXX.XXX.XXX-XX")
	@Size(min = 14, max = 14, message = "O campo CPF deve conter 14 caracteres incluindo pontos e sinal separador antes dos dois últimos números ")*/
	@Column(name="cpf", length = 14)
	private String cpf;
	
	/*
	@NotBlank(message = "Informe um celular.")
	@Pattern(regexp = "^\\([1-9]{2}\\)(?:[2-8]|9[1-9])[0-9]{3}\\-[0-9]{4}$", message = "O campo celular deve seguir o padrão (XX)9XXXX-XXXX")
	@Size(min = 14, max = 14, message = "O campo celular deve conter 14 caracteres")
	@Column(name="celular1", nullable = false, unique = true, length = 14)
	private String celular1; */
	
	/*
	@NotBlank(message = "Campo celular obrigatório.")
	@Pattern(regexp = "^\\([1-9]{2}\\)(?:[2-8]|9[1-9])[0-9]{3}\\-[0-9]{4}$", message = "O campo celular deve seguir o padrão (XX)9XXXX-XXXX")
	@Size(min = 14, max = 14, message = "O campo celular deve conter 14 caracteres")*/
	@Column(name="celular1", unique = true, length = 14)
	private String celular1;
	
	/*
	@NotBlank(message = "Campo e-mail obrigatório.")*/
	@Column(name="email", nullable = false)
	private String email;
	
	/*
	@NotBlank(message = "Campo senha obrigatório.")
	@Size(min = 6, max = 6, message = "O campo senha deve ter no mínimo {min} caracteres.")*/
	@Column(name="senha", nullable = false, length = 6)
	private String senha;
	
	/*
	@NotBlank(message = "Campo necessidade obrigatório.")
	@Size(min = 3, max = 10, message = "Se Morador não possuir, preencher como não")*/
	@Column(name="necessidade", nullable = false)
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
