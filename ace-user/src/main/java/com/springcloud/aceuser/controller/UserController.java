package com.springcloud.aceuser.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {


    @PostMapping(value = "/hello")
    public String sayHello(@RequestParam String name){
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("访问到 user 服务 hello方法:"+currentTimeMillis);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("访问到 user 服务 hello方法，休眠结束:"+(System.currentTimeMillis() - currentTimeMillis));
        return "Hello !" + name;
    }

}
