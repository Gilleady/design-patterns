package br.com.ada.designpattern.adapter.solucao;

import java.math.BigDecimal;

/**
 * Classe cliente que utiliza o Adapter para interagir com a classe JarOperacoesContaCorrente.
 * 
 * O ClientJarOperacoesContaCorrenteAdapter recebe uma instância do Adapter e 
 * utiliza seus métodos para realizar operações na conta corrente.
 */
public class ClientJarOperacoesContaCorrenteAdapter {
    
    
    /**
     * Instância do Adapter para a classe JarOperacoesContaCorrente.
     */
    private JarOperacoesContaCorrenteAdapter jarContaAdapter;

    /**
     * Construtor da classe ClientJarOperacoesContaCorrenteAdapter.
     * 
     * @param jarContaAdapter O Adapter para a classe JarOperacoesContaCorrente.
     */
    public ClientJarOperacoesContaCorrenteAdapter(JarOperacoesContaCorrenteAdapter jarContaAdapter) {
        this.jarContaAdapter = jarContaAdapter;
    }

    /**
     * Realiza o saque utilizando o Adapter.
     * 
     * @param valorPretendido O valor a ser sacado.
     */
    public void saca(BigDecimal valorPretendido) {
        jarContaAdapter.saca(valorPretendido);
    }

    /**
     * Realiza o depósito utilizando o Adapter.
     * 
     * @param valor O valor a ser depositado.
     */
    public void deposita(BigDecimal valor) {
        jarContaAdapter.deposita(valor);
    }
}