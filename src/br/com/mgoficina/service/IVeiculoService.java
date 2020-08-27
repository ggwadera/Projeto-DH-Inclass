package br.com.mgoficina.service;

import java.util.List;

import br.com.mgoficina.exception.DataIntegrityException;
import br.com.mgoficina.model.Cliente;
import br.com.mgoficina.model.Servico;
import br.com.mgoficina.model.Veiculo;

public interface IVeiculoService extends IService<Veiculo> {

	boolean fieldsAreValid(Veiculo veiculo);

	List<Veiculo> findByCliente(Cliente cliente);

	List<Veiculo> findByServico(Servico servico);

}
