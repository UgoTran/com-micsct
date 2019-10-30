package com.spring.core.ex_1.client;

import com.spring.core.ex_1.service.ServiceBean;

public class ClientBean {
    private ServiceBean serviceBean;

    public void setServiceBean(ServiceBean serviceBean) {
        this.serviceBean = serviceBean;
    }

    public void showMess(){
        System.out.println("HelloClientBean");
    }
}
