package com.wby.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.wby.service.Business_systemService;

@Service
public class Business_systemServiceImpl implements Business_systemService {
    @Override
    public String test() {
        return "business_system的提供者！！！";
    }
}
