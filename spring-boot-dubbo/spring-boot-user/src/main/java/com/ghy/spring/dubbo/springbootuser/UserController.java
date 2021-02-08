package com.ghy.spring.dubbo.springbootuser;

import com.ghy.spring.dubbo.springbootapi.GhyServer;

import org.apache.dubbo.config.annotation.DubboReference;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    //指定调用服务端的版本2
    @DubboReference(registry = {"provider1","provider2"},
            protocol = "dubbo",//指定采取消费的协议
            loadbalance = "consistenthash",//负载均衡算法的选择
            mock = "com.ghy.spring.dubbo.springbootuser.FallService",//降级配置
            timeout = 500,//设置时间
            cluster = "failfast",//快速失败（500内没有返回时就快速失败）
            version = "2.0")
    GhyServer ghyServer;

    @GetMapping("/ghy")
    public String text()
        {
            return ghyServer.ghyServer("LuJiaXing");
        }
}

