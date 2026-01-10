package esBusinessLogic;

import java.util.List;

import esDataAccess.esEstadoCivilDAO;
import esDataAccess.esDTO.esEstadoCivilDTO;

public class esEstadoCivilBL {
    private esEstadoCivilDTO esEcDTO;
    private esEstadoCivilDAO esEcDAO = new esEstadoCivilDAO();

    public esEstadoCivilBL(){}

    public List<esEstadoCivilDTO> esGetAll() throws Exception {
        List<esEstadoCivilDTO> lst = esEcDAO.readAll();
        for (esEstadoCivilDTO esEstadoCivilDTO : lst)
            esEstadoCivilDTO.setEsNombre(esEstadoCivilDTO.getEsNombre().toUpperCase());
        return lst;
    }
    public esEstadoCivilDTO esGetBy(int esId) throws Exception {
        esEcDTO = esEcDAO.readBy(esId);
        return esEcDTO;
    }
    public boolean esAdd(esEstadoCivilDTO esRegDTO) throws Exception {
        return esEcDAO.create(esRegDTO);
    }    
    public boolean esUpdate(esEstadoCivilDTO esRegDTO) throws Exception {
        return esEcDAO.update(esRegDTO);
    }
    public boolean esDelete(int esId) throws Exception {
        return esEcDAO.delete(esId);
    }
    public Integer esGetRowCount() throws Exception {
        return esEcDAO.getRowCount();
    }    
}

