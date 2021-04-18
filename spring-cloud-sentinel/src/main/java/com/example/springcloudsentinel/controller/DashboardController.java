package com.example.springcloudsentinel.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 *
 * @author tom
 * @version V1.0
 * @date 2021/4/18 17:56
 */
@RestController
public class DashboardController {

    @RequestMapping("/dash")
    public String dash(){
        return "Hello dash";
    }
}
