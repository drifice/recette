package com.driss.recette.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
@AllArgsConstructor
@NoArgsConstructor
public class Etape {
    @Id
    private String Id;
    private Integer numero;
    private String description;
    private Integer durer;
}
