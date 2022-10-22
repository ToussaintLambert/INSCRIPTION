package ism.inscription.repositories.bd;




import java.sql.SQLException;
import java.util.List;

import ism.inscription.Core.MysqlDb;
import ism.inscription.entities.Etudiants;
import ism.inscription.entities.Role;
import ism.inscription.entities.User;
import ism.inscription.repositories.IEtudiantsRepository;





public class  UserRepository extends MysqlDb implements IEtudiantsRepository {
    private final String SQL_INSERT="`user` ( `login`, `password`, `role`, `adresse`, `email`) VALUES (?, ?, ?, ?, ?, ?);";
    @Override
    public User insert(User user) {
        this.ouvrirConnexionBD();
        try {
            ps=conn.prepareStatement(SQL_INSERT,java.sql.PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setString(1,user.getLogin());
            ps.setString(2,user.getLogin());
            ps.setString(3,user.getRole().name() );
            if(user.getRole()==Role.Ac){
                ps.setNull(4,java.sql.Types.FLOAT);
                ps.setString(5,((Ac )user).getEmail());
            }else{
                ps.setString(4,((Rp ) user).getAdresse());
                ps.setNull(5,java.sql.Types.FLOAT);

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
    public List<Etudiants> findAll() {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public Etudiants insert(Etudiants etudiant) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
