package esDataAccess.esDAOs;

import esDataAccess.esDTOs.esEstadoDTO;
import esDataAccess.esHelpers.DataHelperSQLiteDAO;
import esInfrastructure.esAppException;

public class esEstadoDAO extends DataHelperSQLiteDAO<esEstadoDTO>{
    public esEstadoDAO() throws esAppException {
        super(esEstadoDTO.class, "Estado", "IdEstado");
    }
}
