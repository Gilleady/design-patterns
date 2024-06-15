package br.com.ada.designpattern.chainofresponsibility.solucao;

import java.math.BigDecimal;

import br.com.ada.designpattern.chainofresponsibility.problema.Carro;
import br.com.ada.designpattern.chainofresponsibility.problema.Marca;

/**
 * Classe que implementa a regra de desconto para carros da marca FIAT.
 * 
 * O desconto para carros FIAT é de R$ 1.000,00.
 */
public class DescontoCarroFIAT extends DescontoCarro {

    /**
     * Construtor da classe DescontoCarroFIAT.
     * 
     * @param proximDesconto O próximo desconto na cadeia.
     */
    public DescontoCarroFIAT(DescontoCarro proximDesconto) {
        super(proximDesconto);
    }

    /**
     * Aplica o desconto para carros FIAT, caso a marca seja FIAT, 
     * ou delega a aplicação do desconto para o próximo desconto na cadeia.
     * 
     * @param carro O carro a ter o desconto aplicado.
     * @return O valor do desconto aplicado.
     */
    @Override
    public BigDecimal aplicaDesconto(Carro carro) {
        BigDecimal valorVenda = carro.getPreco();

        if (Marca.FIAT.equals(carro.getMarca())) {
            return valorVenda.subtract(new BigDecimal(1000));
        }

        return proximDesconto.aplicaDesconto(carro);
    }
    
}