## Explicação dos Design Patterns: Singleton

O padrão Singleton garante que uma classe tenha apenas uma instância e que essa instância seja acessível globalmente. Ele é utilizado quando se deseja ter um único ponto de acesso a um recurso ou objeto específico, evitando a criação de múltiplas instâncias que podem causar problemas de consistência ou desempenho.

As classes `AgendaSingletonEAGER`, `AgendaSingletonLAZY` e `AgendaSingletonENUM` demonstram três abordagens diferentes para implementar o padrão Singleton:

**1. AgendaSingletonEAGER (Eager Initialization):**

* A instância única da classe é criada diretamente no momento da definição da classe (no atributo `INSTANCE`).
* A instância está disponível desde o início, sem a necessidade de uma chamada explícita para criá-la.
* Essa abordagem é simples e rápida, mas pode ser problemática se a instância for complexa ou se sua criação depender de recursos externos que ainda não estão disponíveis.

**2. AgendaSingletonLAZY (Lazy Initialization):**

* A instância da classe é criada somente quando o método `getInstance()` é chamado pela primeira vez.
* Essa abordagem é mais eficiente se a instância não for utilizada frequentemente, pois evita a criação desnecessária de objetos.
* No entanto, a primeira chamada ao `getInstance()` pode ser mais lenta devido à necessidade de criar a instância.

**3. AgendaSingletonENUM (Enum Approach):**

* A instância da classe é definida como um enum, que garante a inicialização somente quando necessário e a thread-safety.
* Essa abordagem é considerada a melhor prática para implementar o padrão Singleton, pois é a mais segura e garante a unicidade da instância em todas as situações, mesmo em cenários complexos.
* A inicialização do enum é realizada por meio do construtor, que é chamado automaticamente ao carregar a classe.

**Benefícios do uso do Singleton:**

* **Garantia de unicidade:** Um Singleton garante que apenas uma instância de uma classe seja criada, evitando problemas de consistência e desempenho causados por múltiplas instâncias.
* **Controle centralizado:** O Singleton oferece um único ponto de acesso à instância, permitindo o controle centralizado sobre o recurso ou objeto.
* **Reutilização de recursos:** O Singleton permite a reutilização de recursos compartilhados, evitando a criação redundante de objetos e otimizando o consumo de memória.
* **Gerenciamento de estado:** O Singleton pode armazenar estado global, permitindo que diferentes partes do código compartilhem informações.

**Conclusão:**

O padrão Singleton é um recurso valioso para garantir a unicidade de instâncias e o controle centralizado de recursos compartilhados. A escolha da implementação (Eager, Lazy ou Enum) depende das necessidades específicas do projeto, com o Enum sendo a abordagem mais recomendada em geral.

**Observação:**

O teste `TesteAgendaComSingleton` demonstra como tentar criar novas instâncias de `AgendaSingletonEAGER` e `AgendaSingletonLAZY` utilizando reflexão. Esse teste mostra que a abordagem Enum é imune a essas tentativas de violação do padrão Singleton.