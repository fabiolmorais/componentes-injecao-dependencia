# Desafio01 Java Spring Professional

Este é um desafio para implementar um sistema em Java com Spring Boot para calcular o valor total de um pedido, considerando uma porcentagem de desconto e o frete.

## Descrição do Desafio

Você deve criar um sistema para calcular o valor total de um pedido, considerando uma porcentagem de desconto e o frete. A regra para cálculo do frete é a seguinte:

- Valor básico do pedido (sem desconto)
  - Abaixo de R$ 100.00: Frete R$ 20.00
  - De R$ 100.00 até R$ 200.00 exclusive: Frete R$ 12.00
  - R$ 200.00 ou mais: Frete Grátis

## Exemplos de Entrada e Saída

Exemplo 1:
- Entrada:
  - Código do Pedido: 1034
  - Valor Básico do Pedido: R$ 150.00
- Saída:
  - Valor Total: R$ 132.00
  - Porcentagem de Desconto: 20.0%

Exemplo 2:
- Entrada:
  - Código do Pedido: 2282
  - Valor Básico do Pedido: R$ 800.00
- Saída:
  - Valor Total: R$ 720.00
  - Porcentagem de Desconto: 10.0%

Exemplo 3:
- Entrada:
  - Código do Pedido: 1309
  - Valor Básico do Pedido: R$ 95.90
- Saída:
  - Valor Total: R$ 115.90
  - Porcentagem de Desconto: 0.0%

## Especificações da Solução

- Um pedido deve ser representado por um objeto conforme projeto abaixo.
- A lógica do cálculo do valor total do pedido deve ser implementada por componentes (serviços), cada um com sua responsabilidade.
  - Serviço OrderService: responsável por operações referentes a pedidos.
  - Serviço ShippingService: responsável por operações referentes a frete.
- A solução deve ser implementada em Java com Spring Boot. A saída deverá ser mostrada no log do terminal da aplicação.
- Cada serviço deve ser implementado como um componente registrado com @Service.

## Como Executar o Projeto

1. Clone este repositório:

```bash
git clone https://github.com/seu-usuario/desafio01-java-spring-professional.git
```

2. Navegue até o diretório do projeto:
```bash
cd desafio01-java-spring-professional
```
3. Execute o projeto usando Maven:
```bash
mvn spring-boot:run
```
4. Verifique a saída no log do terminal.

