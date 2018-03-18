package com.xzth.fegin03;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("service-hi")
public interface HelloService {

    @RequestMapping("hello")
    String sayHello(String name);
}
