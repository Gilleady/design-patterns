package br.com.ada.designpattern.strategy.problema;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class Funcionario {
    
    private String nome;

    private BigDecimal salario;

    private TipoContratacaoEnum tipoContratacao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public TipoContratacaoEnum getTipoContratacao() {
        return tipoContratacao;
    }

    public void setTipoContratacao(TipoContratacaoEnum tipoContratacao) {
        this.tipoContratacao = tipoContratacao;
    }

    @Override
    public String toString() {
        return "Funcionario [nome=" + nome + ", salario=" + NumberFormat.getCurrencyInstance().format(salario) + ", tipoContratacao=" + tipoContratacao + "]";
    }
}
