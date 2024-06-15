package br.com.ada.designpattern.factorymethods.problema;

public class TesteProduto {
    public static void main(String[] args) {
        ProdutoFisico ProdutoFisico = new ProdutoFisico();
        ProdutoFisico.setPossuiDimensoesFisicas(true);

        ProdutoDigital produtoDigital = new ProdutoDigital();
        produtoDigital.setPossuiDimensoesFisicas(false);



        
    }
}
