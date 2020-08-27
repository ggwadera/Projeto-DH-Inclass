package br.com.mgoficina.service;

import java.util.List;

import br.com.mgoficina.exception.ObjectNotFoundException;
import br.com.mgoficina.model.Funcionario;

public interface IFuncionarioService extends IService<Funcionario> {
	
	Funcionario findByNome(String nome) throws ObjectNotFoundException;

}
