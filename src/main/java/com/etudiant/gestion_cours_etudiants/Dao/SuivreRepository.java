package com.etudiant.gestion_cours_etudiants.Dao;

import com.etudiant.gestion_cours_etudiants.Entities.Suivre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SuivreRepository extends JpaRepository<Suivre,Long> {
}
