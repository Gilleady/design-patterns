## Explicação do Design Pattern: Adapter

O padrão Adapter é utilizado para tornar classes com interfaces incompatíveis compatíveis. Ele envolve uma classe existente (adaptada) e fornece uma interface que o código cliente espera. O Adapter traduz as chamadas para a interface do código cliente para a interface da classe adaptada.

**Benefícios do uso do Adapter:**

* **Reutilização de código:** O Adapter permite que você use classes existentes que não possuem a interface desejada.
* **Flexibilidade:** O Adapter fornece uma camada de abstração entre o código cliente e a classe adaptada, permitindo que você alterne facilmente a classe adaptada sem afetar o código cliente.
* **Facilita a integração:** O Adapter facilita a integração de classes de diferentes bibliotecas ou frameworks com interfaces incompatíveis.

**Exemplo:**

No exemplo fornecido, a classe `JarOperacoesContaCorrente` é uma classe existente (adaptada) com uma interface diferente do padrão esperado no sistema atual. A classe `JarOperacoesContaCorrenteAdapter` é o Adapter que encapsula `JarOperacoesContaCorrente` e fornece a interface desejada. A classe `ClientJarOperacoesContaCorrenteAdapter` é o código cliente que utiliza o Adapter.

**Classe JarOperacoesContaCorrenteAdapter:**

* Encapsula a classe `JarOperacoesContaCorrente`.
* Traduz as chamadas do código cliente para a interface da classe adaptada.
* Valida o saldo antes de executar o saque.

**Classe ClientJarOperacoesContaCorrenteAdapter:**

* Utiliza o Adapter para interagir com `JarOperacoesContaCorrente`.
* Não precisa se preocupar com a interface original de `JarOperacoesContaCorrente`.

**Classe TesteOperacoesContaCorrenteAdapter:**

* Demonstra como o Adapter permite que o código cliente interaja com `JarOperacoesContaCorrente` usando a interface do Adapter.

**Conclusão:**

O padrão Adapter é uma solução eficaz para tornar classes com interfaces incompatíveis compatíveis. Ele permite que você reutilizar código existente, melhora a flexibilidade e facilita a integração de classes de diferentes sistemas.