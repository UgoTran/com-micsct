package com.spring.core.ex_1.client;

import com.spring.core.ex_1.service.HelloWorldService;
import com.spring.core.ex_1.serviceImpl.HelloWorldServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

public class HelloWorldClient {
    // tell spring container where perform  DI
    @Autowired
    public HelloWorldService helloWorld;

    public void showMessage(){
        helloWorld.sayHi();
    }
}
