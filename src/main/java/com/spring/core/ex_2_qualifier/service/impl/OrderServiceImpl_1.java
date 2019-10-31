package com.spring.core.ex_2_qualifier.service.impl;

import com.spring.core.ex_2_qualifier.service.OrderService;

public class OrderServiceImpl_1 implements OrderService {
    public String getOrderDetails(String orderId) {
        return "Order details from Impl 1, for order id: " + orderId;
    }
}
