package br.com.mgoficina.service;

import java.util.List;

import br.com.mgoficina.exception.ObjectNotFoundException;
import br.com.mgoficina.model.Funcionario;
import br.com.mgoficina.model.Servico;

public interface IFuncionarioService extends IService<Funcionario> {
	
	Funcionario findByNome(String nome) throws ObjectNotFoundException;

	List<Funcionario> findByServico(Servico servico) throws ObjectNotFoundException;

}
