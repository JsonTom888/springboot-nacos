package com.example.nacossampleprovider;

import com.example.nacossampleapi.IHelloService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author tom
 * @version V1.0
 * @date 2021/4/12 22:26
 */
@Service
public class HelloServiceImpl implements IHelloService {
    @Override
    public String sayHello(String name) {
        return "Hello World:" + name;
    }
}
