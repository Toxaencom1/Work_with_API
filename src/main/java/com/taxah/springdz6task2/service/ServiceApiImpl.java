package com.taxah.springdz6task2.service;


import com.taxah.springdz6task2.config.MagicProperties;
import com.taxah.springdz6task2.model.Characters;
import com.taxah.springdz6task2.model.Result;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@AllArgsConstructor
@Service
public class ServiceApiImpl implements ServiceApi {


    private RestTemplate template;
    //    private HttpHeaders headers;// не пригодилось
    private final MagicProperties url;

    /**
     * Get Characters on Page
     * <p>
     * Retrieves a page of characters from the external API based on the specified page number.
     *
     * @param page int: The page number of characters to retrieve.
     * @return Characters: The characters retrieved from the API.
     */
    public Characters getCharactersOnPage(int page) {
        String pageURL = url.getCharacters() + "?page=" + page;
        return template.getForObject(pageURL, Characters.class);
    }

    /**
     * Get Character by ID
     * <p>
     * Retrieves information about a character from the external API based on the specified character ID.
     *
     * @param id int: The ID of the character to retrieve.
     * @return Result: The character information retrieved from the API.
     */
    public Result getCharacterById(int id) {
        String characterURL = url.getCharacters() + "/" + id;
        return template.getForObject(characterURL, Result.class);

    }

}
