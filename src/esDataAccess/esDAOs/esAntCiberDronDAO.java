package esDataAccess.esDAOs;

import esDataAccess.esDTOs.esAntCiberDronDTO;
import esDataAccess.esHelpers.DataHelperSQLiteDAO;
import esInfrastructure.esAppException;

public class esAntCiberDronDAO extends DataHelperSQLiteDAO<esAntCiberDronDTO>{
    public esAntCiberDronDAO() throws esAppException {
        super(esAntCiberDronDTO.class, "AntCiberDron", "IdAntCiberDron");
    }
}