package br.com.ada.designpattern.strategy.problema;

import java.math.BigDecimal;

public class ReajusteAnualSalario {
    public void calculaReajusteAnual(Funcionario funcionario){

        if (TipoContratacaoEnum.CLT.name().equals(funcionario.getTipoContratacao().name())) {
            BigDecimal salario = funcionario.getSalario();
            funcionario.setSalario(salario.add(salario.multiply(new BigDecimal(0.10))));
            
        } else if (TipoContratacaoEnum.PJ.name().equals(funcionario.getTipoContratacao().name())) {
            BigDecimal salario = funcionario.getSalario();
            funcionario.setSalario(salario.add(salario.multiply(new BigDecimal(0.05))));
            
        } else if (TipoContratacaoEnum.ESTAGIO.name().equals(funcionario.getTipoContratacao().name())) {
            BigDecimal salario = funcionario.getSalario();
            funcionario.setSalario(salario.add(salario.multiply(new BigDecimal(0.02))));
            
        }
    }
}
