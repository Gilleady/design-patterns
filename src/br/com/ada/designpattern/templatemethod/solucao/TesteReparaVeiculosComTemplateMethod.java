package br.com.ada.designpattern.templatemethod.solucao;

import br.com.ada.designpattern.templatemethod.problema.VeiculoParaReparo;

/**
 * Classe de teste para o padrão Template Method.
 * 
 * O teste demonstra como o padrão Template Method é utilizado para implementar o processo 
 * de reparo de veículos, com diferentes regras de reparabilidade para veículos comuns e de luxo.
 */
public class TesteReparaVeiculosComTemplateMethod {
    public static void main(String[] args) {
        System.out.println("-------------------LUXO-------------------");
        VeiculoParaReparo veiculoDeLuxo = new VeiculoParaReparo();
        veiculoDeLuxo.setPorcentagemDano(51);

        ReparoVeiculoService rpl = new ReparoVeiculoLuxoServiceComTemplateMethod(veiculoDeLuxo);

        rpl.reparaVeiculo();
        
        System.out.println("-------------------COMUM-------------------");
        VeiculoParaReparo veiculoComum = new VeiculoParaReparo();
        veiculoComum.setPorcentagemDano(69);

        ReparoVeiculoService rpc = new ReparoVeiculoComumServiceComTemplateMethod(veiculoComum);

        rpc.reparaVeiculo();
    }
}