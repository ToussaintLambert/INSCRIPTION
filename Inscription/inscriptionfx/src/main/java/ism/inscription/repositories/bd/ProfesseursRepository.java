package ism.inscription.repositories.bd;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import ism.inscription.Controllers.ProfesseurController;
import ism.inscription.Core.MysqlDb;
import ism.inscription.entities.Professeur;
import ism.inscription.repositories.IProfesseursRepository;

public class ProfesseursRepository extends MysqlDb implements IProfesseursRepository {
    private final String  SQL_INSERT="`professeur` ( `nci`, `nomcomplet`, `grade`) VALUES ( ?, ?, ?);";
    @Override
    public ProfesseurController insert(Professeur professeur) {
        
   
        this.ouvrirConnexionBD();
        try {
            ps=conn.prepareStatement(SQL_INSERT,PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setString(1,ProfesseurController.getNci());
            ps.setString(2,ProfesseurController.getNomcomplet());
            ps.setString(3,professeur.getGrade());
            ps.executeUpdate();
            ResultSet rs=ps.getGeneratedKeys();
            if(rs.next()){
                professeur.setId(rs.getInt(1));
            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        this.fermerConnexionBD();
        // TODO Auto-generated method stub
        return null;
    }
    
       
    @Override
    public ProfesseurController findByNci(String nc) {
        return null;
    }

    @Override
    public List<ProfesseurController> findAll() {
        // TODO Auto-generated method stub
        return null;
    }


   
    
}
