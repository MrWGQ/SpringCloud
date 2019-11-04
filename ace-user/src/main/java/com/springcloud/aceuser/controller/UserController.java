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
          return "Hello !" + name;
    }

}
