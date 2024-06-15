package br.com.ada.designpattern.chainofresponsibility.solucao;

import java.math.BigDecimal;

import br.com.ada.designpattern.chainofresponsibility.problema.Carro;

/**
 * Classe que representa o fim da cadeia de responsabilidades de desconto.
 * 
 * Essa classe não aplica nenhum desconto, indicando que o carro não tem direito a desconto.
 */
public class SemDireitoADesconto extends DescontoCarro {

    /**
     * Construtor da classe SemDireitoADesconto.
     * 
     * @param proximDesconto O próximo desconto na cadeia. Como essa classe é o fim da cadeia, o próximo desconto é null.
     */
    public SemDireitoADesconto(DescontoCarro proximDesconto) {
        super(proximDesconto);
    }

    /**
     * Não aplica nenhum desconto, retornando 0.
     * 
     * @param carro O carro a ter o desconto aplicado.
     * @return O valor do desconto aplicado (0).
     */
    @Override
    public BigDecimal aplicaDesconto(Carro carro) {
        return BigDecimal.ZERO;
    }
}