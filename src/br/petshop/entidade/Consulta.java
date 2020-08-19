package br.petshop.entidade;

import java.util.Date;

public class Consulta {
	private int identificador;
	private Date dataAtendimento;
	private Cliente cliente;
	private Animal animal;
	private double valor;
	private Veterinario veterinario;
	private String situacao;
	
	
	
	
	public Consulta(int identificador, Date dataAtendimento, Cliente cliente, Animal animal, double valor,
			Veterinario veterinario, String situacao) {
		super();
		this.identificador = identificador;
		this.dataAtendimento = dataAtendimento;
		this.cliente = cliente;
		this.animal = animal;
		this.valor = valor;
		this.veterinario = veterinario;
		this.situacao = situacao;
	}
	
	public int getIdentificador() {
		return identificador;
	}
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	public Date getDataAtendimento() {
		return dataAtendimento;
	}
	public void setDataAtendimento(Date dataAtendimento) {
		this.dataAtendimento = dataAtendimento;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Animal getAnimal() {
		return animal;
	}
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Veterinario getVeterinario() {
		return veterinario;
	}
	public void setVeterinario(Veterinario veterinario) {
		this.veterinario = veterinario;
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	
	
	
	
	
	

}
