package br.petshop.entidade;

import java.util.Date;

public class Funcionario extends Pessoa{
	
	private String matricula;
	private String funcao;
	private HorarioAtendimento[] turnos;
	public Funcionario(String nome, Date dataNascimento, String cpf, String telefone, String email, String whatapp,
			Endereco endereco, String matricula, String funcao, HorarioAtendimento[] turnos) {
		super(nome, dataNascimento, cpf, telefone, email, whatapp, endereco);
		this.matricula = matricula;
		this.funcao = funcao;
		this.turnos = turnos;
	}
	

}
