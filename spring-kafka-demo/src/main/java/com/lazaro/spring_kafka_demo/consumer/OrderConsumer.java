package com.lazaro.spring_kafka_demo.consumer;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class OrderConsumer {

    @KafkaListener(topics = "order-topic", groupId = "order-group")
    public void consume(String message) {
        System.out.println("Mensagem recebida do Kafka: " + message);
    }
}
