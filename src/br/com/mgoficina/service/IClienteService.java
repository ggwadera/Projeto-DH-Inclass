package br.com.mgoficina.service;

import java.util.List;

import br.com.mgoficina.exception.ObjectNotFoundException;
import br.com.mgoficina.model.Cliente;

public interface IClienteService {

	public Cliente create(Cliente cliente);
	public Cliente findClienteById(int indice) throws ObjectNotFoundException;
	public Cliente findClienteByNome(String nome) throws ObjectNotFoundException;
	public List<Cliente> findAll();
	public boolean updateCliente(Cliente cliente);
	public boolean deleteCliente(int indice);
	
}