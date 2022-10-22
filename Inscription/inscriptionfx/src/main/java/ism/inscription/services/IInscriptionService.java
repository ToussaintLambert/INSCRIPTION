package ism.inscription.services;

import java.util.List;

import ism.inscription.Controllers.ProfesseurController;
import ism.inscription.entities.Classe;
import ism.inscription.entities.Etudiants;
import ism.inscription.entities.Professeur;
import ism.inscription.entities.User;



public interface IInscriptionService {
    public List<Classe>listerClasse();
    public Classe creerClasse(Classe classe);
    public Classe filtreClasseParLibClasse( String lib);
    public List<Classe> listerlesClassesUnProfesseur(String nomcomplet);
    public User creerUser(User user);
    public List <Professeur>listerProfesseurs();
    public Etudiants creerEtudiant(Etudiants etudiant);
    public List <Etudiants>listerEtudiants();
    public Classe filtrerClasseParLib(String lib);
    //public Object listerProfesseur();
    public List <ProfesseurController>listerProfesseur();
    public ProfesseurController creerProfesseur(ProfesseurController professeur);
    public User seConnecter(String login, String password);
}
