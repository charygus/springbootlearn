package com.viho.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;
import java.sql.SQLOutput;

/**
 * author viho
 *
 * @create 2020-11-17上午 9:31
 */
//RestController = ResponseBody+Controller
 @RestController
 //将ResponseBody注解加在类上表示 这个类的所有方法返回的数据直接写给浏览器
//如果为对象需转成json数据
@ResponseBody
@Controller
public class HelloController {

    @RequestMapping("hello")
    public String helloWorld(){
        System.out.println("访问控制器");
        return "Hello World";
    }
}
