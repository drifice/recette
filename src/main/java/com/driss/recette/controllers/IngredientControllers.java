package com.driss.recette.controllers;

import com.driss.recette.models.Ingredient;
import com.driss.recette.models.Recette;
import com.driss.recette.services.IngredientService;
import com.driss.recette.services.RecetteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("ingredients")
@CrossOrigin
public class IngredientControllers {
    private IngredientService service;

    public IngredientControllers(RecetteService service) {
        service = service;
    }

    @GetMapping("")
    public List<Recette> findAll() {
        return service.findAll();
    }

    @PostMapping("")
    public  Ingredient insert(@RequestBody Ingredient entity) {
        return service.insert(entity);
    }

    @PutMapping("")
    public  Ingredient save(@RequestBody  Ingredient entity) {
        return service.save(entity);
    }

    @GetMapping("{id}")
    public  Ingredient findById(@PathVariable String id) {
        return service.findById(id);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable String id) {
        service.deleteById(id);
    }
}
