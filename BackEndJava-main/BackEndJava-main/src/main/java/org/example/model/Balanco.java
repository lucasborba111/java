package org.example.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Balanco extends EntityId {
    private LocalDate dataBalanco;
    private String responsavel;
    private List<OperacaoFinanceira> operacoes = new ArrayList<>();

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

    public List<OperacaoFinanceira> getOperacoes() {
        return operacoes;
    }

    public void setOperacoes(List<OperacaoFinanceira> operacoes) {
        this.operacoes = operacoes;
    }

    public void addOperacoes (OperacaoFinanceira operacao) {
        this.operacoes.add(operacao);
    }

    public void delOperacoes (OperacaoFinanceira operacao) {
        this.operacoes.remove(operacao);
    }
    public void imprimirBalanco () {
        System.out.println("----------------------------------------");
        System.out.println("Balanco nº " + this.getId());
        System.out.println("Data " + this.getDataBalanco());
        System.out.println("Responsavel " + this.getResponsavel());
        System.out.println("Balanco nº " + this.getId());
        System.out.println("----------------------------------------");
        for (OperacaoFinanceira op : this.getOperacoes()) {
            System.out.println("Itens: ");
            System.out.println("Data operação: " + op.getDataOperacao());
            System.out.println("Tipo operação: " + op.getTipoOperacao());
            System.out.println("Valor operação: " + op.getValorTotalOperacao());
            System.out.println("--------");
        }
        System.out.println("----------------------------------------");
    }
}
