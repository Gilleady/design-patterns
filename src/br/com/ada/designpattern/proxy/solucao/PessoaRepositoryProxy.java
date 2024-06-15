package br.com.ada.designpattern.proxy.solucao;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.logging.Logger;

import br.com.ada.designpattern.builder.solucao.Pessoa;
import br.com.ada.designpattern.proxy.problema.PessoaRepository;

/**
 * Classe Proxy que implementa o padrão Proxy para a classe PessoaRepository.
 * 
 * O ProxyPessoaRepository implementa a mesma interface que a classe PessoaRepository, mas 
 * adiciona funcionalidades de cache e logging para melhorar o desempenho e a rastreabilidade das operações.
 * 
 * A classe ProxyPessoaRepository atua como um intermediário entre o código cliente e a classe PessoaRepository,
 * interceptando as chamadas aos métodos da classe PessoaRepository e adicionando as funcionalidades extras.
 */
public class PessoaRepositoryProxy extends PessoaRepository implements ProxyPessoa {

    /**
     * Logger para registrar as operações do Proxy.
     */
    private static Logger log = Logger.getLogger(PessoaRepositoryProxy.class.getName());

    /**
     * Cache para armazenar as pessoas já buscadas pelo ID.
     */
    private Map<Long, Pessoa> cache = new HashMap<>();

    /**
     * Sobrescreve o método save para adicionar logging.
     * 
     * @param pessoa A pessoa a ser salva.
     */
    @Override
    public void save(Pessoa pessoa) {
        log.info("Iniciando chamada do metodo save... ");
        super.save(pessoa);
        log.info("Chamada do metodo save finalizada. ");
    }
    
    /**
     * Sobrescreve o método findById para implementar o cache e o logging.
     * 
     * @param id O ID da pessoa a ser buscada.
     * @return A pessoa encontrada, ou null se não existir.
     */
    @Override
    public Pessoa findById(Long id) {
        log.info("Iniciando chamada do metodo findById... ");
        long inicio = System.currentTimeMillis();

        Pessoa pessoa = null;

        /**
         * Verifica se a pessoa já está no cache. Se estiver, retorna a pessoa do cache.
         * Caso contrário, busca a pessoa no repositório original e armazena no cache.
         */
        if (Objects.nonNull(cache.get(id))){
            log.info("Esta pegando do cache" );
            pessoa = cache.get(id);
        }
        else {
            log.info("Esta pegando do PessoaRepository" );
            pessoa = super.findById(id);
            cache.put(id, pessoa);
        }
                
        log.info("Chamada do metodo findById finalizada. ");
        long fim = System.currentTimeMillis();
        log.info("Tempo gasto na chamada ... " + (fim-inicio));

        return pessoa;
    }
}