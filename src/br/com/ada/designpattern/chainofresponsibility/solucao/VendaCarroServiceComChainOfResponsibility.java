package br.com.ada.designpattern.chainofresponsibility.solucao;

import java.math.BigDecimal;

import br.com.ada.designpattern.chainofresponsibility.problema.Carro;

/**
 * Classe que encapsula a lógica de cálculo do valor de venda de um carro, utilizando o padrão Chain of Responsibility.
 * 
 * A classe VendaCarroServiceComChainOfResponsibility define uma cadeia de responsabilidades de desconto para carros, 
 * permitindo que diferentes regras de desconto sejam aplicadas de forma sequencial.
 */
public class VendaCarroServiceComChainOfResponsibility {

    /**
     * Calcula o valor de venda do carro, aplicando os descontos da cadeia de responsabilidades.
     * 
     * @param carro O carro a ter o valor de venda calculado.
     * @return O valor de venda do carro, após a aplicação dos descontos.
     */
    public BigDecimal calculaValorVenda(Carro carro) {

        /**
         * Cria a cadeia de responsabilidades de desconto.
         * 
         * A cadeia é criada encadeando os diferentes tipos de desconto:
         * 
         * 1. DescontoCarroFIAT: Verifica se o carro é FIAT e aplica o desconto de R$ 1.000,00.
         * 2. DescontoCarroFORD: Verifica se o carro é FORD e aplica o desconto de R$ 2.000,00.
         * 3. DescontoCarroValorMaiorQueCemMil: Verifica se o valor do carro é maior que R$ 100.000,00 e aplica o desconto de R$ 10.000,00.
         * 4. SemDireitoADesconto: Representa o fim da cadeia, não aplicando nenhum desconto.
         * 
         * Se o carro não atender a nenhuma das regras de desconto, o desconto final será R$ 0,00.
         */
        DescontoCarroFIAT desconto = new DescontoCarroFIAT(
                new DescontoCarroFORD(
                    new DescontoCarroValorMaiorQueCemMil(
                        new SemDireitoADesconto(null))));

        return desconto.aplicaDesconto(carro);
    }
}