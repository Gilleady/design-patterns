package br.com.ada.designpattern.adapter.problema;

import java.math.BigDecimal;

public class TesteOperacoesContaCorrente {
    public static void main(String[] args) {
        
        JarOperacoesContaCorrente jarConta = new JarOperacoesContaCorrente();
        ClientJarOperacoesContaCorrente client = new ClientJarOperacoesContaCorrente(jarConta);

        BigDecimal valorPretendidoSaque = new BigDecimal(1000);
        if (client.validaSaldo(valorPretendidoSaque)) {
            client.saca(valorPretendidoSaque);
        }

        client.deposita(new BigDecimal(500));
    }
}
