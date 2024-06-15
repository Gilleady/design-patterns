package br.com.ada.designpattern.prototype.solucao;

import br.com.ada.designpattern.prototype.problema.Botao;

/**
 * Classe que cria clones de botões a partir de um protótipo.
 * 
 * A classe BotaoFactory implementa a lógica de clonagem, criando um novo botão com as mesmas configurações 
 * do protótipo fornecido.
 */
public class BotaoFactory {

    /**
     * Cria um novo botão a partir de um protótipo.
     * 
     * @param prototipo O protótipo a ser clonado.
     * @return Um novo botão clonado a partir do protótipo.
     */
    public static Botao getInstance(Botao prototipo) {
        Botao clone = new Botao();
        clone.setCor(prototipo.getCor());
        clone.setAltura(prototipo.getAltura());
        clone.setLargura(prototipo.getLargura());
        clone.setTipoBorda(prototipo.getTipoBorda());

        return clone;
    }

}