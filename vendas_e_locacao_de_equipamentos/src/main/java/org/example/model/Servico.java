package org.example.model;

public class Servico extends ItemVendavel {
    private Double quantidadeHoras;
    public Servico(String descricao, Double quantidadeHoras, Double valor) {
        super.setDescricao(descricao);
        this.quantidadeHoras = quantidadeHoras;
        super.setValorUnitario(valor);
    }

    public Double getQuantidadeHoras() {
        return quantidadeHoras;
    }

    public void setQuantidadeHoras(Double quantidadeHoras) {
        this.quantidadeHoras = quantidadeHoras;
    }
//metodo sobreescrito da classe base ItemVendavel
    @Override
    public Boolean getEstocavel() {
        return false;
    }
}
