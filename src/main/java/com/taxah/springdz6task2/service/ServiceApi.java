package com.taxah.springdz6task2.service;


import com.taxah.springdz6task2.model.Characters;
import com.taxah.springdz6task2.model.Result;

public interface ServiceApi {
    Characters getCharactersOnPage(int page);
    Result getCharacterById(int id);
}
