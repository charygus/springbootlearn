package com.viho.springboot.controller;

import com.sun.prism.shader.Solid_TextureYV12_AlphaTest_Loader;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Map;

/**
 * author viho
 *
 * @create 2020-11-20上午 9:37
 */
@Controller
public class HelloController {
    @ResponseBody
    @RequestMapping("hello")
    public String hello(){
        System.out.println("enter controller");
        return "welcome";
    }

    @RequestMapping("success")
    public  String success(Map<String,Object> map){
        map.put("hello","你好");
        map.put("hello1","<h1>你好</h1>");
        map.put("users", Arrays.asList("张三","王五","赵六"));
        System.out.println("enter");
        return "success";
    }

    /**
     * 模板引擎进行拼串 去templates下查找文件
     * @return
     */
/*    @RequestMapping({"/","/login.html"})
    public String index(){
        System.out.println("进入index");
    return "login";
    }*/
}
