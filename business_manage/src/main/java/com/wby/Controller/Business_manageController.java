package com.wby.Controller;



import com.wby.service.AdvertService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class Business_manageController {
    @Resource
    private AdvertService advertService;


    @RequestMapping(value = "/test")
    public String test(String name){
        String a=advertService.sayHello(name);
        return a;
    }
}
