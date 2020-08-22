package br.com.mgoficina.service;

import java.util.List;

import br.com.mgoficina.model.Veiculo;

public interface IVeiculoService {

	public Veiculo create(Veiculo veiculo);
	public Veiculo findVeiculoById(int indice);
	public Veiculo findVeiculoByPlaca(String placa);
	public List<Veiculo> findAll();
	public boolean updateVeiculo(Veiculo veiculo);
	public boolean deleteVeiculo(int indice);
	
}
