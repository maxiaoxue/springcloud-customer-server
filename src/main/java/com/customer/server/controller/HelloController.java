package com.customer.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {

    @Autowired
    private RestTemplate resttemplate;

    @RequestMapping("/hello")
    public String hello(){
        String url="http://provider-user/hello";

        //返回值类型和我们的业务返回值一致
        return resttemplate.getForObject(url);

    }
}
