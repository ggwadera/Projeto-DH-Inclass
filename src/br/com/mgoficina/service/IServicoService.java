package br.com.mgoficina.service;

import java.time.LocalDate;
import java.util.List;

import br.com.mgoficina.exception.ObjectNotFoundException;
import br.com.mgoficina.model.Cliente;
import br.com.mgoficina.model.Servico;
import br.com.mgoficina.model.Veiculo;

public interface IServicoService extends IService<Servico> {

	List<Servico> findByCliente(Cliente cliente) throws ObjectNotFoundException;

	List<Servico> findByData(LocalDate data) throws ObjectNotFoundException;

	List<Servico> findByVeiculo(Veiculo veiculo) throws ObjectNotFoundException;
}
