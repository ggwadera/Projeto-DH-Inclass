package br.com.mgoficina.model;

import java.time.LocalDate;

public class Servico {
	
	private int id;
	private String nome;
	private LocalDate dataDeInicio;
	private LocalDate dataDeFim;
	private int valor;
	private String metodoDePagamento;
	private Cliente cliente;
	
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
	
	

}
