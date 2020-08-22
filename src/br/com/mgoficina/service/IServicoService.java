package br.com.mgoficina.service;

import java.util.List;

import br.com.mgoficina.model.Servico;

public interface IServicoService {
	
	public Servico create(Servico servico);
	public Servico findServicoById(int indice);
	public Servico findServicoByNome(String nome);
	public List<Servico> findAll();
	public boolean updateServico(Servico servico);
	public boolean deleteServico(int indice);

}
