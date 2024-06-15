package br.com.ada.designpattern.adapter.solucao;

import java.math.BigDecimal;

import br.com.ada.designpattern.adapter.problema.JarOperacoesContaCorrente;

/**
 * Classe de teste para o padrão Adapter.
 * 
 * O teste demonstra como o Adapter permite que o código cliente interaja com a classe 
 * JarOperacoesContaCorrente, que possui uma interface diferente do padrão esperado 
 * no sistema atual.
 */
public class TesteOperacoesContaCorrenteAdapter {
    public static void main(String[] args) {
        JarOperacoesContaCorrente jarConta = new JarOperacoesContaCorrente();
        JarOperacoesContaCorrenteAdapter jarContaAdapter = new JarOperacoesContaCorrenteAdapter(jarConta);
        ClientJarOperacoesContaCorrenteAdapter client = new ClientJarOperacoesContaCorrenteAdapter(jarContaAdapter);

        BigDecimal valorPretendidoSaque = new BigDecimal(1000);
        
        client.saca(valorPretendidoSaque);
        
        client.deposita(new BigDecimal(500));
    }
    
}