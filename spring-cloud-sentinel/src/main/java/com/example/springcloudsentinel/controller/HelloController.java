package com.example.springcloudsentinel.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tom
 * @version V1.0
 * @date 2021/4/18 16:25
 */
@RestController
public class HelloController {

    @SentinelResource(value = "hello",blockHandler = "blockHandlerHello")
    @RequestMapping("/say")
    public String say(){
        return "hello, jsontom";
    }

    public String blockHandlerHello(BlockException e){
        return "被限流了";
    }



}
