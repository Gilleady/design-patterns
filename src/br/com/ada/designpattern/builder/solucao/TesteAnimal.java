package br.com.ada.designpattern.builder.solucao;

public class TesteAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal.AnimalBuilder().nome("Rex").raca("Pastor Alemao").dono("Gilleady").build();

        System.out.println(animal);
    }
}
