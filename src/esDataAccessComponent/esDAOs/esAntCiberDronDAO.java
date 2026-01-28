package esDataAccessComponent.esDAOs;

import esInfrastructureComponent.esAppException;
import esDataAccessComponent.esDTOs.esAntCiberDronDTO;
import esDataAccessComponent.esHelpers.DataHelperSQLiteDAO;

public class esAntCiberDronDAO extends DataHelperSQLiteDAO<esAntCiberDronDTO> {

    public esAntCiberDronDAO() throws esAppException {
        super(esAntCiberDronDTO.class, "esAntCiberDron", "esIdAntCiberDron");
    }

}
