package esDataAccess.esDAOs;

import esDataAccess.esDTOs.esSexoDTO;
import esDataAccess.esHelpers.DataHelperSQLiteDAO;
import esInfrastructure.esAppException;

public class esSexoDAO extends DataHelperSQLiteDAO<esSexoDTO>{
    public esSexoDAO() throws esAppException {
        super(esSexoDTO.class, "Sexo", "IdSexo");
    }
}
