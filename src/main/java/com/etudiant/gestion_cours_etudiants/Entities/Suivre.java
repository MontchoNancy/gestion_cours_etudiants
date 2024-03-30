package com.etudiant.gestion_cours_etudiants.Entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.sql.Time;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
public class Suivre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date dateS;
    private Time heure_debutS;
    private Time heure_finS;

    @ManyToOne
    private Cours cours;

    @ManyToOne
    private Etudiants etudiants;
}
