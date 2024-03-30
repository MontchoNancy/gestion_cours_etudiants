package com.etudiant.gestion_cours_etudiants.Dao;

import com.etudiant.gestion_cours_etudiants.Entities.Etudiants;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantsRepository extends JpaRepository <Etudiants,Long> {
}
