package org.example.model;

public class ItemCompra extends EntityId {
    private Produto produto;
    private Double valorUnitario;
    private Double quantidade;
    private Double desconto;

    public Produto getProduto() {
        return produto;
    }

    public Double getValorCalculado () {
        double valorTotal = this.getValorUnitario() * this.getQuantidade();
        double descontoCalculado = valorTotal * (this.getDesconto()/100);
        return valorTotal - descontoCalculado;
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
}
