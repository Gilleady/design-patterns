package br.com.ada.designpattern.prototype.problema;

public class BotaoAmarelo extends Botao {
    public BotaoAmarelo() {
        setCor("Amarela");
        setAltura(40);
        setLargura(100);
        setTipoBorda(TipoBordaEnum.TRACEJADA);
    }
}
