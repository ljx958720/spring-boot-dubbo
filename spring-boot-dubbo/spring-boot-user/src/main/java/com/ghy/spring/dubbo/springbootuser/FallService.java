package com.ghy.spring.dubbo.springbootuser;

import com.ghy.spring.dubbo.springbootapi.GhyServer;


public class FallService implements GhyServer {

    @Override
    public String ghyServer(String str) {

            return "这是服务降级";
        }
    }
