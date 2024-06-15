package br.com.ada.designpattern.factorymethods.solucao;

/**
 * Classe ProdutoFactory que implementa o padrão Factory Method para criar instâncias de Produto.
 *
 * A classe ProdutoFactory define um método estático getInstance que recebe um TipoProdutoEnum como parâmetro e
 * retorna uma instância de Produto do tipo especificado.
 */
public class ProdutoFactory {

    /**
     * Método estático que retorna uma instância de Produto de acordo com o TipoProdutoEnum.
     *
     * @param tipoProdutoEnum O tipo de produto a ser criado.
     * @return Uma instância de Produto do tipo especificado.
     */
    public static Produto getInstance(TipoProdutoEnum tipoProdutoEnum) {

        switch (tipoProdutoEnum) {
            case FISICO:
                ProdutoFisico produtoFisico = new ProdutoFisico();
                produtoFisico.setPossuiDimensoesFisicas(true);
                return produtoFisico;

            case DIGITAL:
                ProdutoDigital produtoDigital = new ProdutoDigital();
                produtoDigital.setPossuiDimensoesFisicas(false);
                return produtoDigital;

            default:
                throw new IllegalArgumentException("Tipo de Produto não disponível");
        }
    }
}