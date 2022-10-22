package ism.inscription.repositories;

import java.util.List;

import ism.inscription.entities.Etudiants;

public interface IEtudiantsRepository {
    public List <Etudiants>findAll();
    public Etudiants insert(Etudiants etudiant);
    
}
