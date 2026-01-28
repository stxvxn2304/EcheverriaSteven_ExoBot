package esDataAccessComponent.esDAOs;


import esDataAccessComponent.esDTOs.esHormigaTipoDTO;
import esDataAccessComponent.esHelpers.DataHelperSQLiteDAO;
import esInfrastructureComponent.esAppException;

public class esHormigaTipoDAO extends DataHelperSQLiteDAO<esHormigaTipoDTO> {
    public esHormigaTipoDAO() throws esAppException {
        super(esHormigaTipoDTO.class, "esHormigaTipo", "esIdHormigaTipo");
    }

}
