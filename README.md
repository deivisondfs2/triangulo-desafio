# Triangulo Desafio

Desafio matemático para obter o soma do triangulo.

## Getting Started

O desafio foi desenvolvido utilizando a linguagem java junto com o gerenciador de dependências maven, para começar deve ser instalado o maven na maquina:
```
sudo apt-get install maven
```

Após realizar o clone do projeto na raiz do arquivo pom.xml executar o seguinte comando:
```
mvn install
```
Para baixar todas as dependências

Proximo passo é executar os seguintes comandos:
```
mvn clean
mvn package
```

para executar apenas os testes rodar:
```
mvn test
```

depois desses comandos deveria ter criado o arquivo desafio-triangulo.jar no seguinte diretorio:
```
desafiotriangulo/target/desafio-triangulo.jar
```
rodar o .jar com o seguinte comando:

```
java -jar desafio-triangulo.jar
```

#Entendendo o código do arquivo App.java

Nosso triangulo tem as seguintes propriedades:
```
{6},
{3, 5},
{9, 7, 1},
{4, 6, 8, 4}
```
que deve ter um total = 26

O nosso metodo principal é o resultadoTriangulo que vai receber a matriz de inteiros (int[][]);
devemos começar a resolver nosso problema de baixo para cima por isso na linha 16 temos a seguinte instrução:

```int posicaoTriangulo = triangulo.length - 2;```

Vamos pegar a penultima posição do nosso array que seram os registros:
```
{9, 7, 1}
```
na linha 20 temos o seguinte código:
```
triangulo[posicaoTriangulo][colunasTriangulo] += Math.max( triangulo[posicaoTriangulo+1][colunasTriangulo], triangulo[posicaoTriangulo+1][colunasTriangulo+1]);
```

que vai realizar o seguinte fluxo triangulo[2][0] irá ser somado com o maior dos 2 elementos da proxima linha triangulo[3][0] ou triangulo[3][1] e o triangulo na posição [2][0] irá reseber o valor ou seja nossa linha triangulo[2] ficará da seguinte forma:
```
{15, 15, 9}
```
pois entre 4 e 6 o maior registro é o 6 somando assim com o 9 da penultima linha dando um total de 15
pois entre 6 e 8 o maio registro é o 8 somando assim com o 7 da penultima linha dando um total de 15
pois entre 8 e 4 o maior registro é o 8 somando assim com o 1 da penultima linha dando um total de 9
fazendo isso para todas as linhas até nosso triangulo[0][0] receber a soma final.
