package com.mocang.project.provider;
import java.util.concurrent.CompletableFuture;

/**
 * @author: mocang
 * @description
 * @date: 2023/10/23 11:15
 */
public interface DemoService {

    String sayHello(String name);

    String sayHello2(String name);

    default CompletableFuture<String> sayHelloAsync(String name) {
        return CompletableFuture.completedFuture(sayHello(name));
    }

}

