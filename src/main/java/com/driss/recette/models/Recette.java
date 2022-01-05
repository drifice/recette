package com.driss.recette.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Data
@Document
@AllArgsConstructor
@NoArgsConstructor
public class Recette {
    @Id
    private String id;
    private String nom;
    private String description;
    private String auteur;
    @DBRef
    private List<Etape> etape = new ArrayList<>();
    private List<Ingredient> ingredients = new ArrayList<>();

}
