package com.mocang.project.provider;
import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.rpc.RpcContext;

/**
 * @author: mocang
 * @description 示例服务实现类
 * @date: 2023/10/23 11:07
 */
@DubboService
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        System.out.println("Hello " + name + ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return "Hello " + name;
    }

    @Override
    public String sayHello2(String name) {
        return "mocang";
    }


}
