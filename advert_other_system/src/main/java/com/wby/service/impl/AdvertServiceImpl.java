package com.wby.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.wby.service.AdvertService;

@Service
public class AdvertServiceImpl implements AdvertService {
    @Override
    public String sayHello(String name) {
        return "hellosdffdhfgjhfgjkkhjkh"+ name +"!";
    }

    @Override
    public String sayHello1() {
        return "12";
    }
}
