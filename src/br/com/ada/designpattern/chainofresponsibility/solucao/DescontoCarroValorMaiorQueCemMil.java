package br.com.ada.designpattern.chainofresponsibility.solucao;

import java.math.BigDecimal;

import br.com.ada.designpattern.chainofresponsibility.problema.Carro;

/**
 * Classe que implementa a regra de desconto para carros com valor superior a R$ 100.000,00.
 * 
 * O desconto para carros com valor superior a R$ 100.000,00 é de R$ 10.000,00.
 */
public class DescontoCarroValorMaiorQueCemMil extends DescontoCarro {

    /**
     * Construtor da classe DescontoCarroValorMaiorQueCemMil.
     * 
     * @param proximDesconto O próximo desconto na cadeia.
     */
    public DescontoCarroValorMaiorQueCemMil(DescontoCarro proximDesconto) {
        super(proximDesconto);
    }

    /**
     * Aplica o desconto para carros com valor superior a R$ 100.000,00, 
     * ou delega a aplicação do desconto para o próximo desconto na cadeia.
     * 
     * @param carro O carro a ter o desconto aplicado.
     * @return O valor do desconto aplicado.
     */
    @Override
    public BigDecimal aplicaDesconto(Carro carro) {
        BigDecimal valorVenda = carro.getPreco();
        
        if (carro.getPreco().compareTo(new BigDecimal(100000.00)) > 0) {
            return valorVenda.subtract(new BigDecimal(10000));
        }

        return proximDesconto.aplicaDesconto(carro);
    }
    
}