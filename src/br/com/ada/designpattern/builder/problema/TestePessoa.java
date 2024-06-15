package br.com.ada.designpattern.builder.problema;

import java.time.LocalDate;

public class TestePessoa {
    public static void main(String[] args) {
        /* Dificil de identificar sem design-patterns o que é cada parâmetro */
        Pessoa pessoa = new Pessoa("Gilleady",
        "Alves",
        "12345678900",
        "teste@teste.com",
        "Gil",
        LocalDate.of(2003, 01, 11));

        System.out.println(pessoa);
    }
}
