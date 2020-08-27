package br.com.mgoficina.service;

import java.util.List;

import br.com.mgoficina.exception.ObjectNotFoundException;
import br.com.mgoficina.model.Cliente;
import br.com.mgoficina.model.Pessoa;

public interface IClienteService extends IService<Cliente> {

	Cliente findByNome(String nome) throws ObjectNotFoundException;
	
}