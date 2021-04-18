package com.example.springcloudsentinelnacos.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * sentinel集成nacos实现动态流控规则
 *
 * nacos控制台流控规则
 * [
 *     {
 *         "resource":"/dynamic",
 *         "limitApp":"default",
 *         "grade":1,
 *         "count":1,
 *         "strategy":0,
 *         "controlBehavior":0,
 *         "clusterMode":false
 *     }
 * ]
 *
 * @author tom
 * @version V1.0
 * @date 2021/4/18 18:58
 */
@RestController
public class DynamicController {

    @RequestMapping("/dynamic")
    public String dynamic(){
        return "Hello Dynamic Rule";
    }

}
