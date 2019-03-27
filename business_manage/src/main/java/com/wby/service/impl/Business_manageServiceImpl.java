package com.wby.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.wby.service.Business_manageService;

@Service
public class Business_manageServiceImpl implements Business_manageService {
    @Override
    public String qyh() {
        return "test1的消息提供者";
    }
}
