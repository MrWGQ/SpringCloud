package com.springcloud.acenews.controller;

import com.springcloud.acenews.feign.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.netflix.eureka.EurekaDiscoveryClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/news")
public class NewsController {

    @Autowired
    private UserService userService;

    @PostMapping("/dyn")
    public String dynamicNews(@RequestParam String name){
        System.out.println(System.currentTimeMillis());
        return "good news!" + userService.sayHello(name);
    }

}
