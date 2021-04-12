package com.example.nacossamplecomsumer;

import com.example.nacossampleapi.IHelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tom
 * @version V1.0
 * @date 2021/4/12 23:10
 */
@RestController
public class HelloController {

    @Reference
    IHelloService iHelloService;

    @GetMapping("/hello")
    public String hello(String name){
        return iHelloService.sayHello(name);
    }


}
