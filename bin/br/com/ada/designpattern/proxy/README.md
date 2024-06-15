## Explicação do Design Pattern: Proxy

O padrão Proxy fornece um substituto para um objeto real, controlando o acesso a ele. O Proxy atua como um intermediário entre o código cliente e o objeto real, interceptando as chamadas aos métodos do objeto real e adicionando funcionalidades extras.

**Benefícios do uso do Proxy:**

* **Controle de acesso:** O Proxy pode ser usado para controlar o acesso ao objeto real, por exemplo, restringindo o acesso a métodos específicos ou adicionando autenticação.
* **Gerenciamento de recursos:** O Proxy pode gerenciar recursos, como conexões com banco de dados, arquivos ou redes, otimizando o uso de recursos e evitando problemas de desempenho.
* **Caching:** O Proxy pode implementar mecanismos de cache para melhorar o desempenho das operações, armazenando resultados de chamadas ao objeto real e retornando-os diretamente do cache quando necessário.
* **Logging e monitoramento:** O Proxy pode registrar as operações do objeto real, facilitando o debug, o monitoramento e a auditoria.

**Exemplo:**

No exemplo fornecido, a classe `PessoaRepositoryProxy` é um Proxy para a classe `PessoaRepository`. O Proxy intercepta as chamadas aos métodos `save` e `findById` da classe `PessoaRepository` e adiciona funcionalidades de cache e logging.

**Classe PessoaRepositoryProxy:**

* Implementa a mesma interface que `PessoaRepository`.
* Armazena as pessoas buscadas em cache.
* Adiciona logging para rastrear as operações.
* Delega as chamadas aos métodos do objeto real (`PessoaRepository`) através de `super`.

**Classe PessoaService:**

* É uma camada de abstração para o repositório de pessoas.
* Utiliza o Proxy para acessar o repositório de pessoas, delegando as operações ao Proxy.

**Classe TestePessoaComProxy:**

* Demonstra a utilização do Proxy para acessar o repositório de pessoas.
* Salva uma pessoa e busca a mesma pessoa duas vezes, mostrando como o cache é utilizado.

**Conclusão:**

O padrão Proxy é uma ferramenta poderosa para adicionar funcionalidades extras a objetos existentes sem modificar o objeto real. Ele é útil para controlar o acesso, gerenciar recursos, implementar cache e adicionar logging e monitoramento.