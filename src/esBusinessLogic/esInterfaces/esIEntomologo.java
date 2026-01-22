package esBusinessLogic.esInterfaces;

import java.util.List;

import esBusinessLogic.esEntities.esAlimento;
import esBusinessLogic.esEntities.esHormiga;
import esDataAccess.esDTOs.esHormigaDTO;
import esInfrastructure.esAppException;

public interface esIEntomologo {
    public List<esHormigaDTO> etlAntNest() throws esAppException; 
    public List<esAlimento>   etlAntFood() ; 
    public esHormiga          alimentarAnt(esHormiga h, esAlimento a); 
}