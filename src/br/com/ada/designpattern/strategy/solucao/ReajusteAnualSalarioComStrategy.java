package br.com.ada.designpattern.strategy.solucao;

import br.com.ada.designpattern.strategy.problema.Funcionario;

/**
 * Classe que encapsula a lógica de cálculo do reajuste anual de salário.
 * 
 * Essa classe recebe um funcionário e um objeto que implementa a interface CalculadorReajusteAnualSalario, 
 * que define o algoritmo de cálculo do reajuste.
 * 
 * A classe ReajusteAnualSalarioComStrategy delega a responsabilidade de calcular o reajuste para 
 * a estratégia (objeto que implementa a interface CalculadorReajusteAnualSalario) fornecida como parâmetro.
 */
public class ReajusteAnualSalarioComStrategy {
    
    /**
     * Calcula o reajuste anual do salário do funcionário utilizando a estratégia fornecida.
     * 
     * @param funcionario O funcionário a ter o salário reajustado.
     * @param calculador O objeto que define o algoritmo de cálculo do reajuste.
     */
    public void calculaReajusteAnual(Funcionario funcionario, CalculadorReajusteAnualSalario calculador){

        calculador.calcularReajusteAnual(funcionario);
    }
}