package br.com.mgoficina.model;

import java.util.Objects;

public class Veiculo implements Identifiable {

    private static Long ID_GENERATOR = 0L;

    private Long id;
    private String placa;
    private String modelo;
    private String ano;
    private String cor;
    private String chassi;
    private String tipoDeVeiculo;

    public Veiculo(String placa,
                   String modelo,
                   String ano,
                   String cor,
                   String chassi,
                   String tipoDeVeiculo) {
        this.id = ID_GENERATOR++;
        this.placa = Objects.requireNonNull(placa, "placa não pode ser nulo");
        this.modelo = Objects.requireNonNull(modelo, "modelo não pode ser nulo");
        this.ano = Objects.requireNonNull(ano, "ano não pode ser nulo");
        this.cor = Objects.requireNonNull(cor, "cor não pode ser nulo");
        this.chassi = Objects.requireNonNull(chassi, "chassi não pode ser nulo");
        this.tipoDeVeiculo = Objects.requireNonNull(tipoDeVeiculo, "tipo não pode ser nulo");
    }

    @Override
    public Long getId() {
        return id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = Objects.requireNonNull(placa, "placa não pode ser nulo");
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = Objects.requireNonNull(modelo, "modelo não pode ser nulo");
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = Objects.requireNonNull(ano, "ano não pode ser nulo");
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = Objects.requireNonNull(cor, "cor não pode ser nulo");
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = Objects.requireNonNull(chassi, "chassi não pode ser nulo");
    }

    public String getTipoDeVeiculo() {
        return tipoDeVeiculo;
    }

    public void setTipoDeVeiculo(String tipoDeVeiculo) {
        this.tipoDeVeiculo = Objects.requireNonNull(tipoDeVeiculo, "tipo não pode ser nulo");
    }

}
