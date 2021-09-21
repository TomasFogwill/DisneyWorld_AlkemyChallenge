package com.fogwill.DisneyWorld.controllers;

import java.util.ArrayList;

import com.fogwill.DisneyWorld.models.Genre;
import com.fogwill.DisneyWorld.services.GenreService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/genres")
public class GenreController {
    @Autowired
    GenreService genreService;

    @GetMapping
    public ArrayList<Genre> getGenres(){
        return genreService.getGenres();
    }

    @PostMapping
    public Genre saveGenre(@RequestBody Genre genre){
        return genreService.saveGenre(genre);
    }
    
}