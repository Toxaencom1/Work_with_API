package com.taxah.springdz6task2.service;


import com.taxah.springdz6task2.config.MagicProperties;
import com.taxah.springdz6task2.model.Characters;
import com.taxah.springdz6task2.model.Result;
import lombok.AllArgsConstructor;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;



@AllArgsConstructor
@Service
public class ServiceApiImpl implements ServiceApi{


    private RestTemplate template;
    private HttpHeaders headers;
    private final MagicProperties url;

    public Characters getCharactersOnPage(int page){
        String pageURL = url.getCharacters()+"?page="+page;
        return template.getForObject(pageURL, Characters.class);
    }

    public Result getCharacterById(int id){
        String characterURL = url.getCharacters()+"/"+id;
        return template.getForObject(characterURL, Result.class);

    }

}
