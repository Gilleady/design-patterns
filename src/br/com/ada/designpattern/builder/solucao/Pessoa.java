package br.com.ada.designpattern.builder.solucao;

import java.time.LocalDate;

/**
 * Classe Pessoa que representa um indivíduo com nome, sobrenome, documento, email, apelido e data de nascimento.
 * 
 * Esta classe utiliza o padrão de projeto Builder para construir objetos Pessoa de forma mais organizada e flexível.
 */
public class Pessoa {
    private String nome;
    private String sobreNome;
    private String documento;
    private String email;
    private String apelido;
    private LocalDate dataNascimento;

    /**
     * Construtor privado para garantir que a instância de Pessoa seja criada apenas através do Builder.
     *
     * @param nome           O nome da pessoa.
     * @param sobreNome      O sobrenome da pessoa.
     * @param documento      O documento da pessoa.
     * @param email          O email da pessoa.
     * @param apelido        O apelido da pessoa.
     * @param dataNascimento A data de nascimento da pessoa.
     */
    private Pessoa(String nome, String sobreNome, String documento, String email, String apelido,
                   LocalDate dataNascimento) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.documento = documento;
        this.email = email;
        this.apelido = apelido;
        this.dataNascimento = dataNascimento;
    }

    // Getters e setters para os atributos da classe Pessoa
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Pessoa [nome='" + nome + '\'' +
                ", sobreNome='" + sobreNome + '\'' +
                ", documento='" + documento + '\'' +
                ", email='" + email + '\'' +
                ", apelido='" + apelido + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ']';
    }

    /**
     * Classe interna estática que implementa o padrão de projeto Builder para construir objetos Pessoa.
     * 
     * O Builder permite a construção de objetos Pessoa de forma passo a passo, garantindo que todos os atributos
     * necessários sejam configurados antes da criação da instância final.
     * 
     * Isso torna a construção de objetos Pessoa mais flexível, legível e evita erros de inicialização.
     */
    public static class PessoaBuilder {
        private String nome;
        private String sobreNome;
        private String documento;
        private String email;
        private String apelido;
        private LocalDate dataNascimento;

        /**
         * Define o nome da pessoa.
         *
         * @param nome O nome da pessoa.
         * @return O próprio objeto PessoaBuilder para encadeamento de métodos.
         */
        public PessoaBuilder nome(String nome) {
            this.nome = nome;
            return this;
        }

        /**
         * Define o sobrenome da pessoa.
         *
         * @param sobreNome O sobrenome da pessoa.
         * @return O próprio objeto PessoaBuilder para encadeamento de métodos.
         */
        public PessoaBuilder sobreNome(String sobreNome) {
            this.sobreNome = sobreNome;
            return this;
        }

        /**
         * Define o documento da pessoa.
         *
         * @param documento O documento da pessoa.
         * @return O próprio objeto PessoaBuilder para encadeamento de métodos.
         */
        public PessoaBuilder documento(String documento) {
            this.documento = documento;
            return this;
        }

        /**
         * Define o email da pessoa.
         *
         * @param email O email da pessoa.
         * @return O próprio objeto PessoaBuilder para encadeamento de métodos.
         */
        public PessoaBuilder email(String email) {
            this.email = email;
            return this;
        }

        /**
         * Define o apelido da pessoa.
         *
         * @param apelido O apelido da pessoa.
         * @return O próprio objeto PessoaBuilder para encadeamento de métodos.
         */
        public PessoaBuilder apelido(String apelido) {
            this.apelido = apelido;
            return this;
        }

        /**
         * Define a data de nascimento da pessoa.
         *
         * @param dataNascimento A data de nascimento da pessoa.
         * @return O próprio objeto PessoaBuilder para encadeamento de métodos.
         */
        public PessoaBuilder dataNascimento(LocalDate dataNascimento) {
            this.dataNascimento = dataNascimento;
            return this;
        }

        /**
         * Constrói e retorna uma nova instância de Pessoa com os atributos configurados.
         *
         * @return Uma nova instância de Pessoa.
         */
        public Pessoa build() {
            return new Pessoa(nome, sobreNome, documento, email, apelido, dataNascimento);
        }

    }

}