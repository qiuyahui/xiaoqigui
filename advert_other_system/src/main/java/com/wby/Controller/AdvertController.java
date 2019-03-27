package com.wby.Controller;


import com.wby.service.Business_manageService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class AdvertController {

    @Resource
    private com.wby.service.Business_manageService Business_manageService;


    @RequestMapping(value = "qyh")
    public String test(){
        return Business_manageService.qyh();
    }

}
