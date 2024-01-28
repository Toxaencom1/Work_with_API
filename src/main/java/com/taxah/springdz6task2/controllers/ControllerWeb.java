package com.taxah.springdz6task2.controllers;

import com.taxah.springdz6task2.model.Characters;
import com.taxah.springdz6task2.model.Result;
import com.taxah.springdz6task2.service.ServiceApi;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ControllerWeb Class
 * <p>
 * This class serves as a controller for handling web requests related to characters in a fictional universe.
 * It provides endpoints for retrieving characters, paginating character lists, and viewing character details.
 */
@AllArgsConstructor
@Controller
@RequestMapping("/characters")
public class ControllerWeb {
    private final ServiceApi service;

    /**
     * Get Characters
     * <p>
     * Handles requests to retrieve characters from page №1 and renders the main view.
     *
     * @param model Model: The model to which attributes are added for rendering the view.
     * @return String: The name of the view to render (main).
     */
    @RequestMapping
    public String getCharacters(Model model) {
        Characters characters = service.getCharactersOnPage(1);
        model.addAttribute("characters", characters);
        model.addAttribute("page", 1);
        return "main";
    }

    /**
     * Get Characters on Page
     * <p>
     * Handles requests to retrieve characters on a specific page and renders the main view.
     *
     * @param page  Integer: The page number of characters to retrieve.
     * @param model Model: The model to which attributes are added for rendering the view.
     * @return String: The name of the view to render (main).
     */
    @RequestMapping("/page/{pageNumber}")
    public String getCharactersOnPage(@PathVariable("pageNumber") Integer page, Model model) {
        Characters characters = service.getCharactersOnPage(page);
        model.addAttribute("characters", characters);
        model.addAttribute("page", page);
        return "main";
    }

    /**
     * Get Character by ID
     * <p>
     * Handles requests to retrieve details of a specific character and renders the character card view.
     *
     * @param id    Integer: The ID of the character to retrieve.
     * @param model Model: The model to which attributes are added for rendering the view.
     * @return String: The name of the view to render (card).
     */
    @RequestMapping("/card/{id}")
    public String getCharacterById(@PathVariable Integer id, Model model) {
        Result card = service.getCharacterById(id);
        model.addAttribute("card", card);
        return "card";
    }

}
