package br.com.mgoficina.model.enums;

public enum Sexo {
    MASCULINO("M"),
    FEMININO("F");

    private final String abreviacao;

    Sexo(String abreviacao) {
        this.abreviacao = abreviacao;
    }

    public String getAbreviacao() {
        return abreviacao;
    }
}
