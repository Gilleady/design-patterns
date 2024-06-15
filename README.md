## Design Patterns em Java: Uma Exploração Prática

Este repositório serve como um guia prático para o estudo de Design Patterns em Java, com exemplos concretos e explicações detalhadas para cada padrão. O objetivo é proporcionar uma base sólida para a aplicação de Design Patterns em projetos reais, facilitando a criação de código mais organizado, flexível e reutilizável.

### Design Patterns Apresentados

Este projeto explora os seguintes padrões de projeto:

* **Builder:** Facilita a construção de objetos complexos com diversos atributos, oferecendo uma interface fluida para a configuração de cada atributo de forma independente. (Ex: `Pessoa` - [README.md](./src/br/com/ada/designpattern/builder/README.md))
* **Adapter:** Permite a utilização de classes com interfaces incompatíveis, adaptando-as para a interface desejada, sem modificar a classe original. (Ex: `JarOperacoesContaCorrente` - [README.md](./src/br/com/ada/designpattern/adapter/README.md))
* **Chain of Responsibility:** Cria uma cadeia de objetos para tratar uma solicitação, delegando a responsabilidade para o próximo objeto caso o atual não possa tratá-la. (Ex: `VendaCarroServiceComChainOfResponsibility` - [README.md](./src/br/com/ada/designpattern/chainofresponsibility/README.md))
* **Factory Method:** Encapsula a criação de objetos de diferentes tipos em um método estático, abstraindo a complexidade da instanciação e promovendo a flexibilidade na adição de novos tipos. (Ex: `ProdutoFactory` - [README.md](./src/br/com/ada/designpattern/factorymethods/README.md))
* **Prototype:** Permite a criação de novos objetos a partir de um protótipo existente, economizando tempo e esforço na criação de objetos complexos. (Ex: `BotaoRegistry` - [README.md](./src/br/com/ada/designpattern/prototype/README.md))
* **Proxy:** Cria um intermediário para um objeto real, controlando o acesso e adicionando funcionalidades extras como cache, logging e segurança. (Ex: `PessoaRepositoryProxy` - [README.md](./src/br/com/ada/designpattern/proxy/README.md))
* **Singleton:** Garante a existência de apenas uma instância de uma classe, oferecendo um ponto de acesso único para o objeto, ideal para recursos compartilhados. (Ex: `AgendaSingletonEAGER` - [README.md](./src/br/com/ada/designpattern/singleton/README.md))
* **Strategy:** Permite a troca de algoritmos em tempo de execução, encapsulando cada algoritmo em uma classe separada e tornando o código mais flexível e adaptável. (Ex: `ReajusteAnualSalarioComStrategy` - [README.md](./src/br/com/ada/designpattern/strategy/README.md))
* **Template Method:** Define um algoritmo geral em um método, com algumas etapas específicas a serem implementadas por subclasses, promovendo a reutilização de código e a personalização do comportamento. (Ex: `ReparoVeiculoService` - [README.md](./src/br/com/ada/designpattern/templatemethod/README.md))

### Como Usar este Repositório

1. **Explore os exemplos:** Cada padrão de projeto possui seu próprio diretório com exemplos de código e explicações detalhadas para facilitar a compreensão.
2. **Execute os testes:** Os testes unitários estão inclusos para verificar o funcionamento dos exemplos.
3. **Modifique o código:** Adapte os exemplos para seus próprios projetos e explore as diferentes formas de implementar cada padrão.
4. **Amplie seu conhecimento:** Consulte a documentação oficial do Java e outros recursos online para aprofundar seu entendimento sobre Design Patterns.

### Contribuições

Contribuições são bem-vindas! Se você encontrar algum erro, tiver sugestões de melhoria ou quiser adicionar novos exemplos, sinta-se à vontade para abrir uma issue ou enviar um pull request.

Espero que este repositório seja útil para o seu aprendizado sobre Design Patterns em Java!
