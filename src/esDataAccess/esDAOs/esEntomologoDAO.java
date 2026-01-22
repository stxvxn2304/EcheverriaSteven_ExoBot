package esDataAccess.esDAOs;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import esDataAccess.esDTOs.esEntomologoDTO;
import esDataAccess.esHelpers.DataHelperSQLiteDAO;
import esInfrastructure.esAppException;

public class esEntomologoDAO extends DataHelperSQLiteDAO<esEntomologoDTO>{
    public esEntomologoDAO() throws esAppException {
        super(esEntomologoDTO.class, "Entomologo", "IdEntomologo");
    }

    
    public esEntomologoDTO readBy( String usuario, String clave) throws esAppException {
        esEntomologoDTO dto = new esEntomologoDTO();
        String query = " SELECT IdEntomologo"
                      +"  ,Usuario       "
                      +"  ,Clave  "
                      +"  ,Estado       "
                      +"  ,FechaCreacion"   
                      +"  ,FechaModifica" 
                      +"  FROM Entomologo WHERE Usuario = '" + usuario + "' AND Clave = '" + clave + "'";
        try {
            Connection conn = openConnection();         // conectar a DB     
            Statement  stmt = conn.createStatement();   // CRUD : select * ...    
            ResultSet rs   = stmt.executeQuery(query);  // ejecutar la
            while (rs.next()) {
                dto = new esEntomologoDTO(rs.getInt(1)            // IdEntomologo
                                        ,rs.getString(2)        // Usuario            
                                        ,rs.getString(3)        // Clave        
                                        ,rs.getString(4)        // Estado
                                        ,rs.getString(5)        // FechaCreacion
                                        ,rs.getString(6)        // FechaModifica
                                      ); 
            }
        } 
        catch (SQLException e) {
            throw new esAppException("Ups... porblemas con la vista", e, getClass(), "getVWHormiga()");
        }
        return dto;
    }

}
