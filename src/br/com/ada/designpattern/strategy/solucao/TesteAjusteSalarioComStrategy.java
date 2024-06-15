package br.com.ada.designpattern.strategy.solucao;

import java.math.BigDecimal;

import br.com.ada.designpattern.strategy.problema.Funcionario;
import br.com.ada.designpattern.strategy.problema.TipoContratacaoEnum;

/**
 * Classe de teste para o padrão Strategy.
 * 
 * O teste demonstra como o padrão Strategy é utilizado para calcular o reajuste anual de salário 
 * de acordo com o tipo de contratação do funcionário.
 * 
 * Cada tipo de contratação possui um algoritmo de cálculo de reajuste específico, definido em classes 
 * separadas que implementam a interface CalculadorReajusteAnualSalario.
 */
public class TesteAjusteSalarioComStrategy {
    public static void main(String[] args) {
        ReajusteAnualSalarioComStrategy reajusteAnualSalario = new ReajusteAnualSalarioComStrategy();
        Funcionario funcionarioCLT = new Funcionario();
        funcionarioCLT.setNome("Victor");
        funcionarioCLT.setTipoContratacao(TipoContratacaoEnum.CLT);
        funcionarioCLT.setSalario(new BigDecimal(5000));
        
        Funcionario funcionarioPJ = new Funcionario();
        funcionarioPJ.setNome("Podolski");
        funcionarioPJ.setTipoContratacao(TipoContratacaoEnum.PJ);
        funcionarioPJ.setSalario(new BigDecimal(10000));
        
        Funcionario funcionarioEstagio = new Funcionario();
        funcionarioEstagio.setNome("Osvaldo");
        funcionarioEstagio.setTipoContratacao(TipoContratacaoEnum.ESTAGIO);
        funcionarioEstagio.setSalario(new BigDecimal(2000));
        
        Funcionario funcionarioCooperativa = new Funcionario();
        funcionarioCooperativa.setNome("Osvaldo");
        funcionarioCooperativa.setTipoContratacao(TipoContratacaoEnum.COOPERATIVA);
        funcionarioCooperativa.setSalario(new BigDecimal(8000));

        //calcular os reajustes aqui
        reajusteAnualSalario.calculaReajusteAnual(funcionarioCLT, new CalculadorReajusteAnualSalarioCLT());
        reajusteAnualSalario.calculaReajusteAnual(funcionarioPJ, new CalculadorReajusteAnualSalarioPJ());
        reajusteAnualSalario.calculaReajusteAnual(funcionarioEstagio, new CalculadorReajusteAnualSalarioEstagio());
        reajusteAnualSalario.calculaReajusteAnual(funcionarioCooperativa, new CalculadorReajusteAnualSalarioCooperativa());

        System.out.println(funcionarioCLT);
        System.out.println(funcionarioPJ);
        System.out.println(funcionarioEstagio);
        System.out.println(funcionarioCooperativa);
    }
}