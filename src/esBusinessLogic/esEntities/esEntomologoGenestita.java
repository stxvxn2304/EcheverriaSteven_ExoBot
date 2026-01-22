package esBusinessLogic.esEntities;

import esInfrastructure.esAppException;

public class esEntomologoGenestita extends esEntomologo {
    public esEntomologoGenestita(String usuario, String clave) throws esAppException {
        eDTO = new esDataAccess.esDTOs.esEntomologoDTO(usuario, clave);
    }
}
