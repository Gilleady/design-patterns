## Explicação dos Design Patterns: Builder

* **Builder:** O padrão Builder é utilizado na classe `Pessoa` para construir objetos de forma mais organizada e flexível. A classe interna estática `PessoaBuilder` encapsula a lógica de construção da instância de `Pessoa`, permitindo a configuração dos atributos de forma passo a passo através de métodos de encadeamento.

**Benefícios do uso do Builder:**

* **Código mais legível e fácil de entender:** O uso do Builder torna o código mais limpo e organizado, pois a construção do objeto é realizada de forma gradual e separada da lógica principal.
* **Flexibilidade:** O Builder permite construir objetos com diferentes combinações de atributos, tornando o código mais adaptável a diferentes cenários.
* **Prevenção de erros:** O Builder garante que todos os atributos necessários sejam configurados antes da criação do objeto, evitando erros de inicialização.

**Conclusão:**

O padrão Builder é uma ferramenta poderosa para construir objetos complexos de forma organizada e flexível. A classe `Pessoa` demonstra como o Builder pode ser utilizado para construir objetos de forma mais eficiente e legível.