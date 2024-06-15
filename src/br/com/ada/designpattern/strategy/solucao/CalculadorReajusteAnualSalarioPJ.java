package br.com.ada.designpattern.strategy.solucao;

import java.math.BigDecimal;

import br.com.ada.designpattern.strategy.problema.Funcionario;

/**
 * Classe que implementa a estratégia de cálculo do reajuste anual para funcionários PJ.
 * 
 * O reajuste para funcionários PJ é de 5% do salário atual.
 */
public class CalculadorReajusteAnualSalarioPJ implements CalculadorReajusteAnualSalario {

    @Override
    public void calcularReajusteAnual(Funcionario funcionario) {
        BigDecimal salario = funcionario.getSalario();
        funcionario.setSalario(salario.add(salario.multiply(new BigDecimal(0.05))));
    }
    
}