package br.petshop.interfaces;

import java.util.Date;

import br.petshop.entidade.Animal;
import br.petshop.entidade.Cliente;
import br.petshop.entidade.Veterinario;

public interface IConsulta {
	//Quando quero criar uma consulta
	public boolean agendarConsulta(Cliente cliente, Animal animal, Veterinario veterinario,Date dataConsulta, double valor, String situacao);
	//Quando quero remarcar uma consulta baseada na data
	public boolean remarcarConsultaPorData( int identificador,Date dataConsulta, double valor, String situacao);
	//Quando quero remarcar uma consulta baseada no Veterinario
	public boolean remarcarConsultaPorVeterinario(int identificador , Veterinario veterinario,Date dataConsulta, double valor, String situacao);
	//Quando quero remarcar uma consulta
	public void cancelarConsulta(int identificador, String situacao);
	
}
