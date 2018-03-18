package com.xzth.hystrixfegin;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "service-hi",fallback = HelloServiceImp.class)
public interface HelloService {

    @RequestMapping("hello")
    String sayHello(@RequestParam(value = "name") String name);
}
