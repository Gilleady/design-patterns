## Explicação do Design Pattern: Strategy

O padrão Strategy define uma família de algoritmos, encapsula cada um deles e os torna intercambiáveis. Isso permite que você escolha o algoritmo a ser usado em tempo de execução, tornando o código mais flexível e reutilizável.

**Benefícios do uso do Strategy:**

* **Flexibilidade:** Permite que você alterne facilmente o algoritmo usado sem modificar o código cliente.
* **Reutilizabilidade:** Os algoritmos são encapsulados em classes separadas, tornando-os reutilizáveis em diferentes partes do código.
* **Facilidade de manutenção:** As alterações no algoritmo são localizadas, tornando o código mais fácil de manter.

**Exemplo:**

No exemplo fornecido, a interface `CalculadorReajusteAnualSalario` define o contrato para calcular o reajuste anual do salário. As classes `CalculadorReajusteAnualSalarioCLT`, `CalculadorReajusteAnualSalarioPJ`, `CalculadorReajusteAnualSalarioEstagio` e `CalculadorReajusteAnualSalarioCooperativa` implementam algoritmos de reajuste específicos para cada tipo de contratação. A classe `ReajusteAnualSalarioComStrategy` encapsula a lógica de cálculo, recebendo um funcionário e a estratégia (algoritmo) a ser utilizada.

**Classe ReajusteAnualSalarioComStrategy:**

* Encapsula a lógica de cálculo do reajuste.
* Recebe um funcionário e a estratégia (algoritmo) a ser utilizada.
* Delega a responsabilidade de calcular o reajuste para a estratégia fornecida.

**Classes que implementam CalculadorReajusteAnualSalario:**

* Cada classe implementa um algoritmo específico de reajuste.
* O algoritmo de reajuste depende do tipo de contratação do funcionário.

**Classe TesteAjusteSalarioComStrategy:**

* Demonstra como o Strategy é utilizado para calcular o reajuste anual de salário de acordo com o tipo de contratação.
* Cria funcionários de diferentes tipos de contratação e calcula seus reajustes utilizando as estratégias correspondentes.

**Conclusão:**

O padrão Strategy é uma solução eficaz para encapsular algoritmos e torná-los intercambiáveis, proporcionando flexibilidade, reutilizabilidade e facilidade de manutenção. Ele é útil quando você precisa implementar diferentes algoritmos para uma operação específica, permitindo que o código cliente escolha o algoritmo a ser usado em tempo de execução.