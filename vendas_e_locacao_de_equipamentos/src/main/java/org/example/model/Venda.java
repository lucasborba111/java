package org.example.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Venda implements OperacaoFinanceira {
    private LocalDate dataVenda;
    private Cliente cliente;
    private FormaPagamento formaPagemento;
    private String observacao;
    private List<ItemVenda> itemVendaList = new ArrayList<>();
    public LocalDate getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(LocalDate dataVenda) {
        this.dataVenda = dataVenda;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public FormaPagamento getFormaPagemento() {
        return formaPagemento;
    }

    public void setFormaPagemento(FormaPagamento formaPagemento) {
        this.formaPagemento = formaPagemento;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public void addItemVenda (ItemVenda item) {
        this.itemVendaList.add(item);
    }

    public void delItemVenda (ItemVenda item) {
        this.itemVendaList.remove(item);
    }

    public List<ItemVenda> getItens() {
        return this.itemVendaList;
    }

    @Override
    public LocalDate getDataOperacao() {
        return this.getDataVenda();
    }

    @Override
    public Double getValorTotalOperacao() {
        return this.getItens()
                .stream()
                .mapToDouble(ItemVenda::getValorCalculado)
                .sum();
    }

    @Override
    public TipoOperacao getTipoOperacao() {
        return TipoOperacao.CREDITO;
    }
}
