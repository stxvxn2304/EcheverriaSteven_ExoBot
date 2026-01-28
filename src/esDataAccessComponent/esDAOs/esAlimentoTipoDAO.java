package esDataAccessComponent.esDAOs;

import esInfrastructureComponent.esAppException;


import esDataAccessComponent.esDTOs.esAlimentoTipoDTO;
import esDataAccessComponent.esHelpers.DataHelperSQLiteDAO;

public class esAlimentoTipoDAO extends DataHelperSQLiteDAO<esAlimentoTipoDTO> {
    public esAlimentoTipoDAO() throws esAppException {
        super(esAlimentoTipoDTO.class, "esAlimentoTipo", "esIdAlimentoTipo");
    }

}
