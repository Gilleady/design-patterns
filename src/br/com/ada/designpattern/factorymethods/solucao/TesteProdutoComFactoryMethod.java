package br.com.ada.designpattern.factorymethods.solucao;

/**
 * Classe de teste que demonstra a utilização do padrão Factory Method para criar instâncias de Produto.
 */
public class TesteProdutoComFactoryMethod {
    public static void main(String[] args) {
        Produto produtoDigital = ProdutoFactory.getInstance(TipoProdutoEnum.DIGITAL);
        Produto produtoFisico = ProdutoFactory.getInstance(TipoProdutoEnum.FISICO);

        System.out.println(produtoDigital);
        System.out.println(produtoFisico);

    }
}