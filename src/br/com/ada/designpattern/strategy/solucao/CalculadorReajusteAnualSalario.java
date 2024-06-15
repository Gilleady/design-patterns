package br.com.ada.designpattern.strategy.solucao;

import br.com.ada.designpattern.strategy.problema.Funcionario;

/**
 * Interface que define o contrato para calcular o reajuste anual do salário de um funcionário.
 * 
 * O padrão Strategy é implementado utilizando essa interface para definir diferentes algoritmos de reajuste, 
 * encapsulando a lógica de cálculo em classes separadas.
 */
public interface CalculadorReajusteAnualSalario {
    
    /**
     * Calcula o reajuste anual do salário do funcionário.
     * 
     * @param funcionario O funcionário a ter o salário reajustado.
     */
    void calcularReajusteAnual(Funcionario funcionario);
}