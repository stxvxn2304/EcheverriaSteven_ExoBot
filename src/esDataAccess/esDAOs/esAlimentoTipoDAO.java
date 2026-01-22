package esDataAccess.esDAOs;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import esDataAccess.esDTOs.esAlimentoTipoDTO;
import esDataAccess.esHelpers.DataHelperSQLiteDAO;
import esInfrastructure.esAppException;

public class esAlimentoTipoDAO extends DataHelperSQLiteDAO<esAlimentoTipoDTO>{
    public esAlimentoTipoDAO() throws esAppException {
        super(esAlimentoTipoDTO.class, "AlimentoTipo", "IdAlimentoTipo");
    }
      
    public esAlimentoTipoDTO check (String nombre) throws esAppException {
        esAlimentoTipoDTO dto = new esAlimentoTipoDTO();
        String query = " SELECT IdAlimentoTipo"
                      +"  ,Nombre         "   
                      +"  ,Descripcion    "     
                      +"  ,Estado       "
                      +"  ,FechaCreacion"   
                      +"  ,FechaModifica" 
                      +"  FROM AlimentoTipo WHERE Nombre = '"+ nombre + "' ";
        try {
            Connection conn = openConnection();         // conectar a DB     
            Statement  stmt = conn.createStatement();   // CRUD : select * ...    
            ResultSet rs   = stmt.executeQuery(query);  // ejecutar la
            while (rs.next()) {
                dto = new esAlimentoTipoDTO(rs.getInt(1)          // IdAlimentoTipo
                                        ,rs.getString(2)        // Nombre            
                                        ,rs.getString(3)        // Descripcion             
                                        ,rs.getString(4)        // Estado
                                        ,rs.getString(5)        // FechaCreacion
                                        ,rs.getString(6)        // FechaModifica
                                      ); 
            }
            return dto;
        } 
        catch (SQLException e) {
            throw new esAppException("Ups... porblemas con la vista", e, getClass(), "getVWHormiga()");
        }
    }
}

