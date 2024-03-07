##  Sobre o projeto

Esse repositório consiste no versionamento das soluções propostas no teste aplicado pela empresa.

A solução da <b>Pergunta 2</b> consiste em receber um valor inteiro do usuário e, a partir desse valor, exibir a Sequência de Fibonacci, sendo que a sequência irá iniciar em 0 e finalizar até que o valor da sequência seja igual ou menor que o valor informado pelo usuário. A solução também abrange a exibição de uma mensagem ao usuário informando se o valor informado por ele está presente ou não na Sequência.
Exemplo: caso informado o valor 55, a sequência exibida será: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 e a mensagem final informará que o valor 55 está contido na sequência. No entanto, caso informado o valor 57, a sequência exibida será a mesma, mas a mensagem final informará que o valor 57 não está contido na sequência.

A solução da <b>Pergunta 3</b> consiste na leitura de um arquivo Json que contém uma lista de 30 objetos, representando um mês. Cada objeto contém um dado "dia" e um dado "valor". O arquivo foi lido e as saídas foram: o menor valor do arquivo e o maior valor do arquivo. Além disso, também é exibido para o usuário a quantidade de dias nos quais os valores foram maiores que a média mensal. A aplicação não inclui os dados cujos valores são "0", nem para a média nem a para saída do menor valor.

A solução da <b>Pergunta 4</b> consiste na exibição da contribuição do faturamento de cada estado no formato de porcentagem. Foi opcional a quantidade de casas decimais, de forma que optei por utilizar duas casas. Os valores de faturamento de cada estado foram previamente definidos no código por meio das respectivas variáveis. No código, foi realizado o cálculo do faturamento total e a partir desse dado foi possível calcular a contribuição.

A solução da <b>Pergunta 5</b> consiste em solicitar uma palavra ao usuário e a aplicação retornar a palavra reversa, ou seja, invertendo os caracteres da palavra. Para tanto, solicitou-se inicialmente o tamanho da palavra.


### Tecnologias

Para a solução foram utilizadas as linguagens <b>C</b> e <b>Java</b>, de forma que duas questões foram feitas com C e duas questões foram feitas com Java.

<p display="inline-block">
  <img width="48" src="https://upload.wikimedia.org/wikipedia/commons/1/18/C_Programming_Language.svg" alt="c-logo"/>
  <img width="48" src="https://upload.wikimedia.org/wikipedia/pt/3/30/Java_programming_language_logo.svg" alt="java-logo"/>
</p>
                                                                                                  
### Ferramentas de desenvolvimento

Para o desenvolvimento das aplicações, foram utilizadas duas ferramentas: <b>Visual Code</b> para as soluções em C e <b>Netbeans</b> para as soluções em Java. Assim, as soluções da Sequência de Fibonacci (Pergunta 2) e da Palavra Reversa (Pergunta 5) foram realizadas no Visual Code. Já para a realização da leitura do arquivo Json e posterior exibição do resultado (Pergunta 3), assim como para a exibição do resultado da contribuição de cada estado (Pergunta 4), a ferramenta utilizada foi a Netbeans.

<p display="inline-block">
  <img width="48" src="https://upload.wikimedia.org/wikipedia/commons/thumb/9/9a/Visual_Studio_Code_1.35_icon.svg/2048px-Visual_Studio_Code_1.35_icon.svg.png" alt="vscode-logo"/>
  <img width="48" src="https://upload.wikimedia.org/wikipedia/commons/9/98/Apache_NetBeans_Logo.svg" alt="netbeans-logo"/>
</p>

## Leitura
Para a leitura da aplicação resultante da <b>Pergunta 3</b>, o Java deve possuir a dependência "Gson" do Google.

## Referências
[Leitura de Json por meio de Gson](https://attacomsian.com/blog/gson-read-json-file)

[Dependência Gson](https://mvnrepository.com/artifact/com.google.code.gson/gson/2.8.6)
