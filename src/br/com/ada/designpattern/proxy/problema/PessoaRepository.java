package br.com.ada.designpattern.proxy.problema;

import java.util.HashMap;
import java.util.Map;

import br.com.ada.designpattern.builder.solucao.Pessoa;

/**
 * Classe que representa um repositório de pessoas, responsável por salvar e buscar pessoas no banco de dados.
 * 
 * No entanto, essa classe possui um problema de desempenho, pois a operação `findById` leva 1,5 segundos para ser executada.
 * A classe também não implementa nenhuma estratégia de cache para evitar consultas desnecessárias ao banco de dados.
 */
public class PessoaRepository {
    
    /**
     * Map que simula o banco de dados, armazenando as pessoas.
     */
    private Map<Long, Pessoa> banco = new HashMap<>();

    /**
     * Contador para gerar IDs únicos para as pessoas.
     */
    private static Long countId = 1L;

    /**
     * Salva uma nova pessoa no banco de dados.
     * 
     * @param pessoa A pessoa a ser salva.
     */
    public void save(Pessoa pessoa) {
        banco.put(countId++, pessoa);
    }

    /**
     * Busca uma pessoa no banco de dados pelo ID.
     * 
     * @param id O ID da pessoa a ser buscada.
     * @return A pessoa encontrada, ou null se não existir.
     */
    public Pessoa findById(Long id) {
        try {
            Thread.sleep(1500); // Simula um tempo de espera de 1,5 segundos para a consulta.
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return banco.get(id);
    }
}