package esDataAccessComponent.esDAOs;

import esInfrastructureComponent.esAppException;
import esDataAccessComponent.esDTOs.esAlimentoDTO;
import esDataAccessComponent.esHelpers.DataHelperSQLiteDAO;

public class esAlimentoDAO extends DataHelperSQLiteDAO<esAlimentoDTO> {
    public esAlimentoDAO() throws esAppException {
        super(esAlimentoDTO.class, "esAlimento", "esIdAlimento");
    }
}
