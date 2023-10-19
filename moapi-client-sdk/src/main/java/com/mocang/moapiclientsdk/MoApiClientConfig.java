package com.mocang.moapiclientsdk;

import com.mocang.moapiclientsdk.client.MoApiClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author: mocang
 * @description 配置类
 * @date: 2023/10/19 10:51
 */
@Configuration
@ConfigurationProperties("moapi.client")
@Data
@ComponentScan
public class MoApiClientConfig {
    private String accessKey;

    private String secretKey;

    @Bean
    public MoApiClient moApiClient() {
        return new MoApiClient(accessKey, secretKey);
    }

}
