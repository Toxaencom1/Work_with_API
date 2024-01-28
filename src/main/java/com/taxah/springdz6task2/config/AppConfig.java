package com.taxah.springdz6task2.config;

import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;


//не обязательный код, есть в задании
@Configuration
@ConfigurationPropertiesScan("com.taxah.springdz6task2.config")
public class AppConfig {
    @Bean
    public RestTemplate template(){
        return new RestTemplate();
    }

//    @Bean
//    public HttpHeaders headers()
//    {
//        return new HttpHeaders();
//    }
}
