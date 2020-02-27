package com.springcloud.acenews.hystrix;

import com.springcloud.acenews.feign.UserService;
import org.springframework.stereotype.Component;

/**
* @Author:         wgq
* @CreateDate:     2019/11/4 17:07
* @Description:    熔断降级
* @Version:        1.0
*/
@Component
public class AcUserServiceHystrix implements UserService {
    @Override
    public String sayHello(String name) {
        return "用户服务不可用，稍后再试";
    }
}
