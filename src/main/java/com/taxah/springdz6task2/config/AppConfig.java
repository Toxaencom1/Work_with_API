package com.taxah.springdz6task2.config;

import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;

/**
 * AppConfig Class
 *
 * This class serves as the configuration class for the Spring application.
 * It configures beans and properties needed for the application to function.
 */
@Configuration
@ConfigurationPropertiesScan("com.taxah.springdz6task2.config")
public class AppConfig {
    /**
     * RestTemplate Bean Configuration
     * <p>
     * Configures and returns a RestTemplate bean for making HTTP requests.
     *
     * @return RestTemplate: The configured RestTemplate bean.
     */
    @Bean
    public RestTemplate template() {
        return new RestTemplate();
    }

//    @Bean
//    public HttpHeaders headers()
//    {
//        return new HttpHeaders();
//    }
}
