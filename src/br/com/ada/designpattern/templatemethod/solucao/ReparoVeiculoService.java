package br.com.ada.designpattern.templatemethod.solucao;

/**
 * Classe abstrata que define o template method para o processo de reparo de um veículo.
 * 
 * O padrão Template Method é implementado utilizando essa classe, definindo um algoritmo 
 * geral para o processo de reparo, com algumas etapas específicas a serem implementadas pelas 
 * subclasses.
 * 
 * As subclasses podem personalizar o comportamento do processo de reparo sobrescrevendo 
 * o método `veiculoParaReparo`, que determina se o veículo deve ser reparado ou se é um caso de perda total.
 */
public abstract class ReparoVeiculoService {
    
    /**
     * Método que executa o processo de reparo do veículo.
     * 
     * Esse método implementa o algoritmo geral do processo de reparo, delegando algumas 
     * etapas específicas para as subclasses.
     */
    public void reparaVeiculo(){
        entradaOficina();
        analisarDanos();
        if (veiculoParaReparo()){
            repararVeiculo();
            notificarReparoParaSeguradora();
        } else {
            notificarPerdaTotalParaSeguradora();
        }
    }

    /**
     * Método abstrato que deve ser implementado pelas subclasses para determinar 
     * se o veículo deve ser reparado ou se é um caso de perda total.
     * 
     * @return True se o veículo deve ser reparado, false caso contrário.
     */
    protected abstract boolean veiculoParaReparo();

    /**
     * Método privado para notificar a seguradora sobre a perda total do veículo.
     */
    private void notificarPerdaTotalParaSeguradora() {
        System.out.println("Notificando perda total para seguradora...");
    }

    /**
     * Método privado para notificar a seguradora sobre o reparo do veículo.
     */
    private void notificarReparoParaSeguradora() {
        System.out.println("Notificando reparo para seguradora...");
    }

    /**
     * Método privado para realizar o reparo do veículo.
     */
    private void repararVeiculo() {
        System.out.println("Reparando veiculo...");
    }

    /**
     * Método privado para analisar os danos do veículo.
     */
    private void analisarDanos() {
        System.out.println("Analisando danos...");
    }

    /**
     * Método privado para registrar a entrada do veículo na oficina.
     */
    private void entradaOficina() {
        System.out.println("Veiculo entrando oficina...");
    }
}