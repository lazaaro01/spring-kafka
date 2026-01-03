# Projeto Spring Boot com Kafka

Aplicação desenvolvida em **Java 15** utilizando **Spring Boot**, com **API REST** e integração com **Apache Kafka** para recebimento de mensagens.

## Tecnologias
- Java 15
- Spring Boot
- Apache Kafka
- REST Controller

## Descrição
A aplicação expõe endpoints REST e consome mensagens do Kafka para processamento assíncrono.

## Execução
1. Inicie o Kafka.
2. Configure o `application.properties` ou `application.yml`.
3. Execute:
   ```bash
   mvn spring-boot:run
