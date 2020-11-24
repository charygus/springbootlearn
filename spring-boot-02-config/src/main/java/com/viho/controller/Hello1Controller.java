package com.viho.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.naming.Name;

/**
 * author viho
 *
 * @create 2020-11-17上午 10:33
 */
@RestController
public class Hello1Controller {
    //获取配置文件中的属性值
   // @Value("${[person.last]}")
    private  String name;
    @RequestMapping("hello1")
    public String hello(){
        System.out.println("enter vontroller");
        return "Hello world";
    }
/*    @RequestMapping("helloName")
    public String getName(){
        return  "hello"+ name;
    }*/
}
