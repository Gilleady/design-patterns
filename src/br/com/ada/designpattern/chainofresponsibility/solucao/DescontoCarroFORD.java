package br.com.ada.designpattern.chainofresponsibility.solucao;

import java.math.BigDecimal;

import br.com.ada.designpattern.chainofresponsibility.problema.Carro;
import br.com.ada.designpattern.chainofresponsibility.problema.Marca;

/**
 * Classe que implementa a regra de desconto para carros da marca FORD.
 * 
 * O desconto para carros FORD é de R$ 2.000,00.
 */
public class DescontoCarroFORD extends DescontoCarro {

    /**
     * Construtor da classe DescontoCarroFORD.
     * 
     * @param proximDesconto O próximo desconto na cadeia.
     */
    public DescontoCarroFORD(DescontoCarro proximDesconto) {
        super(proximDesconto);
    }

    /**
     * Aplica o desconto para carros FORD, caso a marca seja FORD, 
     * ou delega a aplicação do desconto para o próximo desconto na cadeia.
     * 
     * @param carro O carro a ter o desconto aplicado.
     * @return O valor do desconto aplicado.
     */
    @Override
    public BigDecimal aplicaDesconto(Carro carro) {
        BigDecimal valorVenda = carro.getPreco();
        
        if (Marca.FORD.equals(carro.getMarca())) {
            return valorVenda.subtract(new BigDecimal(2000));
        }

        return proximDesconto.aplicaDesconto(carro);
    }
    
}