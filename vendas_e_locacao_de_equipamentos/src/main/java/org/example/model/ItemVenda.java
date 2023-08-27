package org.example.model;

public class ItemVenda extends EntityId {
    private ItemVendavel itemVendavel;
    private Double valorUnitario;
    private Double quantidade;
    private Double desconto;
    //classe usada para polimorfismo em que aceita na venda: servico ou produto que serão derivadas
    public ItemVenda(ItemVendavel itemVendavel, Double valorUnitario, Double quantidade, Double desconto) {
        this.itemVendavel = itemVendavel;
        this.valorUnitario = valorUnitario;
        this.quantidade = quantidade;
        this.desconto = desconto;
    }

    public Double getValorCalculado () {
        double valorTotal = this.getValorUnitario() * this.getQuantidade();
        double descontoCalculado = valorTotal * (this.getDesconto()/100);
        return valorTotal - descontoCalculado;
    }
    @Override
    public String toString() {
        return "ItemVenda{" +
                "item=" + itemVendavel +
                ", valorUnitario=" + valorUnitario +
                ", quantidade=" + quantidade +
                ", desconto=" + desconto +
                '}';
    }

    public ItemVendavel getItemVendavel() {
        return itemVendavel;
    }

    public void setItemVendavel(ItemVendavel itemVendavel) {
        this.itemVendavel = itemVendavel;
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
