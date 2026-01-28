package esDataAccessComponent.esDAOs;

import esInfrastructureComponent.esAppException;
import esDataAccessComponent.esDTOs.esSexoDTO;
import esDataAccessComponent.esHelpers.DataHelperSQLiteDAO;

public class esSexoDAO extends DataHelperSQLiteDAO<esSexoDTO> {
    public esSexoDAO() throws esAppException {
        super(esSexoDTO.class, "esSexo", "esIdSexo");
    }
}
