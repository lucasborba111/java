package org.example;

import org.example.model.*;

import java.time.LocalDate;

public class Application {

    public static void main(String[] args) {
        Fornecedor fornecedor = new Fornecedor();
        fornecedor.setNome("Lucas");
        fornecedor.setCnpj("23312333");
        fornecedor.setInscricaoEstadual("44343443443");
        fornecedor.setEndereco("Rua almeida 333");
        fornecedor.setEmail("lucas@gmail.com");
        fornecedor.setTelefone("48 999999999");

        Cliente cliente  = new Cliente();
        cliente.setNome("Lucas");
        cliente.setRg("23312333");
        cliente.setCpf("44343443443");
        cliente.setEndereco("Rua almeida 333");
        cliente.setEmail("lucas@gmail.com");
        cliente.setTelefone("48 999999999");

        Produto produto = new Produto(
                "Calculadora",
                "Científica",
                900.00,
                700.00,
                LocalDate.of(20023, 1, 1),
                LocalDate.of(2023, 05, 29),
                Status.DISPONIVEL
        );

        ItemCompra itemCompra = new ItemCompra();
        itemCompra.setDesconto(20.00);
        itemCompra.setProduto(produto);
        itemCompra.setQuantidade(2.00);
        itemCompra.setValorUnitario(400.00);

        Servico servico = new Servico("Teste", 5.00, 200.00);

        Compra compra = new Compra();
        compra.setDataCompra(LocalDate.of(20023, 1, 1));
        compra.setFornecedor(fornecedor);
        compra.addItemCompra(itemCompra);
        compra.setObservacao("compra");

        Venda venda = new Venda();
        venda.setCliente(cliente);
        venda.setFormaPagemento(FormaPagamento.DEBITO);
        venda.setDataVenda(LocalDate.of(2023, 01, 01));
        venda.setObservacao("Teste");

        Locacao locacao = new Locacao();
        locacao.setDataLocacao(LocalDate.of(2023, 01, 01));
        locacao.setEndereco("Rua 88");
        locacao.setCliente(cliente);
        locacao.setObservacao("teste");
        locacao.setDataDevolucao(LocalDate.of(2023, 01, 01));

        Balanco balanco = new Balanco();
        balanco.setId(10L);
        balanco.setDataBalanco(LocalDate.of(2023, 01, 01));
        balanco.setResponsavel("Maria Laura");
        balanco.addOperacoes(venda);
        balanco.addOperacoes(compra);
        balanco.addOperacoes(locacao);
        balanco.imprimirBalanco();
    }
}
