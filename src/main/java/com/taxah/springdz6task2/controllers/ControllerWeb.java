package com.taxah.springdz6task2.controllers;

import com.taxah.springdz6task2.model.Characters;
import com.taxah.springdz6task2.model.Result;
import com.taxah.springdz6task2.service.ServiceApi;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@AllArgsConstructor
@Controller
@RequestMapping("/characters")
public class ControllerWeb {
    private final ServiceApi service;

    @RequestMapping
    public String getCharacters(Model model){
        Characters characters = service.getCharactersOnPage(1);
        model.addAttribute("characters",characters);
        model.addAttribute("page",1);
        return "main";
    }

    @RequestMapping("/page/{pageNumber}")
    public String getCharactersOnPage( @PathVariable("pageNumber") Integer page, Model model){
        Characters characters = service.getCharactersOnPage(page);
        model.addAttribute("characters",characters);
        model.addAttribute("page",page);
        return "main";
    }
    @RequestMapping("/card/{id}")
    public String getCharacterById(@PathVariable Integer id,Model model){
        Result card = service.getCharacterById(id);
        model.addAttribute("card",card);
        return "card";
    }

}
