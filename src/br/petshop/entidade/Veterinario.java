package br.petshop.entidade;

import java.util.Date;

public class Veterinario extends Funcionario {
	
	 private String documento;
	 private HorarioAtendimento[] horario;
	 
	 
	 
	public Veterinario(String nome, Date dataNascimento, String cpf, String telefone, String email, String whatapp,
			Endereco endereco, String matricula, String funcao, HorarioAtendimento[] turnos, String documento,
			HorarioAtendimento[] horario) {
		super(nome, dataNascimento, cpf, telefone, email, whatapp, endereco, matricula, funcao, turnos);
		this.documento = documento;
		this.horario = horario;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public HorarioAtendimento[] getHorario() {
		return horario;
	}
	public void setHorario(HorarioAtendimento[] horario) {
		this.horario = horario;
	}
	 
	 
 
	

}
