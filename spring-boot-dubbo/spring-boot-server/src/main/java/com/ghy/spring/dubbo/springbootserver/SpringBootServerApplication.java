package com.ghy.spring.dubbo.springbootserver;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//用注解方式配置包路径
@DubboComponentScan(basePackages = "com.ghy.spring.dubbo.springbootserver.service")
@SpringBootApplication
public class SpringBootServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootServerApplication.class, args);
    }

}
