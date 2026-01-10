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
import esDataAccess.esDTO.esEstadoCivilDTO;

public class esEstadoCivilDAO extends DataHelperSQLite implements IDAO<esEstadoCivilDTO> {

    @Override
    public boolean create(esEstadoCivilDTO entity) throws Exception {
        String query = "INSERT INTO esCatalogo (esIdCatalogoTipo, esNombre, esDescripcion) VALUES (?, ?, ?)";
        try {
            Connection conn = openConnection();
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, 3);
            pstmt.setString(2, entity.getEsNombre());
            pstmt.setString(3, entity.getEsDescripcion());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            throw new esException(e.getMessage(), getClass().getName(), "create()");
        }
    }

    @Override
    public List<esEstadoCivilDTO> readAll() throws Exception {
        List<esEstadoCivilDTO> lst = new ArrayList<>();
        String query = " SELECT esIdCatalogo        "
                + " ,esIdCatalogoTipo          "
                + " ,esNombre                  "
                + " ,esDescripcion             "
                + " ,esEstado                  "
                + " ,esFechaCreacion           "
                + " ,esFechaModifica           "
                + " FROM  esCatalogo           "
                + " WHERE esEstado = 'A'       "
                + " AND   esIdCatalogoTipo = 3 ";
        try {
            Connection conn = openConnection(); // conectar a DB
            Statement stmt = conn.createStatement(); // CRUD: select * from
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                esEstadoCivilDTO s = new esEstadoCivilDTO(rs.getInt(1) // IdCatalogo
                        , rs.getInt(2) // IdCatalogoTipo
                        , rs.getString(3) // Nombre
                        , rs.getString(4) // Descripcion
                        , rs.getString(5) // Estado
                        , rs.getString(6) // FechaCreacion
                        , rs.getString(7));// FechaModifica
                lst.add(s);
            }
        } catch (SQLException e) {
            throw new esException(e.getMessage(), getClass().getName(), "readAll()");
        }
        return lst;
    }

    @Override
    public boolean update(esEstadoCivilDTO entity) throws Exception {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String query = "UPDATE esCatalogo SET esNombre = ?, esDescripcion = ?, esFechaModifica = ? WHERE esIdCatalogo = ?";
        try {
            Connection conn = openConnection();
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, entity.getEsNombre());
            pstmt.setString(2, entity.getEsDescripcion());
            pstmt.setString(3, dtf.format(now).toString());
            pstmt.setInt(4, entity.getEsIdCatalogo());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            throw new esException(e.getMessage(), getClass().getName(), "update()");
        }
    }

    @Override
    public boolean delete(int id) throws Exception {
        String query = "UPDATE esCatalogo SET esEstado = ? WHERE esIdCatalogo = ?";
        try {
            Connection conn = openConnection();
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, "X");
            pstmt.setInt(2, id);
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            throw new esException(e.getMessage(), getClass().getName(), "delete()");
        }
    }

    @Override
    public esEstadoCivilDTO readBy(Integer id) throws Exception {
        esEstadoCivilDTO s = new esEstadoCivilDTO();
        String query = " SELECT esIdCatalogo        "
                + " ,esIdCatalogoTipo          "
                + " ,esNombre                  "
                + " ,esDescripcion             "
                + " ,esEstado                  "
                + " ,esFechaCreacion           "
                + " ,esFechaModifica           "
                + " FROM  esCatalogo           "
                + " WHERE esEstado = 'A'       "
                + " AND   esIdCatalogoTipo = 3 "
                + " AND   esIdCatalogo = " + id.toString();
        try {
            Connection conn = openConnection(); // conectar a DB
            Statement stmt = conn.createStatement(); // CRUD: select * from
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                s = new esEstadoCivilDTO(rs.getInt(1) // IdCatalogo
                        , rs.getInt(2) // IdCatalogoTipo
                        , rs.getString(3) // Nombre
                        , rs.getString(4) // Descripcion
                        , rs.getString(5) // Estado
                        , rs.getString(6) // FechaCreacion
                        , rs.getString(7));// FechaModifica
            }
        } catch (SQLException e) {
            throw new esException(e.getMessage(), getClass().getName(), "readBy()");
        }
        return s;
    }

    @Override
    public Integer getRowCount() throws Exception {
        String query = " SELECT COUNT(*) TotalReg  "
                + " FROM esCatalogo            "
                + " WHERE esEstado = 'A'       "
                + " AND   esIdCatalogoTipo = 3 ";
        try {
            Connection conn = openConnection(); // conectar a DB
            Statement stmt = conn.createStatement(); // CRUD: select * from
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
