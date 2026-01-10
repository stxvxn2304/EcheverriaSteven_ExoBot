package esBusinessLogic;

import java.util.List;

import esDataAccess.esRazaDAO;
import esDataAccess.esDTO.esRazaDTO;

public class esRazaBL {
    private esRazaDTO esRDTO;
    private esRazaDAO esRDAO = new esRazaDAO();

    public esRazaBL(){}

    public List<esRazaDTO> esGetAll() throws Exception {
        return esRDAO.readAll();
    }
    public esRazaDTO esGetBy(int esId) throws Exception {
        esRDTO = esRDAO.readBy(esId);
        return esRDTO;
    }
    public boolean esAdd(esRazaDTO esRegDTO) throws Exception {
        return esRDAO.create(esRegDTO);
    }    
    public boolean esUpdate(esRazaDTO esRegDTO) throws Exception {
        return esRDAO.update(esRegDTO); 
    }    
    public boolean esDelete(int esId) throws Exception {
        return esRDAO.delete(esId);
    }
    public Integer esGetRowCount() throws Exception {
        return esRDAO.getRowCount();
    }

}
