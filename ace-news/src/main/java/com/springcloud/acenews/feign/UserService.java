package com.springcloud.acenews.feign;


import com.springcloud.acenews.hystrix.AcUserServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


/**
* @Author:         wgq
* @CreateDate:     2019/11/4 16:36
* @Description:    跨服务调用User
* @Version:        1.0
*/
@FeignClient(name = "ace-user",fallback = AcUserServiceHystrix.class)
public interface UserService {

    /**
     * 远程调用User服务方法
     * @param name
     * @return
     */
    @RequestMapping(value = "/user/hello", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    String sayHello(@RequestParam(value = "name") String name);
}
