package com.viho.config;

import com.viho.service.MyService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * author viho
 *
 * @create 2020-11-17下午 9:41
 */
//指明当前类是一个配置类 替代配置文件
//配置文件是利用bean标签配置组件
@Configuration
public class MyConfig {
    //@Bean 将方法的返回值添加到容器中 容器中这个组件的默认id就是这个方法名
    @Bean
    public MyService myService(){
        System.out.println("配置类@bean给容器中添加组件");
    return new MyService();
    }
}
