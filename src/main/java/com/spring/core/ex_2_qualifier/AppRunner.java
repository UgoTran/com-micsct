package com.spring.core.ex_2_qualifier;

import com.spring.core.ex_2_qualifier.client.OrderServiceClient;
import com.spring.core.ex_2_qualifier.service.OrderService;
import com.spring.core.ex_2_qualifier.service.impl.OrderServiceImpl_1;
import com.spring.core.ex_2_qualifier.service.impl.OrderServiceImpl_2;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppRunner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext acaContext = new AnnotationConfigApplicationContext(AppRunner.class);
        OrderServiceClient oscBean = acaContext.getBean(OrderServiceClient.class);
        oscBean.showResult();
    }

    @Bean
    public OrderServiceClient createOrderServiceClient(){
        return new OrderServiceClient();
    }

    @Bean
    @Qualifier("beanService_1")
    public OrderService createService_1(){
        return new OrderServiceImpl_1();
    }

    @Bean OrderService createService_2(){
        return new OrderServiceImpl_2();
    }
}
