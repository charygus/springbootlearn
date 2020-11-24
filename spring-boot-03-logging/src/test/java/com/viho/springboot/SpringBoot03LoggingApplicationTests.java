package com.viho.springboot;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBoot03LoggingApplicationTests {


	//日志记录器
	Logger logger = LoggerFactory.getLogger(getClass());
	@Test
	void contextLoads() {
	}
	@Test
	public void testLoggin(){
		//日志的级别 由低到高trace<debug<info<warn<error
		//设置信息的级别 就只会显示该级别及以后的等级
		//项目在线上运行时 一般显示warn和error信息
		//springboot默认使用的是info级别的日志 没有指定级别 则使用info级别
		logger.trace("用来跟踪信息");
		logger.debug("debug信息");
		logger.info("输出信息");
		logger.warn("警告信息");
		logger.error("错误信息");
	}
}
