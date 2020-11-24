package com.viho.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author viho
 *
 * @create 2020-11-18上午 11:18
 */
@RestController
public class HelloController {
    @RequestMapping("hello")
    public String hello(){
        return "hello";
    }
}
