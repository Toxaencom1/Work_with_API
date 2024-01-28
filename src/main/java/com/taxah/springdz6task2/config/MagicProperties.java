package com.taxah.springdz6task2.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;



@Component
@Data
@ConfigurationProperties(prefix = "base")
public class MagicProperties {
    String url;
    String characters;
    String locations;
    String episodes;
}
