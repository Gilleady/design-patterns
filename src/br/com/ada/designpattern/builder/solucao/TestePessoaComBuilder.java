package br.com.ada.designpattern.builder.solucao;

import java.time.LocalDate;

/**
 * Classe de teste que demonstra a utilização do padrão Builder para criar uma instância de Pessoa.
 */
public class TestePessoaComBuilder {
    public static void main(String[] args) {
        // Cria uma nova instância de Pessoa utilizando o Builder
        Pessoa pessoa = new Pessoa.PessoaBuilder()
                .nome("Gilleady")
                .sobreNome("Alves")
                .documento("12345678900")
                .apelido("Gil")
                .email("teste@teste.com")
                .dataNascimento(LocalDate.of(2003, 01, 11))
                .build();

        // Imprime a instância de Pessoa criada
        System.out.println(pessoa);
    }
}