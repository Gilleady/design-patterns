package br.com.ada.designpattern.chainofresponsibility.solucao;

import java.math.BigDecimal;

import br.com.ada.designpattern.chainofresponsibility.problema.Carro;

/**
 * Classe abstrata que representa a base para a cadeia de responsabilidades de desconto para carros.
 * 
 * O padrão Chain of Responsibility é implementado utilizando essa classe, 
 * permitindo que diferentes regras de desconto sejam encadeadas para aplicar descontos cumulativos.
 * 
 * Cada classe concreta que herda de DescontoCarro implementa uma regra específica de desconto.
 */
public abstract class DescontoCarro {
    
    /**
     * O próximo desconto na cadeia de responsabilidades.
     */
    protected DescontoCarro proximDesconto;

    /**
     * Construtor da classe DescontoCarro.
     * 
     * @param proximDesconto O próximo desconto na cadeia.
     */
    public DescontoCarro(DescontoCarro proximDesconto) {
        this.proximDesconto = proximDesconto;
    }

    /**
     * Método abstrato que aplica o desconto ao carro.
     * 
     * @param carro O carro a ter o desconto aplicado.
     * @return O valor do desconto aplicado.
     */
    public abstract BigDecimal aplicaDesconto(Carro carro);
}