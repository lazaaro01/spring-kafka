package com.lazaro.spring_kafka_demo.controller;

import com.lazaro.spring_kafka_demo.producer.OrderProducer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/orders")
public class OrderController {

    private final OrderProducer producer;

    public OrderController(OrderProducer producer) {
        this.producer = producer;
    }
    @PostMapping
    public String createOrder(@RequestParam String message) {
        producer.send(message);
        return "Pedido enviado para o Kafka!";
    }
}
