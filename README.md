# Documentação do projeto - Desafio carro Java

Este projeto é uma aplicação Java simples para simular o controle básico de um carro por meio de um menu interativo no terminal.

## O que o programa faz

O programa permite:

- verificar o status do carro;
- ligar e desligar o veículo;
- acelerar e desacelerar;
- mudar a direção;
- alterar a marcha.

## Estrutura do projeto

O projeto contém dois arquivos principais:

- `Controle_carro.java`: contém a lógica do carro e seus métodos.
- `Onix.java`: contém a classe principal, com o menu interativo que chama os métodos do carro.

## Como funciona

A classe `Controle_carro` controla os seguintes atributos:

- `carro_ligado`: indica se o carro está ligado ou desligado;
- `velocidade`: armazena a velocidade atual;
- `marcha`: indica a marcha atual;
- `direcao`: representa a direção escolhida.

A classe `Onix` é a entrada do programa. Ela exibe um menu com opções numéricas e executa a ação escolhida pelo usuário.

## Como executar o programa

1. Abra o terminal no diretório do projeto.

2. Compile os arquivos Java:

```bash
javac Controle_carro.java Onix.java
```

3. Execute o programa:

```bash
java Onix
```

## Menu disponível

Ao iniciar, o programa mostra as seguintes opções:

1. Status
2. Ligar
3. Desligar
4. Acelerar
5. Desacelerar
6. Direção
7. Marcha

## Exemplo de uso

- Digite `2` para ligar o carro.
- Digite `4` para acelerar.
- Digite `7` para trocar de marcha.
- Digite `6` para escolher a direção.

## Observações

- O programa funciona de forma interativa no terminal.
- Para encerrar a execução, você pode usar `Ctrl + C`.
- Algumas opções pedem entradas adicionais, como a direção ou o número da marcha.

## Resumo

Esse projeto é uma introdução prática ao uso de classes, métodos, controle de fluxo e interação com o usuário em Java.

## Texto para publicação no LinkedIn

Este projeto foi uma ótima oportunidade para colocar em prática conceitos fundamentais de Java, como orientação a objetos, controle de fluxo e interação com o usuário no terminal. Desenvolver uma simulação de carro com funções como ligar, acelerar, mudar de marcha e controlar a direção ajudou a fortalecer minha compreensão sobre a lógica de programação e a estruturação de classes. Cada desafio dessa implementação reforçou a importância de escrever código organizado, claro e funcional.
