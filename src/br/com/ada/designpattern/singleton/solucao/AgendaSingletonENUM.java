package br.com.ada.designpattern.singleton.solucao;

import java.util.HashMap;
import java.util.Map;

/**
 * Implementa o padrão Singleton com a abordagem Enum.
 * 
 * Essa abordagem é considerada a melhor prática para implementar o padrão Singleton, pois é thread-safe, 
 * serializable e garante que a instância seja única mesmo em situações complexas.
 */
public enum AgendaSingletonENUM {

    /**
     * Instância única da classe, definida como um enum.
     */
    INSTANCE;

    /**
     * Mapa que armazena os dias da semana e sua disponibilidade.
     */
    private Map<String, Boolean> dias = new HashMap<>();

    /**
     * Construtor privado, chamado automaticamente quando a classe é carregada.
     */
    private AgendaSingletonENUM() {
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
    public static AgendaSingletonENUM getInstance() {
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