![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![RabbitMQ](https://img.shields.io/badge/Rabbitmq-FF6600?style=for-the-badge&logo=rabbitmq&logoColor=white)
![Docker](https://img.shields.io/badge/docker-%230db7ed.svg?style=for-the-badge&logo=docker&logoColor=white)

# Spring Microservices com RabbitMQ

Este repositório contém um exemplo de aplicação com microserviços usando Spring Boot e RabbitMQ para comunicação assíncrona e usando Arquitetura Hexagonal.

## Descrição

O objetivo deste projeto é demonstrar a implementação de um sistema baseado em microserviços com Spring Boot, utilizando RabbitMQ como sistema de mensageria. Este projeto é composto por três microserviços principais:

- **Serviço de Cadastro de Proposta**: Responsável por cadastrar propostas no banco de dados.
- **Serviço de Notificação**: Responsável por enviar notificações via SMS para o usuário detentor da proposta.
- **Serviço de Análise de Crédito**: Responsável por fazer a análise de crédito da proposta.
  
## Requisitos

- Java 17
- Maven
- Spring Boot
- Docker (para executar RabbitMQ)


## Configuração

### 1. Clonar o repositório

```bash
git clone https://github.com/gustavops02/spring-microsservices-rabbitmq.git
cd spring-microsservices-rabbitmq
```

### 2. Subir o RabbitMQ com Docker

`docker run -d -p 5672:5672 -p 15672:15672 --name my-rabbit rabbitmq:3-management`

### 3. Executar os serviços

`mvn spring-boot:run`

## Uso

### 1. Enviando Propostas

Você pode cadastrar uma proposta no Postman com esse JSON:

{
  "nome": "João",
  "sobrenome": "Silva",
  "telefone": "123456789",
  "cpf": "123.456.789-00",
  "renda": 3000.0,
  "valorSolicitado": 15000.0,
  "prazoPagamento": 24
}

ou no **curl**:

```bash
curl -X POST -H "Content-Type: application/json" -d '{
  "nome": "João",
  "sobrenome": "Silva",
  "telefone": "123456789",
  "cpf": "123.456.789-00",
  "renda": 3000.0,
  "valorSolicitado": 15000.0,
  "prazoPagamento": 24
}' http://localhost:8080/send
```


### Monitoramento de Mensagens

Você pode monitorar as mensagens e filas no painel do RabbitMQ:

- Acesse o RabbitMQ Management no endereço: `http://localhost:15672`
- Usuário: `guest`
- Senha: `guest`


## Contribuição

Contribuições sã0 bem-vindas! Sinta-se à vontade para abrir issues e pull requests.
