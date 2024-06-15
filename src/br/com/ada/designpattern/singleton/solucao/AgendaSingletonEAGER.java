package br.com.ada.designpattern.singleton.solucao;

import java.util.HashMap;
import java.util.Map;

/**
 * Implementa o padrão Singleton com a abordagem Eager Initialization.
 * 
 * A instância da classe é criada no momento da inicialização da classe, garantindo que a instância esteja sempre disponível.
 * Essa abordagem garante a instância única da classe, mas a inicialização ocorre mesmo que a instância não seja utilizada.
 */
public class AgendaSingletonEAGER {
    /**
     * Instância única da classe, criada no momento da inicialização da classe.
     */
    private static final AgendaSingletonEAGER INSTANCE = new AgendaSingletonEAGER();

    /**
     * Mapa que armazena os dias da semana e sua disponibilidade.
     */
    private Map<String, Boolean> dias = new HashMap<>();

    /**
     * Construtor privado para evitar a criação de novas instâncias.
     */
    private AgendaSingletonEAGER() {
        dias.put("Domingo", Boolean.TRUE);
        dias.put("Segunda", Boolean.TRUE);
        dias.put("Terça", Boolean.TRUE);
        dias.put("Quarta", Boolean.TRUE);
        dias.put("Quinta", Boolean.TRUE);
        dias.put("Sexta", Boolean.TRUE);
        dias.put("Sábado", Boolean.TRUE);
    }

    /**
     * Método estático para retornar a instância única da classe.
     * 
     * @return A instância única da classe.
     */
    public static AgendaSingletonEAGER getInstance() {
        return INSTANCE;
    }

    /**
     * Retorna o mapa de dias da semana.
     * 
     * @return O mapa de dias da semana.
     */
    public Map<String, Boolean> getDias() {
        return dias;
    }

    /**
     * Ocupa um dia da semana, tornando-o indisponível.
     * 
     * @param dia O dia da semana a ser ocupado.
     */
    public void ocupa(String dia) {
        dias.replace(dia, Boolean.FALSE);
    }
}