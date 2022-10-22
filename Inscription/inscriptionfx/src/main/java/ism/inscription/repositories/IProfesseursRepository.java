package ism.inscription.repositories;

import java.util.List;

import ism.inscription.Controllers.ProfesseurController;
import ism.inscription.entities.Professeur;



public interface IProfesseursRepository {
    public List <ProfesseurController>findAll();
    public ProfesseurController insert(Professeur professeur);
    public ProfesseurController findByNci(String nc);
    
    
}
