package org.example;

import org.example.model.*;

import java.time.LocalDate;

public class Application {

    public Application() {
    }

    public static void main(String[] args) {
//        Produto produto = new Produto();
//        produto.setNome("Impressora 3D HP");
//        produto.setDescricao("Impressora 3D filamento XYZ");
//        produto.setDataPrazo(LocalDate.of(2023, 01, 15));
//        produto.setPrecoCompra(1200.00);
//        produto.setValorUnitario(1400.00);
//        produto.setStatus(Status.DISPONIVEL);
//
//        Fornecedor dell = new Fornecedor();
//        dell.setNome("Dell Computadores");
//        dell.setCnpj("123456789");
//        dell.setInscricaoEstadual("123456789");
//        dell.setEmail("comercial@dell.com.br");
//        dell.setEndereco("Rua 1, 123");
//
//        System.out.println("Fornecedor: " + dell.getNome());
//
//        Cliente Bruno = new Cliente();
//        Bruno.setNome("Bruno");
//        Bruno.setCpf("123456789");
//        Bruno.setRg("123456789");
//        Bruno.setEmail("bruno.kurzawe@betha.com.br");
//        Bruno.setTelefone("48 999089410");
//        Bruno.setEndereco("Rua 1, 123");
//
//        System.out.println("Cliente: " + Bruno.getNome());
//
//        Venda venda01 = new Venda();
//        venda01.setId(10L);
//        venda01.setDataVenda(LocalDate.of(2023, 1, 1));
//        venda01.setCliente(Bruno);
//        venda01.setFormaPagamento(FormaPagamento.CARTAO_CREDITO);
//        venda01.setObservacao("Venda de impressora 3D");
//
//        System.out.println("Venda: " + venda01.getFormaPagamento());
//
//        Produto produto01 = new Produto("Computador", "I5 8gb");
//        ItemVenda itemVenda01 = new ItemVenda(produto01, 100.0, 1.0, 10.0);
//        venda01.addItemVenda(itemVenda01);
//
//        Produto produto02 = new Produto("Computador", "I7 8gb");
//        ItemVenda itemVenda02 = new ItemVenda(produto02, 50.0, 1.0, 10.0);
//        venda01.addItemVenda(itemVenda02);
//
//        System.out.println("Valor total da venda: " + venda01.getItens());

        //Declaração de fornecedor
        Fornecedor fornecedor = new Fornecedor();
        fornecedor.setNome("Dell Ltda");


//Declaração de cliente
        Cliente cliente = new Cliente();
        cliente.setNome("Bruno Kurzawe");


//Declaração de Produto
        Produto produto = new Produto("Computador", "I5 8gb");
        Servico servico = new Servico("Instalação Office", 2.0, 100.00);


//Declaração de Compras
        Compra compra = new Compra();
        compra.setDataCompra(LocalDate.now());
        compra.setFornecedor(fornecedor);
        ItemCompra itemC1 = new ItemCompra(produto, 1000.00, 10.0, 10.0);
        compra.addItemCompra(itemC1);


//Declaração de Vendas
        Venda venda = new Venda();
        venda.setDataVenda(LocalDate.now());
        venda.setCliente(cliente);
        ItemVenda item = new ItemVenda(produto, 1500.00, 1.0, 10.0);
        venda.addItemVenda(item);


        Venda venda2 = new Venda();
        venda2.setDataVenda(LocalDate.now());
        venda2.setCliente(cliente);
        ItemVenda item2 = new ItemVenda(produto, 1500.00, 1.0, 10.0);
        venda2.addItemVenda(item2);
        ItemVenda item3 = new ItemVenda(servico, 150.00, 1.0, 10.0);
        venda2.addItemVenda(item3);


//Declaração de Lotacao
        Locacao locacao = new Locacao();
        locacao.setCliente(cliente);
        locacao.setDataLocacao(LocalDate.now());
        ItemLocacao itemL1 = new ItemLocacao(produto, 150.00, 10.0, 0.0);
        locacao.addItemLocacao(itemL1);

        Balanco balanco = new Balanco();
        balanco.setId(352578L);
        balanco.setDataBalanco(LocalDate.now());
    }


}
