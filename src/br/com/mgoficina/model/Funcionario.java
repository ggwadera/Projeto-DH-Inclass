package br.com.mgoficina.model;

import br.com.mgoficina.model.enums.Cargo;
import br.com.mgoficina.model.enums.Sexo;

import java.util.ArrayList;
import java.util.List;

public class Funcionario extends Pessoa {
	
	private Cargo cargo;
	private List<Servico> servicos;
	
	public Funcionario(String nome, String cpf, int idade, Sexo sexo, Cargo cargo, List<Servico> servicos) {
		super(nome, cpf, idade, sexo);
		this.cargo = cargo;
		this.servicos = new ArrayList<>(servicos);
	}
	
	public Funcionario(String nome, String cpf, int idade, Sexo sexo, Cargo cargo) {
		super(nome, cpf, idade, sexo);
		this.cargo = cargo;
		this.servicos = new ArrayList<>();
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public List<Servico> getServicos() {
		return servicos;
	}

	public void setServicos(List<Servico> servicos) {
		this.servicos = new ArrayList<>(servicos);
	}
		
}
