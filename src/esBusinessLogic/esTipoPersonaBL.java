package esBusinessLogic;

import java.util.List;

import esDataAccess.esTipoPersonaDAO;
import esDataAccess.esDTO.esTipoPersonaDTO;

public class esTipoPersonaBL {
    private esTipoPersonaDTO esTpDTO;
    private esTipoPersonaDAO esTpDAO = new esTipoPersonaDAO();

    public esTipoPersonaBL(){}

    public List<esTipoPersonaDTO> esGetAll() throws Exception {
        return esTpDAO.readAll();
    }
    public esTipoPersonaDTO esGetBy(int esId) throws Exception {
        esTpDTO = esTpDAO.readBy(esId);
        return esTpDTO;
    }
    public boolean esAdd(esTipoPersonaDTO esRegDTO) throws Exception {
        return esTpDAO.create(esRegDTO);
    }    
    public boolean esUpdate(esTipoPersonaDTO esRegDTO) throws Exception {
        return esTpDAO.update(esRegDTO);
    }
    public boolean esDelete(int esId) throws Exception {
        return esTpDAO.delete(esId);
    }
    public Integer esGetRowCount() throws Exception {
        return esTpDAO.getRowCount();
    }

}
