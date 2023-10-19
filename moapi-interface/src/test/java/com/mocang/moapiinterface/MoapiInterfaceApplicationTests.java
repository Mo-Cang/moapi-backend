package com.mocang.moapiinterface;

import com.mocang.moapiclientsdk.client.MoApiClient;
import com.mocang.moapiclientsdk.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class MoapiInterfaceApplicationTests {

    @Resource
    private MoApiClient moApiClient;

    @Test
    void contextLoads() {
        String mocang = moApiClient.getNameByGet("mocang");
        User user = new User();
        user.setUsername("mocang2");
        String userNameByPost = moApiClient.getUserNameByPost(user);
        System.out.println(mocang);
        System.out.println(userNameByPost);
    }

}
