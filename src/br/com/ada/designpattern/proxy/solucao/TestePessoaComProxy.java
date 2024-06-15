package br.com.ada.designpattern.proxy.solucao;

import java.time.LocalDate;

import br.com.ada.designpattern.builder.solucao.Pessoa;

/**
 * Classe de teste para o padrão Proxy.
 * 
 * O teste demonstra a utilização do Proxy para o repositório de pessoas, 
 * mostrando como o Proxy implementa o cache e o logging.
 */
public class TestePessoaComProxy {
    public static void main(String[] args) {
        PessoaRepositoryProxy pessoaRepositoryProxy = new PessoaRepositoryProxy();
        // Também pode ser chamado com outra classe proxy por conta do polimorfismo feito pela implementação da classe ProxyPessoa
        // NovoPessoaRepositoryProxy novoPessoaRepositoryProxy = new NovoPessoaRepositoryProxy(); 

        PessoaService pessoaService = new PessoaService(pessoaRepositoryProxy);

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

        Pessoa pessoaRetornadaCache = pessoaService.findById(1L);
        System.out.println(pessoaRetornadaCache);

    }
    
}