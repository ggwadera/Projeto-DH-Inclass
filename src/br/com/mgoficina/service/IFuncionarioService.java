package br.com.mgoficina.service;

import java.util.List;

import br.com.mgoficina.exception.ObjectNotFoundException;
import br.com.mgoficina.model.Funcionario;

public interface IFuncionarioService {
	
	public Funcionario create(Funcionario funcionario);
	public Funcionario findFuncionarioById(int indice) throws ObjectNotFoundException;
	public Funcionario findFuncionarioByNome(String nome) throws ObjectNotFoundException;
	public List<Funcionario> findAll();
	public boolean updateFuncionario(Funcionario funcionario);
	public boolean deleteFuncionario(int indice);

}
