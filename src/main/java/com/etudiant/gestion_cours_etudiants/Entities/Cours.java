package com.etudiant.gestion_cours_etudiants.Entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity

public class Cours {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomC;
    private String descripC;
    private String filiereC;
    private Integer nb_heureC;
    private String enseignantC;
    private Integer nb_creditsC;

    @OneToMany(mappedBy ="cours" )
    private List<Suivre> suivreList;
}
