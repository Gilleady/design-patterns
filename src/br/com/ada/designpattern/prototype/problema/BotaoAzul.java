package br.com.ada.designpattern.prototype.problema;

public class BotaoAzul extends Botao {
    public BotaoAzul() {
        setCor("Azul");
        setAltura(35);
        setLargura(125);
        setTipoBorda(TipoBordaEnum.TRACEJADA);
    }
}
