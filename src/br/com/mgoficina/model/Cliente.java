package br.com.mgoficina.model;

import br.com.mgoficina.model.enums.Sexo;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa {
	
	private List<Veiculo> veiculos;

	public Cliente(String nome, String cpf, int idade, Sexo sexo, List<Veiculo> veiculos) {
		super(nome, cpf, idade, sexo);
		this.veiculos = new ArrayList<>(veiculos);
	}

	public Cliente(String nome, String cpf, int idade, Sexo sexo) {
		super(nome, cpf, idade, sexo);
		this.veiculos = new ArrayList<>();
	}

	public List<Veiculo> getVeiculos() {
		return veiculos;
	}

	public void setVeiculos(List<Veiculo> veiculos) {
		this.veiculos = new ArrayList<>(veiculos);
	}
	
}
