## Explicação dos Design Patterns: Factory Method

* **Factory Method:** O padrão Factory Method é implementado na classe `ProdutoFactory` para encapsular a criação de instâncias de `Produto` de diferentes tipos. O método estático `getInstance` define a lógica para criar a instância correta de acordo com o tipo de produto especificado.

**Benefícios do uso do Factory Method:**

* **Abstração da criação de objetos:** O Factory Method esconde a complexidade da criação de objetos de diferentes tipos, permitindo que o código cliente interaja com uma interface única para obter as instâncias desejadas.
* **Flexibilidade:** O Factory Method permite a adição de novos tipos de produtos sem modificar o código cliente, tornando o código mais flexível e fácil de manter.
* **Reutilização de código:** O Factory Method pode ser reutilizado para criar diferentes tipos de objetos, evitando a duplicação de código.

**Conclusão:**

O padrão Factory Method é uma ferramenta poderosa para simplificar e abstrair a criação de objetos, permitindo a criação de código mais flexível, fácil de manter e reutilizável. A classe `ProdutoFactory` demonstra como o Factory Method pode ser utilizado para criar instâncias de `Produto` de diferentes tipos de forma organizada e eficiente.