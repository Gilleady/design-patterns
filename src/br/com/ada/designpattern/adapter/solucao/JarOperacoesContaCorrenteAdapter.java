package br.com.ada.designpattern.adapter.solucao;

import java.math.BigDecimal;

import br.com.ada.designpattern.adapter.problema.JarOperacoesContaCorrente;

/**
 * Classe Adapter que adapta a interface da classe JarOperacoesContaCorrente 
 * para a interface esperada no sistema atual.
 * 
 * O Adapter encapsula a classe JarOperacoesContaCorrente e fornece uma interface 
 * compatível com o sistema atual, permitindo que o código cliente interaja com a 
 * classe JarOperacoesContaCorrente sem precisar se preocupar com sua interface original.
 */
public class JarOperacoesContaCorrenteAdapter {
    
    /**
     * Instância da classe JarOperacoesContaCorrente a ser adaptada.
     */
    private JarOperacoesContaCorrente jarConta;

    /**
     * Construtor da classe JarOperacoesContaCorrenteAdapter.
     * 
     * @param jarConta A instância da classe JarOperacoesContaCorrente a ser adaptada.
     */
    public JarOperacoesContaCorrenteAdapter(JarOperacoesContaCorrente jarConta) {
        this.jarConta = jarConta;
    }

    /**
     * Realiza o saque, validando o saldo antes de executar a operação.
     * 
     * @param valorPretendido O valor a ser sacado.
     */
    public void saca(BigDecimal valorPretendido) {
        if (jarConta.validaSaldo(valorPretendido)) {
            jarConta.saca(valorPretendido);
        } else {
            throw new IllegalArgumentException("Valor para saque não permitido");
        }
    }

    /**
     * Realiza o depósito, delegando a operação para a classe JarOperacoesContaCorrente.
     * 
     * @param valor O valor a ser depositado.
     */
    public void deposita(BigDecimal valor) {
        jarConta.deposita(valor);
    }
    
}