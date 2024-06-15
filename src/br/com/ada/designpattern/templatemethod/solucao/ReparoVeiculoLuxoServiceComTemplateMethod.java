package br.com.ada.designpattern.templatemethod.solucao;

import br.com.ada.designpattern.templatemethod.problema.VeiculoParaReparo;

/**
 * Classe que implementa o processo de reparo para veículos de luxo, utilizando o template method.
 * 
 * Essa classe sobrescreve o método `veiculoParaReparo` para determinar se o veículo de luxo deve ser 
 * reparado ou se é um caso de perda total.
 * 
 * Um veículo de luxo é considerado reparável se a porcentagem de dano for menor ou igual a 50%.
 */
public class ReparoVeiculoLuxoServiceComTemplateMethod extends ReparoVeiculoService {
    
    /**
     * O veículo a ser reparado.
     */
    private VeiculoParaReparo veiculoParaReparo;

    /**
     * Construtor da classe ReparoVeiculoLuxoServiceComTemplateMethod.
     * 
     * @param veiculoParaReparo O veículo a ser reparado.
     */
    public ReparoVeiculoLuxoServiceComTemplateMethod(VeiculoParaReparo veiculoParaReparo) {
        this.veiculoParaReparo = veiculoParaReparo;
    }

    /**
     * Implementa a regra de reparabilidade para veículos de luxo, considerando a porcentagem de dano.
     * 
     * @return True se a porcentagem de dano for menor ou igual a 50%, false caso contrário.
     */
    @Override
    protected boolean veiculoParaReparo() {
        return veiculoParaReparo.getPorcentagemDano() <= 50;
    }
}