package esDataAccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import esDataAccess.esHelpers.DataHelperSQLite;
import esDataAccess.esHelpers.IDAO;
import esFramework.esException;
import esDataAccess.esDTO.esSexoAnteDTO;

public class esSexoAnteDAO extends DataHelperSQLite implements IDAO<esSexoAnteDTO> {

    @Override
    public boolean create(esSexoAnteDTO entity) throws Exception {
        String query = "INSERT INTO esSexo (esNombre) VALUES (?)";
        try {
            Connection conn = openConnection();
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, entity.getEsNombre());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            throw new esException(e.getMessage(), getClass().getName(), "create()");
        }
    }

    @Override
    public List<esSexoAnteDTO> readAll() throws Exception {
        List <esSexoAnteDTO> lst = new ArrayList<>();
        String query    =" SELECT esIdSexo      "   
                        +" ,esNombre            " 
                        +" ,esEstado            " 
                        +" ,esFechaCreacion     " 
                        +" ,esFechaModifica     " 
                        +" FROM  esSexo         "
                        +" WHERE esEstado = 'A' ";
        try {
            Connection conn = openConnection();          //conectar a DB
            Statement stmt = conn.createStatement();     //CRUD: select * from
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                esSexoAnteDTO s = new esSexoAnteDTO(rs.getInt    (1), //IdSexo
                                                    rs.getString (2), //Nombre
                                                    rs.getString (3), //Estado
                                                    rs.getString (4), //FechaCreacion
                                                    rs.getString (5)); //FechaModifica
                lst.add(s);
            }
        } catch (SQLException e) {
            throw new esException(e.getMessage(), getClass().getName(), "readAll()");
        }
        return lst;
    }

    @Override
    public boolean update(esSexoAnteDTO entity) throws Exception {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String query = "UPDATE esSexo SET esNombre = ?, esFechaModifica = ? WHERE esIdSexo = ?";
        try {
            Connection conn = openConnection();
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, entity.getEsNombre());
            pstmt.setString(2, dtf.format(now).toString());
            pstmt.setInt(3, entity.getEsIdSexo());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            throw new esException(e.getMessage(), getClass().getName(), "update()");
        }
    }
    
    @Override
    public boolean delete(int id) throws Exception {
        String query = "UPDATE esSexo SET esEstado = ? WHERE esIdSexo = ?";
        try {
            Connection        conn = openConnection();
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, "X");
            pstmt.setInt(2, id);
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            throw e;
        }
    }
    @Override
    public esSexoAnteDTO readBy(Integer id) throws Exception {
        esSexoAnteDTO s = new esSexoAnteDTO();
        String query = " SELECT esIdSexo      "
                + " ,esNombre            "
                + " ,esEstado            "
                + " ,esFechaCreacion     "
                + " ,esFechaModifica     "
                + " FROM  esSexo         "
                + " WHERE esEstado = 'A' "
                + " AND   esIdSexo = " + id.toString();
        try {
            Connection conn = openConnection(); // conectar a DB
            Statement stmt = conn.createStatement(); // CRUD: select * from
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                s = new esSexoAnteDTO(rs.getInt(1), // IdSexo
                        rs.getString(2), // Nombre
                        rs.getString(3), // Estado
                        rs.getString(4), // FechaCreacion
                        rs.getString(5)); // FechaModifica
            }
        } catch (SQLException e) {
            throw new esException(e.getMessage(), getClass().getName(), "delete()");
        }
        return s;
    }

    @Override
    public Integer getRowCount() throws Exception {
        String query =" SELECT COUNT(*) TotalReg FROM esSexo "
                     +" WHERE esEstado = 'A' ";
        try {
            Connection conn = openConnection();          //conectar a DB
            Statement stmt = conn.createStatement();     //CRUD: select * from
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (SQLException e) {
            throw new esException(e.getMessage(), getClass().getName(), "getRowCount()");
        }
        return 0;
    }

}
