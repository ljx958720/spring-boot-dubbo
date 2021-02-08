package com.ghy.spring.dubbo.springbootserver.serviceImpl;

import com.ghy.spring.dubbo.springbootserver.service.DemoService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @Author 卢佳新
 * @Date 2020/8/9 21:22
 * @Motto 不积跬步，无以至千里；不积小流，无以成江海。
 */
@DubboService(protocol = {"dubbo"}
 )
public class DemoServiceImpl implements DemoService {
    @Override
    public String demoServer() {
        return "这是泛化的例子";
    }
}
