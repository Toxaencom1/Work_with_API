package com.taxah.springdz6task2.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


/**
 * MagicProperties Class
 * <p>
 * This class represents a set of properties related to a fictional universe.
 * It is used for configuring various aspects of the application, such as URLs, characters, locations, and episodes.
 * <p>
 * Annotations:
 * - @ConfigurationProperties: Binds and validates properties from the specified prefix in application.properties to fields in this class.
 * <p>
 * Properties:
 * - url: The base URL for accessing resources related to the fictional universe.
 * - characters: The URL for accessing information about characters in the fictional universe.
 */
@Component
@Data
@ConfigurationProperties(prefix = "base")
public class MagicProperties {
    String url;
    String characters;
}
