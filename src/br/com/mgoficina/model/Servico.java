package br.com.mgoficina.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.com.mgoficina.model.enums.MetodoDePagamento;

public class Servico implements Identifiable {

	private static Long ID_GENERATOR = 0L;
	
	private Long id;
	private String nome;
	private LocalDate dataDeInicio;
	private LocalDate dataDeFim;
	private double valor;
	private MetodoDePagamento metodoDePagamento;
	private Cliente cliente;
	private List<Servico> servicos = new ArrayList<>();
	
	
	public Servico(String nome, LocalDate dataDeInicio, LocalDate dataDeFim, double valor, MetodoDePagamento metodoDePagamento,
				   Cliente cliente) {
		this.id = ID_GENERATOR++;
		this.nome = nome;
		this.dataDeInicio = dataDeInicio;
		this.dataDeFim = dataDeFim;
		this.valor = valor;
		this.metodoDePagamento = metodoDePagamento;
		this.cliente = cliente;
	}

	@Override
	public Long getId() {
		return id;
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

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public MetodoDePagamento getMetodoDePagamento() {
		return metodoDePagamento;
	}

	public void setMetodoDePagamento(MetodoDePagamento metodoDePagamento) {
		this.metodoDePagamento = metodoDePagamento;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
