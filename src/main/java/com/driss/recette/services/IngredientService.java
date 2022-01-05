package com.driss.recette.services;

import com.driss.recette.models.Recette;
import com.driss.recette.repositories.IngredientsRepository;
import com.driss.recette.repositories.RecetteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IngredientService {
    private RecetteRepository repository;

    public IngredientService(IngredientsRepository repository) {
        repository = repository;
    }

    public List<Recette> findAll() {
        return repository.findAll();
    }

    public Recette insert(Recette entity) {
        return repository.insert(entity);
    }

    public Recette save(Recette entity) {
        return repository.save(entity);
    }


    public void deleteById(String id) {
        repository.deleteById(id);
    }
}
