package com.driss.recette.repositories;

import com.driss.recette.models.Recette;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RecetteRepository extends MongoRepository<Recette, String>{
}
