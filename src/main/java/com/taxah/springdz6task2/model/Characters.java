package com.taxah.springdz6task2.model;

import lombok.Data;

import java.util.List;

/**
 * Characters Class
 * <p>
 * This class represents a collection of character information retrieved from an external API.
 * It contains metadata about the character data and a list of character results.
 */
@Data
public class Characters {
    Info info;
    List<Result> results;
}
