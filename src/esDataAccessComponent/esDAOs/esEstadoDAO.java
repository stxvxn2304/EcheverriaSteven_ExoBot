package esDataAccessComponent.esDAOs;

import esDataAccessComponent.esDTOs.esEstadoDTO;
import esDataAccessComponent.esHelpers.DataHelperSQLiteDAO;
import esInfrastructureComponent.esAppException;

public class esEstadoDAO extends DataHelperSQLiteDAO<esEstadoDTO>{
    public esEstadoDAO() throws esAppException {
        super(esEstadoDTO.class, "esEstado", "esIdEstado");
    }
}
