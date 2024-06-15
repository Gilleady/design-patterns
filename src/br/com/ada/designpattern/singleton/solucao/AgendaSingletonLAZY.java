package br.com.ada.designpattern.singleton.solucao;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Implementa o padrão Singleton com a abordagem Lazy Initialization.
 * 
 * A instância da classe é criada somente quando a primeira chamada ao método getInstance() é feita.
 * Essa abordagem garante a instância única da classe e a inicialização somente quando necessário, mas pode trazer
 * penalidades de desempenho se a instância for frequentemente utilizada.
 */
public class AgendaSingletonLAZY {
    /**
     * Instância única da classe, inicializada como null.
     */
    private static AgendaSingletonLAZY INSTANCE = null;

    /**
     * Mapa que armazena os dias da semana e sua disponibilidade.
     */
    private Map<String, Boolean> dias = new HashMap<>();

    /**
     * Construtor privado para evitar a criação de novas instâncias.
     */
    private AgendaSingletonLAZY() {
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
     * A instância é criada somente na primeira chamada ao método.
     * 
     * @return A instância única da classe.
     */
    public static AgendaSingletonLAZY getInstance() {
        if (Objects.isNull(INSTANCE)) {
            INSTANCE = new AgendaSingletonLAZY();
        }
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