package com.wby.Controller;




import com.wby.service.AdvertService;
import com.wby.service.Business_manageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class Business_systemController {
    @Autowired
    private AdvertService advertService;
    @Autowired
    private Business_manageService business_manageService;

    @RequestMapping(value = "service1")
    public String a(){
        return business_manageService.qyh();
    }

    @RequestMapping(value = "testService")
    public String b(String name){
        return advertService.sayHello(name);
    }
}
