package br.com.mgoficina.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.com.mgoficina.service.IServicoService;

public class Servico implements IServicoService{
	
	private int id;
	private String nome;
	private LocalDate dataDeInicio;
	private LocalDate dataDeFim;
	private int valor;
	private String metodoDePagamento;
	private Cliente cliente;
	private List<Servico> servicos = new ArrayList<>();
	
	
	public Servico(int id, String nome, LocalDate dataDeInicio, LocalDate dataDeFim, int valor, String metodoDePagamento,
			Cliente cliente) {
		this.id = id;
		this.nome = nome;
		this.dataDeInicio = dataDeInicio;
		this.dataDeFim = dataDeFim;
		this.valor = valor;
		this.metodoDePagamento = metodoDePagamento;
		this.cliente = cliente;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataDeInicio() {
		return dataDeInicio;
	}

	public void setDataDeInicio(LocalDate dataDeInicio) {
		this.dataDeInicio = dataDeInicio;
	}

	public LocalDate getDataDeFim() {
		return dataDeFim;
	}

	public void setDataDeFim(LocalDate dataDeFim) {
		this.dataDeFim = dataDeFim;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public String getMetodoDePagamento() {
		return metodoDePagamento;
	}

	public void setMetodoDePagamento(String metodoDePagamento) {
		this.metodoDePagamento = metodoDePagamento;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public Servico create(Servico servico) {
		Servico service = servico;
		servicos.add(service);
		return service;
	}

	@Override
	public Servico findServicoById(int indice) {
		for (Servico servico : servicos) {
			if(servico.getId() == indice) {
				return servico;
			}
		}
		return null;
	}

	@Override
	public Servico findServicoByNome(String nome) {
		for (Servico servico : servicos) {
			if(servico.getNome() == nome) {
				return servico;
			}
		}
		return null;
	}

	@Override
	public List<Servico> findAll() {
		return servicos;
	}

	@Override
	public boolean updateServico(Servico servico) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteServico(int indice) {
		for (Servico servico : servicos) {
			if(servico.getId() == indice) {
				servicos.remove(servicos.indexOf(servico));
				return true;
			}
		}
		return false;
	}
	
	

}
