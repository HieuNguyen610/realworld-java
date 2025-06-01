package com.mods.orderservice.service;

import com.mods.orderservice.dtos.OrderEvent;
import com.mods.orderservice.entities.Order;
import com.mods.orderservice.repositories.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;

    public ResponseEntity<String> createOrder(Order order) {

        order.setStatus("PENDING");
        this.orderRepository.save(order);
        //TODO: send kafka message
//        kafkaTemplate.send("order-topic", new OrderEvent(order.getId(), "PENDING", "ORDER"));
        return ResponseEntity.ok("Order created successfully");
    }
}
