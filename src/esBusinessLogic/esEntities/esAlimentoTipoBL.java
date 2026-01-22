package esBusinessLogic.esEntities;

import esDataAccess.esDAOs.esAlimentoTipoDAO;
import esInfrastructure.esAppException;
public class esAlimentoTipoBL {
        public esAlimentoTipoDAO atDAO = null;

    public esAlimentoTipoBL() throws esAppException {
        atDAO = new esAlimentoTipoDAO();
    }


}
