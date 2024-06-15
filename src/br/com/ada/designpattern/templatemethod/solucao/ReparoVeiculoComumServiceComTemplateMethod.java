package br.com.ada.designpattern.templatemethod.solucao;

import br.com.ada.designpattern.templatemethod.problema.VeiculoParaReparo;

/**
 * Classe que implementa o processo de reparo para veículos comuns, utilizando o template method.
 * 
 * Essa classe sobrescreve o método `veiculoParaReparo` para determinar se o veículo comum deve ser 
 * reparado ou se é um caso de perda total.
 * 
 * Um veículo comum é considerado reparável se a porcentagem de dano for menor ou igual a 70%.
 */
public class ReparoVeiculoComumServiceComTemplateMethod extends ReparoVeiculoService {
    
    /**
     * O veículo a ser reparado.
     */
    private VeiculoParaReparo veiculoParaReparo;

    /**
     * Construtor da classe ReparoVeiculoComumServiceComTemplateMethod.
     * 
     * @param veiculoParaReparo O veículo a ser reparado.
     */
    public ReparoVeiculoComumServiceComTemplateMethod(VeiculoParaReparo veiculoParaReparo) {
        this.veiculoParaReparo = veiculoParaReparo;
    }

    /**
     * Implementa a regra de reparabilidade para veículos comuns, considerando a porcentagem de dano.
     * 
     * @return True se a porcentagem de dano for menor ou igual a 70%, false caso contrário.
     */
    @Override
    protected boolean veiculoParaReparo() {
        return veiculoParaReparo.getPorcentagemDano() <= 70;
    }
}