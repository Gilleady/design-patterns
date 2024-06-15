package br.com.ada.designpattern.strategy.solucao;

import java.math.BigDecimal;

import br.com.ada.designpattern.strategy.problema.Funcionario;

/**
 * Classe que implementa a estratégia de cálculo do reajuste anual para estagiários.
 * 
 * O reajuste para estagiários é de 2% do salário atual.
 */
public class CalculadorReajusteAnualSalarioEstagio implements CalculadorReajusteAnualSalario {

    @Override
    public void calcularReajusteAnual(Funcionario funcionario) {
        BigDecimal salario = funcionario.getSalario();
        funcionario.setSalario(salario.add(salario.multiply(new BigDecimal(0.02))));
    }
    
}