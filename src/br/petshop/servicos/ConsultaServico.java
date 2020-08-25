package br.petshop.servicos;

import java.util.ArrayList;
import java.util.Date;

import br.petshop.entidade.Animal;
import br.petshop.entidade.Cliente;
import br.petshop.entidade.Veterinario;
import br.petshop.entidade.Consulta;

import br.petshop.interfaces.IConsulta;

public class ConsultaServico implements IConsulta {
	public ArrayList<Consulta> consultasRepositorio;
	
	
	public ConsultaServico(ArrayList<Consulta> consultasRepositorio) {		 
		this.consultasRepositorio = consultasRepositorio;
	}

	@Override
	public boolean agendarConsulta(Cliente cliente, Animal animal, Veterinario veterinario, Date dataConsulta,double valor, String situacao) {
		try {
			/*System.out.println("Cliente:"+cliente.getNome());
			System.out.println("Animal:"+animal.getNome());
			System.out.println("Veterinario:"+veterinario.getNome());
			System.out.println("Data Agendamento:"+dataConsulta);
			System.out.println("Valor R$:"+valor);
			System.out.println("situacao:"+situacao);*/
			Consulta novaConsulta = new Consulta(this.consultasRepositorio.size()+1, dataConsulta, cliente, animal, valor, veterinario, situacao);
			this.consultasRepositorio.add(novaConsulta);
			System.out.println("CONSULTA AGENDADA COM SUCESSO");
		} catch (Exception e) {
			System.out.println("ERROR - CONSULTA NAO AGENDADA -"+e.getMessage());
		}
		
		
		
		 
		 
		
		return false;
	}

	@Override
	public boolean remarcarConsultaPorData(int identificador, Date dataConsulta, double valor, String situacao) {
		// TODO Auto-generated method stub
		System.out.println("COnsulta remarcada");
		return false;
	}

	@Override
	public boolean remarcarConsultaPorVeterinario(int identificador, Veterinario veterinario, Date dataConsulta,
			double valor, String situacao) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void cancelarConsulta(int identificador, String situacao) {
		// TODO Auto-generated method stub
		
	}

}
