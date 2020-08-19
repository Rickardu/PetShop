package br.petshop.entidade;

public class Animal {
	private  String raca;
	private String tipo;
	private String identificador;
	private String porte;
	private int idade;
	private String nome;
	
	
	
	public Animal(String raca, String tipo, String identificador, String porte, int idade, String nome) {
		super();
		this.raca = raca;
		this.tipo = tipo;
		this.identificador = identificador;
		this.porte = porte;
		this.idade = idade;
		this.nome = nome;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getIdentificador() {
		return identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	public String getPorte() {
		return porte;
	}
	public void setPorte(String porte) {
		this.porte = porte;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
