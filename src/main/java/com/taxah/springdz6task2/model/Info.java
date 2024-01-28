package com.taxah.springdz6task2.model;

import lombok.Data;

/**
 * Info Class
 * <p>
 * This class represents metadata about character data retrieved from an external API.
 * It contains information such as the total count of characters, the number of pages, and links to navigate between pages.
 * <p>
 * Properties:
 * - count: The total count of characters.
 * - pages: The total number of pages.
 * - next: The URL for the next page of character data, if available.
 * - prev: The URL for the previous page of character data, if available.
 */
@Data
public class Info {
    private Integer count;
    private Integer pages;
    private String next;
    private String prev;
}
