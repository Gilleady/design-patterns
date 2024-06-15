package br.com.ada.designpattern.proxy.solucao;

import br.com.ada.designpattern.builder.solucao.Pessoa;

/**
 * Classe de serviço para Pessoa, que utiliza um Proxy para acessar o repositório de pessoas.
 * 
 * A classe PessoaService fornece uma camada de abstração para as operações de salvar e buscar pessoas,
 * encapsulando a lógica de acesso ao repositório.
 */
public class PessoaService {
    
    /**
     * Instância do Proxy para o repositório de pessoas.
     */
    private ProxyPessoa proxyPessoa;

    /**
     * Construtor da classe PessoaService.
     * 
     * @param pessoaRepository O Proxy para o repositório de pessoas.
     */
    public PessoaService(ProxyPessoa pessoaRepository) {
        this.proxyPessoa = pessoaRepository;
    }
    
    /**
     * Salva uma nova pessoa.
     * 
     * @param pessoa A pessoa a ser salva.
     */
    public void save(Pessoa pessoa) {
        proxyPessoa.save(pessoa);
    }

    /**
     * Busca uma pessoa pelo ID.
     * 
     * @param id O ID da pessoa a ser buscada.
     * @return A pessoa encontrada, ou null se não existir.
     */
    public Pessoa findById(Long id) {
        return proxyPessoa.findById(id);
    }
}