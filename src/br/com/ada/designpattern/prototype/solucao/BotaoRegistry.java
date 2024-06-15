package br.com.ada.designpattern.prototype.solucao;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import br.com.ada.designpattern.prototype.problema.Botao;
import br.com.ada.designpattern.prototype.problema.TipoBordaEnum;

/**
 * Classe que implementa o padrão Prototype para a criação de botões.
 * 
 * O Prototype é utilizado para criar novas instâncias de botões a partir de um protótipo existente, 
 * evitando a necessidade de criar a instância do zero. Isso permite a criação eficiente de cópias de botões com 
 * configurações já definidas.
 * 
 * O BotaoRegistry armazena um conjunto de botões protótipo que podem ser clonados para criar novos botões.
 * 
 */
public class BotaoRegistry {

    /**
     * Instância única da classe BotaoRegistry.
     */
    private static BotaoRegistry botaoRegistry;

    /**
     * Mapa que armazena os botões protótipo, com chaves para identificação.
     */
    private static Map<String, Botao> REGISTRY = new HashMap<>();

    /**
     * Bloco de inicialização estático que cria os protótipos de botões.
     */
    static {
        Botao botaoAmarelo = new Botao();
        botaoAmarelo.setCor("Amarela");
        botaoAmarelo.setAltura(40);
        botaoAmarelo.setLargura(100);
        botaoAmarelo.setTipoBorda(TipoBordaEnum.TRACEJADA);

        Botao botaoVermelho  = new Botao();
        botaoVermelho.setCor("Vermelha");
        botaoVermelho.setAltura(30);
        botaoVermelho.setLargura(100);
        botaoVermelho.setTipoBorda(TipoBordaEnum.FINA);

        Botao botaoAzul = new Botao();
        botaoAzul.setCor("Azul");
        botaoAzul.setAltura(35);
        botaoAzul.setLargura(125);
        botaoAzul.setTipoBorda(TipoBordaEnum.TRACEJADA);

        REGISTRY.put("BOTAO_AMARELO", botaoAmarelo);
        REGISTRY.put("BOTAO_VERMELHO", botaoVermelho);
        REGISTRY.put("BOTAO_AZUL", botaoAzul);
    }
    
    /**
     * Método estático para obter a instância única do BotaoRegistry.
     * 
     * @return A instância única do BotaoRegistry.
     */
    public static BotaoRegistry getInstace() {
        if (Objects.isNull(botaoRegistry)){
            botaoRegistry = new BotaoRegistry();
        }
        return botaoRegistry;
    }

    /**
     * Retorna um novo botão clonado a partir do protótipo especificado pela chave.
     * 
     * @param chave A chave do protótipo a ser clonado.
     * @return Um novo botão clonado a partir do protótipo.
     */
    public static Botao getBotao(String chave) {
        return BotaoFactory.getInstance(REGISTRY.get(chave));
    }

    /**
     * Adiciona um novo protótipo de botão ao registry.
     * 
     * @param chave A chave para identificar o protótipo.
     * @param botao O protótipo de botão a ser adicionado.
     */
    public static void addRegistry(String chave, Botao botao) {
        REGISTRY.put(chave, botao);
    }

}