package br.com.ada.designpattern.templatemethod.problema;

public class TesteReparaVeiculos {
    public static void main(String[] args) {
        System.out.println("-------------------LUXO-------------------");
        VeiculoParaReparo veiculoDeLuxo = new VeiculoParaReparo();
        veiculoDeLuxo.setPorcentagemDano(51);

        ReparaVeiculoDeLuxoService rpl = new ReparaVeiculoDeLuxoService(veiculoDeLuxo);

        rpl.reparaVeiculo();
        
        System.out.println("-------------------COMUM-------------------");
        VeiculoParaReparo veiculoComum = new VeiculoParaReparo();
        veiculoComum.setPorcentagemDano(69);

        ReparaVeiculoComumService rpc = new ReparaVeiculoComumService(veiculoComum);

        rpc.reparaVeiculo();
    }
}
