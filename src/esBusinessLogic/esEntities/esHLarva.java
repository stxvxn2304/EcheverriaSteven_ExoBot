package esBusinessLogic.esEntities;

import java.util.List;

import esDataAccess.esDTOs.esHormigaDTO;
import esInfrastructure.esAppException;

public class esHLarva extends esHormiga {

    public esHormigaDTO getLava(int id) throws esAppException{
        data = factory.getBy(id);
        return data;
    }
    
    public List<esHormigaDTO> getLarvas() throws esAppException {
        return factory.getAll();
    }
    
    public esHormiga comer(String comida) {
        if (comida.equals("carne")) {
            return new esHSoldado();
        }
        return this;
    }

    @Override
    public String toString() {
        return "HLarva {}";
    }
}
