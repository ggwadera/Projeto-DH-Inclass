package br.com.mgoficina.service;

import java.util.List;

import br.com.mgoficina.model.Funcionario;

public interface IFuncionarioService {
	
	public Funcionario create(Funcionario funcionario);
	public Funcionario findFuncionarioById(int indice);
	public Funcionario findFuncionarioByNome(String nome);
	public List<Funcionario> findAll();
	public boolean updateFuncionario(Funcionario funcionario);
	public boolean deleteFuncionario(int indice);

}
