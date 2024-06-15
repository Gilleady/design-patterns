## Explicação do Design Pattern: Prototype

O padrão Prototype é usado para criar novas instâncias de objetos a partir de um protótipo existente. Em vez de criar um novo objeto do zero, o Prototype permite clonar um objeto existente, o que pode ser muito eficiente, especialmente quando a criação do objeto é complexa ou exige várias etapas.

**Como funciona:**

* **Definição do protótipo:** Cria-se um objeto protótipo que representa o modelo base para a clonagem.
* **Clonagem do protótipo:** Quando um novo objeto é necessário, um clone do protótipo é criado. O clone geralmente é uma cópia exata do protótipo, mas pode ser modificado posteriormente.
* **Utilização do clone:** O clone do protótipo pode ser utilizado como um novo objeto independente.

**Benefícios do uso do Prototype:**

* **Eficiência na criação de objetos:** A clonagem do protótipo pode ser muito mais rápida do que a criação de um novo objeto do zero, especialmente se a criação for complexa.
* **Flexibilidade:** O Prototype permite a criação de objetos personalizados a partir de protótipos existentes, modificando-os de acordo com as necessidades.
* **Redução de código redundante:** Ao reutilizar protótipos, reduz-se a quantidade de código repetido para criar objetos semelhantes.

**Exemplo:**

No exemplo fornecido, a classe `BotaoRegistry` é responsável por armazenar e fornecer protótipos de botões. A classe `BotaoFactory` implementa a lógica de clonagem, criando um novo botão com as mesmas configurações do protótipo.

**Classe BotaoRegistry:**

* Armazena um conjunto de botões protótipo (chave-valor).
* Fornece métodos para obter um botão a partir da chave e para adicionar novos protótipos ao registry.

**Classe BotaoFactory:**

* Implementa a lógica de clonagem, criando um novo botão a partir do protótipo fornecido.
* O clone é feito por meio da cópia dos atributos do protótipo.

**Classe TesteBotaoPrototype:**

* Demonstra a utilização do BotaoRegistry para criar novos botões a partir de protótipos existentes.
* Utiliza o método `getBotao` para obter clones dos protótipos e realiza modificações em um dos clones.
* Adiciona um novo protótipo ao registry e obtém um clone do novo protótipo.

**Conclusão:**

O padrão Prototype é uma solução eficaz para criar novos objetos a partir de modelos existentes, garantindo eficiência e flexibilidade. Ele é útil quando a criação de objetos é complexa ou quando se precisa criar várias cópias de um objeto com pequenas variações.