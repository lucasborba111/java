package org.example.model;

import java.time.LocalDate;

public class Produto extends ItemVendavel {
    //Aplicando encapsulamento para a regra do setPrecoVenda não ser burlada
    private String nome;
    private Double precoVenda;
    private Double precoCompra;
    private LocalDate dataValidade;
    private LocalDate dataPrazo;
    private Status status;

    public Produto(
            String nome,
            String descricao,
            Double precoVenda,
            Double precoCompra,
            LocalDate dataValidade,
            LocalDate dataPrazo,
            Status status
    ) {
        this.nome = nome;
        super.setValorUnitario(precoVenda);
        super.setDescricao(descricao);
        this.precoVenda = precoVenda;
        this.precoCompra = precoCompra;
        this.dataValidade = dataValidade;
        this.dataPrazo = dataPrazo;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", precoVenda=" + precoVenda +
                ", precoCompra=" + precoCompra +
                ", dataValidade=" + dataValidade +
                ", dataPrazo=" + dataPrazo +
                ", status=" + status +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        nome = nome;
    }

    public void setDescricao(String descricao) {
        descricao = descricao;
    }

    public Double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(Double precoVenda) {
        this.precoVenda = precoVenda;
        if (this.calculaMargemDeLucro() < 20) {
            System.out.println("A margem de lucro deve ser igual ou maior que 20%");
        }
    }

    public Double getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(Double precoCompra) {
        this.precoCompra = precoCompra;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }

    public LocalDate getDataPrazo() {
        return dataPrazo;
    }

    public void setDataPrazo(LocalDate dataPrazo) {
        this.dataPrazo = dataPrazo;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    public Double calculaMargemDeLucro () {
        double lucro = super.getValorUnitario() - precoCompra;
        double margemLucro = (lucro/precoVenda) * 100;
        return margemLucro;
    }
}
