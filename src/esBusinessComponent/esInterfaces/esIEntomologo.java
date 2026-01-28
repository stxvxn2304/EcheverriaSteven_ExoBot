package esBusinessComponent.esInterfaces;

import java.util.List;

import esBusinessComponent.esEntities.esAlimento;
import esBusinessComponent.esEntities.esHormiga;
import esDataAccessComponent.esDTOs.esAlimentoDTO;
import esDataAccessComponent.esDTOs.esHormigaDTO;
import esInfrastructureComponent.esAppException;

public interface esIEntomologo {
    public List<esHormigaDTO> esEtlAntNest() throws esAppException;

    public List<esAlimentoDTO> esEtlAntFood() throws esAppException;

    public esHormiga esAlimentarAnt(esHormiga h, esAlimento a);

    // Refactorizacion
    public esAlimento esPreparar(esAlimento alimento);
}
