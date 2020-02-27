package com.springcloud.acenews.controller;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.date.TimeInterval;
import com.springcloud.acenews.feign.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.netflix.eureka.EurekaDiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/news")
public class NewsController {

    @Resource
    private UserService userService;

    @GetMapping("/dyn")
    public String dynamicNews(@RequestParam String name){
        TimeInterval timer = DateUtil.timer();
        String sayHello = userService.sayHello(name);
        System.out.println("耗时: "+timer.intervalSecond());
        return sayHello;
    }

}
