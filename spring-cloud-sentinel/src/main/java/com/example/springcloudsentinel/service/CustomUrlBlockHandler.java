package com.example.springcloudsentinel.service;

import com.alibaba.csp.sentinel.adapter.servlet.callback.UrlBlockHandler;
import com.alibaba.csp.sentinel.slots.block.BlockException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author tom
 * @version V1.0
 * @date 2021/4/18 18:00
 */
//@Service
public class CustomUrlBlockHandler implements UrlBlockHandler {
    @Override
    public void blocked(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, BlockException e) throws IOException {
        httpServletResponse.setHeader("Content-Type","application/json;charset=UTF-8");
        String message = "{\"code\":999,\"msg\":\"访问人数过多，请稍后重试！\"}";
        httpServletResponse.getWriter().write(message);
    }
}
