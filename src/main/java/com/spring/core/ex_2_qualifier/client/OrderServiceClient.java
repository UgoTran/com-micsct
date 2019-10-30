package com.spring.core.ex_2_qualifier.client;

import com.spring.core.ex_2_qualifier.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class OrderServiceClient {

    @Autowired
    @Qualifier("beanService_1")
    private OrderService orderService;

    public void showResult(){
        System.out.println(orderService.getOrderDetails("1"));
    }
}
