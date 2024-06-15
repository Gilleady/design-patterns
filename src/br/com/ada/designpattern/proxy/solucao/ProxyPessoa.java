package br.com.ada.designpattern.proxy.solucao;

import br.com.ada.designpattern.builder.solucao.Pessoa;

/**
 * Interface que define os métodos para o Proxy do repositório de pessoas.
 * 
 * A interface ProxyPessoa define os métodos que serão implementados pelo Proxy,
 * permitindo a criação de diferentes implementações de Proxy para o repositório de pessoas.
 */
public interface ProxyPessoa {

    /**
     * Salva uma nova pessoa.
     * 
     * @param pessoa A pessoa a ser salva.
     */
    void save(Pessoa pessoa);
    
    /**
     * Busca uma pessoa pelo ID.
     * 
     * @param id O ID da pessoa a ser buscada.
     * @return A pessoa encontrada, ou null se não existir.
     */
    Pessoa findById(Long id);
    
}