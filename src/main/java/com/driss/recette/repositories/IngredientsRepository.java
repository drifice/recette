package com.driss.recette.repositories;

import com.driss.recette.models.Ingredient;
import com.driss.recette.models.Recette;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IngredientsRepository  extends MongoRepository<Ingredient, String> {
}
