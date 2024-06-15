package br.com.ada.designpattern.factorymethods.solucao;

import java.math.BigDecimal;

/**
 * Classe Produto que representa um produto genérico com descrição, preço e informação sobre a existência de dimensões físicas.
 *
 * Esta classe serve como base para as subclasses ProdutoFisico e ProdutoDigital, que implementam comportamentos específicos
 * para produtos físicos e digitais, respectivamente.
 */
public class Produto {
    private String descricao;
    private BigDecimal preco;
    private Boolean possuiDimensoesFisicas;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public Boolean getPossuiDimensoesFisicas() {
        return possuiDimensoesFisicas;
    }

    public void setPossuiDimensoesFisicas(Boolean possuiDimensoesFisicas) {
        this.possuiDimensoesFisicas = possuiDimensoesFisicas;
    }

    @Override
    public String toString() {
        return "Produto [descricao=" + descricao + ", preco=" + preco + ", possuiDimensoesFisicas="
                + possuiDimensoesFisicas + "]";
    }
}