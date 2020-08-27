package br.com.mgoficina.model;

import br.com.mgoficina.model.enums.Sexo;

public abstract class Pessoa implements Identifiable {
	
	private static Long ID_GENERATOR = 0L;

	private Long id;
	private String nome;
	private String cpf;
	private Integer idade;
	private Sexo sexo;
	
	protected Pessoa(String nome, String cpf, int idade, Sexo sexo) {
		this.id = ID_GENERATOR++;
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.sexo = sexo;
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	
}
