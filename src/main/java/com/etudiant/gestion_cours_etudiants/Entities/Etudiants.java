package com.etudiant.gestion_cours_etudiants.Entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity

public class Etudiants {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomE;
    private String prenomE;
    private Date date_naissE;
    private String lieu_naissE;
    private String adresseE;
    private String filiereE;
    private String telE;

    @OneToMany(mappedBy ="etudiants" )
    private List<Suivre> suivreListList;
}
