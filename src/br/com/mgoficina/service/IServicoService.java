package br.com.mgoficina.service;

import java.util.List;

import br.com.mgoficina.exception.ObjectNotFoundException;
import br.com.mgoficina.model.Servico;

public interface IServicoService {
	
	public Servico create(Servico servico);
	public Servico findServicoById(int indice) throws ObjectNotFoundException;
	public Servico findServicoByNome(String nome) throws ObjectNotFoundException;
	public List<Servico> findAll();
	public boolean updateServico(Servico servico);
	public boolean deleteServico(int indice);

}
