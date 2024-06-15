package br.com.ada.designpattern.adapter.problema;

import java.math.BigDecimal;

/**
 * Classe que representa um conjunto de operações para uma conta corrente, 
 * implementada em um sistema legado (Jar).
 * 
 * Essa classe possui métodos para validar o saldo, sacar e depositar valores na conta.
 * No entanto, a interface da classe não é compatível com o padrão de projeto esperado 
 * no sistema atual.
 */
public class JarOperacoesContaCorrente {
    
    /**
     * Valida se o saldo da conta é suficiente para o saque.
     * 
     * @param valorPretendidoSaque O valor a ser sacado.
     * @return True se o saldo for suficiente, false caso contrário.
     */
    public boolean validaSaldo(BigDecimal valorPretendidoSaque) {
        System.out.println("Validando o saldo...");
        return true; // No exemplo, sempre retorna true para fins de demonstração.
    }

    /**
     * Realiza o saque do valor especificado.
     * 
     * @param valorPretendido O valor a ser sacado.
     */
    public void saca(BigDecimal valorPretendido) {
        System.out.println("Sacando...");
    }

    /**
     * Realiza o depósito do valor especificado.
     * 
     * @param valor O valor a ser depositado.
     */
    public void deposita(BigDecimal valor) {
        System.out.println("Depositando...");
    }
}