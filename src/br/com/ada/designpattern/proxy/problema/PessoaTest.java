package br.com.ada.designpattern.proxy.problema;

import java.time.LocalDate;

import br.com.ada.designpattern.builder.solucao.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        PessoaService pessoaService = new PessoaService(new PessoaRepository());

        Pessoa pessoa = new Pessoa.PessoaBuilder()
                            .sobreNome("Alves")
                            .dataNascimento(LocalDate.of(2003, 01, 11))
                            .nome("Gilleady")
                            .apelido("Gil")
                            .documento("12345678900")
                            .build();

        pessoaService.save(pessoa);

        Pessoa pessoaRetornada = pessoaService.findById(1L);
        System.out.println(pessoaRetornada);

    }
}
