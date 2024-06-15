## Explicação do Design Pattern: Template Method

O padrão Template Method define um algoritmo geral em um método, chamado de *template method*. Esse método pode chamar outros métodos, chamados de *métodos hook*, que podem ser sobrescritos por subclasses para personalizar o algoritmo.

**Benefícios do uso do Template Method:**

* **Reutilizabilidade:** O algoritmo geral é definido em uma classe base e pode ser reutilizado por subclasses.
* **Flexibilidade:** As subclasses podem personalizar o algoritmo sobrescrevendo métodos específicos.
* **Facilidade de manutenção:** As alterações no algoritmo geral são feitas na classe base, enquanto as alterações específicas são feitas nas subclasses.

**Exemplo:**

No exemplo fornecido, a classe `ReparoVeiculoService` define o template method `reparaVeiculo`, que implementa o algoritmo geral para o processo de reparo de um veículo. As subclasses `ReparoVeiculoComumServiceComTemplateMethod` e `ReparoVeiculoLuxoServiceComTemplateMethod` sobrescrevem o método `veiculoParaReparo` para definir a regra de reparabilidade específica para cada tipo de veículo.

**Classe ReparoVeiculoService:**

* Define o template method `reparaVeiculo`.
* Define o método abstrato `veiculoParaReparo`, que deve ser implementado pelas subclasses.
* Define os métodos hook (privados) para as etapas específicas do processo de reparo.

**Subclasses que herdam de ReparoVeiculoService:**

* Implementam o método `veiculoParaReparo` de acordo com a regra de reparabilidade do veículo.

**Classe TesteReparaVeiculosComTemplateMethod:**

* Demonstra como o Template Method é utilizado para implementar o processo de reparo de veículos.
* Cria veículos comuns e de luxo e chama o método `reparaVeiculo` para cada um deles.

**Conclusão:**

O padrão Template Method é uma solução eficaz para implementar algoritmos gerais e permitir que subclasses personalizem o comportamento do algoritmo. Ele é útil quando você precisa definir um algoritmo básico e permitir que as subclasses modifiquem partes específicas do algoritmo.