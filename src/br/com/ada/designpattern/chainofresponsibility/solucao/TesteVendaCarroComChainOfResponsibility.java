package br.com.ada.designpattern.chainofresponsibility.solucao;

import java.math.BigDecimal;

import br.com.ada.designpattern.chainofresponsibility.problema.Carro;
import br.com.ada.designpattern.chainofresponsibility.problema.Marca;

/**
 * Classe de teste para o padrão Chain of Responsibility.
 * 
 * O teste demonstra como a cadeia de responsabilidades de desconto é utilizada para calcular o valor de venda de um carro, 
 * aplicando diferentes regras de desconto de forma sequencial.
 */
public class TesteVendaCarroComChainOfResponsibility {
    public static void main(String[] args) {
        VendaCarroServiceComChainOfResponsibility vendaCarroService = new VendaCarroServiceComChainOfResponsibility();

        Carro carro1 = new Carro();
        carro1.setMarca(Marca.FORD);
        carro1.setModelo("Fusion");
        carro1.setPreco(new BigDecimal(90000.00));

        BigDecimal valorVenda1 = vendaCarroService.calculaValorVenda(carro1);
        System.out.println("Valor de venda " + carro1.getModelo() + ": " + carro1.getPreco());
        System.out.println("Valor de venda " + carro1.getModelo() + " com desconto: " + valorVenda1);
        
        Carro carro2 = new Carro();
        carro2.setMarca(Marca.FIAT);
        carro2.setModelo("Uno");
        carro2.setPreco(new BigDecimal(40000.00));
        
        BigDecimal valorVenda2 = vendaCarroService.calculaValorVenda(carro2);
        System.out.println("Valor de venda " + carro2.getModelo() + ": " + carro2.getPreco());
        System.out.println("Valor de venda " + carro2.getModelo() + " com desconto: " + valorVenda2);
        
        Carro carro3 = new Carro();
        carro3.setMarca(Marca.CHEVROLET);
        carro3.setModelo("Camaro");
        carro3.setPreco(new BigDecimal(200000.00));
        
        BigDecimal valorVenda3 = vendaCarroService.calculaValorVenda(carro3);
        System.out.println("Valor de venda " + carro3.getModelo() + ": " + carro3.getPreco());
        System.out.println("Valor de venda " + carro3.getModelo() + " com desconto: " + valorVenda3);
    }
}