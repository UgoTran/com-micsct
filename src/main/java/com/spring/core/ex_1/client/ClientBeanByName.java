package com.spring.core.ex_1.client;

import com.spring.core.ex_1.service.ServiceBeanByName;
import org.springframework.beans.factory.annotation.Autowired;

public class ClientBeanByName {
    @Autowired
    private ServiceBeanByName clientBeanBN;

    public void showMess(){
        System.out.println("HelloClientBeanByName");
    }
}
