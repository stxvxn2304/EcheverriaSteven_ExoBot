package esBusinessComponent.esEntities;

import esInfrastructureComponent.esAppException;

public class esEntomologoGenestita extends esEntomologo {
    public esEntomologoGenestita(String usuario, String clave) throws esAppException {
        eDTO = new esDataAccessComponent.esDTOs.esEntomologoDTO(usuario, clave);
        eDAO = new esDataAccessComponent.esDAOs.esEntomologoDAO();
        eDAO.create(eDTO);
    }
}
