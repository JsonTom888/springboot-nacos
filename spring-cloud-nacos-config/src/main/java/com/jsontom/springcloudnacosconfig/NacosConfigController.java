package com.jsontom.springcloudnacosconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tom
 * @version V1.0
 * @date 2021/4/17 18:44
 */
@RestController
public class NacosConfigController {

    @Value("${my.flag}")
    String flag;

    @RequestMapping("/flag")
    public String get(){
        return flag;
    }

}
