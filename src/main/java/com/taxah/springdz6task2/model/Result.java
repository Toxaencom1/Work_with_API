package com.taxah.springdz6task2.model;

import lombok.Data;

import java.util.Date;

/**
 * Result Class
 * <p>
 * This class represents individual character information retrieved from an external API.
 * It contains various attributes such as character ID, name, status, species, type, gender, image URL, URL, and creation date.
 * <p>
 * Properties:
 * - id: The unique identifier of the character.
 * - name: The name of the character.
 * - status: The status of the character (e.g., "Alive", "Dead", "Unknown").
 * - species: The species of the character.
 * - type: The type of the character.
 * - gender: The gender of the character.
 * - image: The URL of the character's image.
 * - url: The URL of the character's details.
 * - created: The creation date of the character.
 */
@Data
public class Result {
    private Integer id;
    private String name;
    private String status;
    private String species;
    private String type;
    private String gender;
    private String image;
    private String url;
    private Date created;
}
