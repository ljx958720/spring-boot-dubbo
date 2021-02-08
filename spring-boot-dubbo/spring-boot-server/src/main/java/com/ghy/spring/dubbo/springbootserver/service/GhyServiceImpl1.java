package com.ghy.spring.dubbo.springbootserver.service;
import com.ghy.spring.dubbo.springbootapi.GhyServer;

import org.apache.dubbo.config.annotation.DubboService;

//其中veersion指的是版本的支持，我们可以在升级中为了保持老版本的功能也能正常使用，所以可以指定
//而registry是指注册中心的地址，可以配置多个
@DubboService(registry = {"provider1","provider2"},
        protocol = {"dubbo","rest"},//表示支持多通信协议
        cluster = "failover",
        version = "2.0")
public class GhyServiceImpl1 implements GhyServer{
    @Override
    public String ghyServer(String str) {

//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        return "返回的信息是"+str;
    }
}
