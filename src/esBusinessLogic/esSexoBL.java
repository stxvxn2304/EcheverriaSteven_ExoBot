package esBusinessLogic;
import java.util.List;

import esDataAccess.esSexoDAO;
import esDataAccess.esDTO.esSexoDTO;

public class esSexoBL {
    private esSexoDTO esSexo;
    private esSexoDAO esSDAO = new esSexoDAO();

    public esSexoBL(){}

    public List<esSexoDTO> esGetAll() throws Exception {
        List<esSexoDTO> lst = esSDAO.readAll();
        for (esSexoDTO esSexoDTO : lst)
            esSexoDTO.setEsNombre(esSexoDTO.getEsNombre().toUpperCase());
        return lst;
    }
    public esSexoDTO esGetBy(int esId) throws Exception {
        esSexo = esSDAO.readBy(esId);
        return esSexo;
    }
    public boolean esAdd(esSexoDTO esRegDTO) throws Exception {
        return esSDAO.create(esRegDTO);
    }    
    public boolean esUpdate(esSexoDTO esRegDTO) throws Exception {
        return esSDAO.update(esRegDTO);
    }
    public boolean esDelete(int esId) throws Exception {
        return esSDAO.delete(esId);
    }
    public Integer esGetRowCount() throws Exception {
        return esSDAO.getRowCount();
    }

}
