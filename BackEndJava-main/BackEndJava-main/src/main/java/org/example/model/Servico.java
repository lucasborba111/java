package org.example.model;

public class Servico extends ItemVendavel{
  private String descricao;
  private Double quantidadeHoras;
  private Double valor;

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public Double getQuantidadeHoras() {
    return quantidadeHoras;
  }

  public void setQuantidadeHoras(Double quantidadeHoras) {
    this.quantidadeHoras = quantidadeHoras;
  }

  public Double getValor() {
    return valor;
  }

  public void setValor(Double valor) {
    this.valor = valor;
  }

  public Servico(String descricao, Double quantidadeHoras, Double valor) {
    super.setDescricao(descricao);
    this.quantidadeHoras = quantidadeHoras;
    super.setValorUnitario(valor);
  }
}
