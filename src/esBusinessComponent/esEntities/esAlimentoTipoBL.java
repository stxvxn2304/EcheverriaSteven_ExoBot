package esBusinessComponent.esEntities;

import esDataAccessComponent.esDAOs.esAlimentoTipoDAO;
import esInfrastructureComponent.esAppException;
public class esAlimentoTipoBL {
        public esAlimentoTipoDAO atDAO = null;

    public esAlimentoTipoBL() throws esAppException {
        atDAO = new esAlimentoTipoDAO();
    }


}
