package ism.inscription.services;

import java.util.List;

import ism.inscription.Controllers.ProfesseurController;
import ism.inscription.entities.Classe;
import ism.inscription.entities.Etudiants;
import ism.inscription.entities.Professeur;
import ism.inscription.entities.User;
import ism.inscription.repositories.IClasseRepository;
import ism.inscription.repositories.IEtudiantsRepository;
import ism.inscription.repositories.IProfesseursRepository;
import ism.inscription.repositories.IUserRepository;
import ism.inscription.repositories.bd.UserRepository;




public class InscriptionService implements IInscriptionService  {
    public IClasseRepository classeRepository;
    IUserRepository userRepository;
    IProfesseursRepository professeurRepository;
    IEtudiantsRepository etudiantsRepository;
   public InscriptionService(IClasseRepository classeRepository, UserRepository userRepository2 , Professeur professeurRepository2, IEtudiantsRepository etudiantsRepository) {
        this.classeRepository = classeRepository;
        this.userRepository = userRepository2;
        this.professeurRepository = professeurRepository2;
        this.etudiantsRepository = etudiantsRepository;
    }
    
public List<Classe> listerClasse(){
        return classeRepository.findAll();
    }
    
public List<ProfesseurController> listerProfesseur(){
        return professeurRepository.findAll();
}

public List<Etudiants> listerEtudiants(){
    return etudiantsRepository.findAll();
}


public Classe creerClasse(Classe classe){
    return classe.creerClasse(this);
}
    

public ProfesseurController creerProfesseur(Professeur professeur){
    return professeurRepository.insert(professeur);
}


    public Classe filtrerClasseParLib(String lib){
        return classeRepository.findByLibelle(lib);
}
    public User creerUser(User user){
        return userRepository.insert(user);

    }
    public Etudiant creerEtudiant(Etudiant etudiant){
        return etudiantsRepository.insert(etudiant);
    }
    public List<Classe> listerlesClassesUnProfesseur(String Nomcomplet){
        return classeRepository.findByProfesseur(Nomcomplet);
    }
    
    public Classe filtreClasseParLibClasse(String lib) {
       
        return null;
    }
    
    public List<Professeur> listerProfesseurs() {
       
        return null;
    }

    @Override
    public Classe creerClasse(Classe classe) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public User creerUser(User user) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Etudiants creerEtudiant(Etudiants etudiant) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ProfesseurController creerProfesseur(ProfesseurController professeur) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
