package org.example.model;

public class ItemVenda extends EntityId{
  private Produto produto;
  private Double valorUnitario;
  private Double quantidade;
  private Double desconto;


  public Produto getProduto() {
    return produto;
  }

  public void setProduto(Produto produto) {
    this.produto = produto;
  }

  public Double getValorUnitario() {
    return valorUnitario;
  }

  public void setValorUnitario(Double valorUnitario) {
    this.valorUnitario = valorUnitario;
  }

  public Double getQuantidade() {
    return quantidade;
  }

  public void setQuantidade(Double quantidade) {
    this.quantidade = quantidade;
  }

  public Double getDesconto() {
    return desconto;
  }

  public void setDesconto(Double desconto) {
    this.desconto = desconto;
  }

  public ItemVenda(Produto produto, Double valorUnitario, Double quantidade, Double desconto) {
    this.produto = produto;
    this.valorUnitario = valorUnitario;
    this.quantidade = quantidade;
    this.desconto = desconto;
  }
  public Double getValorCalculado() {
    double valorTotal = this.getValorUnitario() * this.getQuantidade();
    double descontoCalulado = valorTotal *(this.getDesconto()/100);

    return valorTotal - descontoCalulado;
  }

  @Override
  public String toString() {
    return "ItemVenda{" +
            "produto=" + produto +
            ", valorUnitario=" + valorUnitario +
            ", quantidade=" + quantidade +
            ", desconto=" + desconto +
            '}';
  }
}
