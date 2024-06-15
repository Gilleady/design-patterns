package br.com.ada.designpattern.proxy.problema;

import br.com.ada.designpattern.builder.solucao.Pessoa;

public class PessoaService {
    
    private PessoaRepository pessoaRepository;

    public PessoaService(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }
    
    public void save(Pessoa pessoa) {
        pessoaRepository.save(pessoa);
    }

    public Pessoa findById(Long id) {
        return pessoaRepository.findById(id);
    }
}
