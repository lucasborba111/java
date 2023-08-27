package org.example.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Balanco extends EntityId {
    private LocalDate dataBalanco;
    private String responsavel;
    private List<OperacaoFinanceira> operacaoFinanceiraList = new ArrayList<>();

    public LocalDate getDataBalanco() {
        return dataBalanco;
    }

    public void setDataBalanco(LocalDate dataBalanco) {
        this.dataBalanco = dataBalanco;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public void addOperacoes(OperacaoFinanceira operacaoFinanceira) {
        this.operacaoFinanceiraList.add(operacaoFinanceira);
    }

    public void removerOperacoes(OperacaoFinanceira operacaoFinanceira) {
        this.operacaoFinanceiraList.remove(operacaoFinanceira);
    }

    public List<OperacaoFinanceira> getOperacoes() {
        return operacaoFinanceiraList;
    }

    public Double getValorTotal(TipoOperacao tipo) {
        return this.getOperacoes()
                .stream()
                .filter(op -> op.getTipoOperacao().equals(tipo))
                .mapToDouble(OperacaoFinanceira::getValorTotalOperacao)
                .sum();
    }

    public void imprimirBalanco() {
        System.out.println("--------------------------");
        System.out.println("Balanço número: " + this.getId());
        System.out.println("Data: " + this.getDataBalanco());
        System.out.println("Responsável: " + this.getResponsavel());
        System.out.println("--------------------------");
        for (OperacaoFinanceira op : this.getOperacoes()) {
            System.out.println(
                    " Data operação: " + op.getDataOperacao() +
                            " Tipo operação: " + op.getTipoOperacao() +
                            " Valor operação: " + op.getValorTotalOperacao()
            );
            System.out.println("--------------------------");
            System.out.println("Total debitos:" + this.getValorTotal(TipoOperacao.DEBITO));
            System.out.println("Total credito:" + this.getValorTotal(TipoOperacao.CREDITO));
            System.out.println("Total: " + (this.getValorTotal(TipoOperacao.DEBITO) - this.getValorTotal(TipoOperacao.CREDITO)));
        }
    }
}