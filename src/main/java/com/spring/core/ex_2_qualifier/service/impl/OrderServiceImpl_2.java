package com.spring.core.ex_2_qualifier.service.impl;

import com.spring.core.ex_2_qualifier.service.OrderService;

public class OrderServiceImpl_2 implements OrderService {
    public String getOrderDetails(String orderId) {
        return "Order details from Impl 2, for oder id: " + orderId;
    }
}
