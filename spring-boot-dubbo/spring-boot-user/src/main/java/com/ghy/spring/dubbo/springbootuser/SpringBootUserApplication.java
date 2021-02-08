package com.ghy.spring.dubbo.springbootuser;

import com.ghy.spring.dubbo.springbootapi.GhyServer;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
public class SpringBootUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootUserApplication.class, args);
    }

}
