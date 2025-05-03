package com.mods.orderservice.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderEvent {
    private Long orderId;
    private String status; // PENDING, COMPLETED, CANCELED
    private String service; // ORDER, PAYMENT, INVENTORY, SHIPPING
}
