<h1 align="center">Conversor de Moedas</h1>
<p align="center">
<img src="http://img.shields.io/static/v1?label=STATUS&message=EM%20DESENVOLVIMENTO&color=GREEN&style=for-the-badge"/>
</p>

## Índice
* [Descrição do Projeto](#descrição-do-projeto)
* [Funcionalidades](#funcionalidades)
* [Acesso ao Projeto](#acesso-ao-projeto)
* [Tecnologias Utilizadas](#tecnologias-utilizadas)
## Descrição do Projeto

O Conversor de Moedas é um projeto desenvolvido como parte do programa Oracle Next Education (ONE). Este desafio tem como objetivo principal proporcionar uma experiência prática semelhante ao dia a dia de uma pessoa desenvolvedora, permitindo a aplicação dos conceitos aprendidos nos cursos de especialização em Back-End com foco em Java e Orientação a Objetos.

Este projeto utiliza a API ExchangeRate-API para obter taxas de câmbio em tempo real e realiza as conversões de maneira eficiente. É uma ferramenta útil para quem precisa de informações atualizadas sobre taxas de câmbio para tomar decisões financeiras.

Os conceitos aplicados neste projeto foram obtidos nos seguintes cursos:

- Java: criando a sua primeira aplicação
- Java: aplicando a Orientação a Objetos
- Java: trabalhando com listas e coleções de dados
- Java: consumindo API, gravando arquivos e lidando com erros

## Status do Projeto

<h4 align="center"> 
    :construction:  Projeto em construção  :construction:
</h4>

## Funcionalidades

- `Conversão de USD para ARS`: Converte valores de Dólar Americano para Peso Argentino.
- `Conversão de ARS para USD`: Converte valores de Peso Argentino para Dólar Americano.
- `Conversão de USD para BOB`: Converte valores de Dólar Americano para Boliviano.
- `Conversão de BOB para USD`: Converte valores de Boliviano para Dólar Americano.
- `Conversão de USD para BRL`: Converte valores de Dólar Americano para Real Brasileiro.
- `Conversão de BRL para USD`: Converte valores de Real Brasileiro para Dólar Americano.
- `Conversão de USD para CLP`: Converte valores de Dólar Americano para Peso Chileno.
- `Conversão de CLP para USD`: Converte valores de Peso Chileno para Dólar Americano.
- `Conversão de USD para COP`: Converte valores de Dólar Americano para Peso Colombiano.
- `Conversão de COP para USD`: Converte valores de Peso Colombiano para Dólar Americano.

## Acesso ao Projeto

Você pode acessar o código fonte do projeto inicial ou baixá-lo clicando [aqui](https://github.com/Brnddpaula/ChallengeConversorDeMoedas.git).

### Abrir e Rodar o Projeto

Após baixar o projeto, você pode abrir com o IntelliJ IDEA. Para isso, na tela de launcher clique em:
- Open an Existing Project (ou alguma opção similar);
- Procure o local onde o projeto está e o selecione (Caso o projeto seja baixado via zip, é necessário extraí-lo antes de procurá-lo);
- Por fim clique em OK;
  O IntelliJ IDEA deve executar algumas tasks do Maven para configurar o projeto, aguarde até finalizar. Ao finalizar as tasks, você pode executar o App.

### Executando via Terminal

Para executar o projeto via terminal, navegue até a pasta do projeto e use os seguintes comandos:

 - mvn clean install
 - mvn exec:java -Dexec.mainClass="interfaceusuario.AppConversorMoedas"

## Tecnologias Utilizadas
- Java 11
- IntelliJ IDEA
- Maven
- Biblioteca Gson
- API ExchangeRate-API

## Contribuições
Contribuições são bem-vindas! Se você tiver sugestões ou melhorias, sinta-se à vontade para abrir uma issue ou enviar um pull request.

