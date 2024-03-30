package com.etudiant.gestion_cours_etudiants.Dao;

import com.etudiant.gestion_cours_etudiants.Entities.Cours;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoursRepository extends JpaRepository <Cours,Long>{
}
