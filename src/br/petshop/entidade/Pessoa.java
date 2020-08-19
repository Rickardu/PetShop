package br.petshop.entidade;

import java.util.Date;

public abstract class Pessoa {
	protected String nome; 
	protected Date dataNascimento;	 
	protected String cpf;	 
	protected String telefone;
	protected String email;
	protected String whatapp;
	protected Endereco endereco;
	public Pessoa(String nome, Date dataNascimento, String cpf, String telefone, String email, String whatapp,
			Endereco endereco) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
		this.telefone = telefone;
		this.email = email;
		this.whatapp = whatapp;
		this.endereco = endereco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
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
	public String getWhatapp() {
		return whatapp;
	}
	public void setWhatapp(String whatapp) {
		this.whatapp = whatapp;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	 
	
	
}
