package com.ghy.spring.dubbo.springbootserver.service;


import org.apache.dubbo.config.annotation.DubboService;
import com.ghy.spring.dubbo.springbootapi.GhyServer;


//其中version指的是版本的支持，我们在升级中为了保持老版本的功能也能正常使用，所以可以指定版本，在调用时指明被调用的版本就行
    //而registry是指注册中心的地址，可以配置多个
@DubboService(registry = {"provider1","provider2"},version = "1.0")
public class GhyServiceImpl implements GhyServer {
    @Override
    public String ghyServer(String str) {
        return "1返回的信息是"+str;
    }
}
