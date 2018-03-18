package com.xzth.hystrixfegin;

import org.springframework.stereotype.Component;

@Component
public class HelloServiceImp implements HelloService {
    @Override
    public String sayHello(String name) {
        return "sorry "+name+"!";
    }
}
