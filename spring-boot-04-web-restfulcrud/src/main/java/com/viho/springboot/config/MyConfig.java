package com.viho.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * author viho
 * 使用WebMvcConfigurerAdapter来实现添加springMVC扩展功能
 * @create 2020-11-23下午 4:23
 */
//加上EnableWebMvc则全面接管springmvc 先前springboot中的自动配置全部失效
//@EnableWebMvc
@Configuration
public class MyConfig extends WebMvcConfigurerAdapter {
    //重写addViewControllers 设置指定请求链接跳转到指定页面
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //super.addViewControllers(registry);
        registry.addViewController("viho").setViewName("success");
    }
    //实现对指定路径请求进行指定的页面跳转
    //所有webmvcconfigurerAdapter会一起起作用
    @Bean
    public WebMvcConfigurerAdapter webMvcConfigurerAdapter(){
        WebMvcConfigurerAdapter adapter = new WebMvcConfigurerAdapter() {
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                registry.addViewController("/").setViewName("login");
                registry.addViewController("/index.html").setViewName("login");
                registry.addViewController("/main.html").setViewName("dashboard");
            }
        };
        return adapter;
    }
}
