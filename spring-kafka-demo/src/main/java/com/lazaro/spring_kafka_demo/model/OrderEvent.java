package com.lazaro.spring_kafka_demo.model;

public class OrderEvent {

    private String orderId;
    private String message;

    public OrderEvent() {
    }

    public OrderEvent(String orderId, String message) {
        this.orderId = orderId;
        this.message = message;
    }

    public String getOrderId() {

        return orderId;
    }

    public String getMessage() {

        return message;
    }
}