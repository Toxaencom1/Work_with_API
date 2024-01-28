package com.taxah.springdz6task2.service;


import com.taxah.springdz6task2.model.Characters;
import com.taxah.springdz6task2.model.Result;

/**
 * ServiceApi Interface
 * <p>
 * This interface defines methods for retrieving character-related data from an external API.
 */
public interface ServiceApi {
    /**
     * Get Characters on Page
     * <p>
     * Retrieves a page of characters from the external API based on the specified page number.
     *
     * @param page int: The page number of characters to retrieve.
     * @return Characters: The characters retrieved from the API.
     */
    Characters getCharactersOnPage(int page);

    /**
     * Get Character by ID
     * <p>
     * Retrieves information about a character from the external API based on the specified character ID.
     *
     * @param id int: The ID of the character to retrieve.
     * @return Result: The character information retrieved from the API.
     */
    Result getCharacterById(int id);
}
