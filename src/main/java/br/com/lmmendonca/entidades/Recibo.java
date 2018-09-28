package br.com.lmmendonca.entidades;

public class Recibo {

    private String descricao;
    private Double valor;
    private String assinatura;


    public Recibo(String descricao, Double valor, String assinatura) {
        this.descricao = descricao;
        this.valor = valor;
        this.assinatura = assinatura;
    }


    public String getDescricao() {
        return descricao;
    }

    public Double getValor() {
        return valor;
    }

    public String getAssinatura() {
        return assinatura;
    }

    @Override
    public String toString() {
        return "[DESCRICAO: " + this.descricao + ", VALOR: " + this.valor + ", ASSINATURA: "
                + this.assinatura + "]";
    }
}
