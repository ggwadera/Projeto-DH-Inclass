
package br.com.mgoficina.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.mgoficina.model.Veiculo;
import br.com.mgoficina.service.IVeiculoService;

public class VeiculoServiceImpl implements IVeiculoService{
	
	private List<Veiculo> veiculos;
	
	public VeiculoServiceImpl () {
		
		veiculos = new ArrayList<Veiculo>();
	}
	public VeiculoServiceImpl(List<Veiculo> veiculos) {
		this.veiculos = new ArrayList<>(veiculos);
	}
	@Override
	public Veiculo create(Veiculo veiculo) {
		this.veiculos.add(veiculo);
		return veiculo;
	}
	@Override
	public Veiculo findVeiculoById(int indice) {
		for(Veiculo veiculo: this.veiculos) {
			if(veiculo.getPlaca().equals(indice)) {
				return veiculo;
			}
		}
		return null;
	}
	@Override
	public Veiculo findVeiculoByPlaca(String placa) {
		
		for(Veiculo veiculo: this.veiculos) {
			if(veiculo.getPlaca().equals(placa)) {
				return veiculo;
			}
		}
		return null;
	}
	@Override
	public List<Veiculo> findAll() {
		return Collections.unmodifiableList(this.veiculos);
	}
	@Override
	public boolean updateVeiculo(Veiculo veiculo) {
		if(this.veiculos.contains(veiculo)) {
			
			int indiceDoObjeto = this.veiculos.indexOf(veiculo);
			this.veiculos.remove(veiculo);
			this.veiculos.add(indiceDoObjeto, veiculo);
			return true;
			
		}else {		
			
			return false;
			
		}
	}
	@Override
	public boolean deleteVeiculo(int indice) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
