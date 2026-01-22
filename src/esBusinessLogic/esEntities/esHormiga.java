package esBusinessLogic.esEntities;

import esBusinessLogic.esFactoryBL;
import esDataAccess.esDAOs.esHormigaDAO;
import esDataAccess.esDTOs.esHormigaDTO;

public abstract class esHormiga {
    protected esFactoryBL<esHormigaDTO> factory = new esFactoryBL<>(esHormigaDAO.class);
    public esHormigaDTO data = new esHormigaDTO();
    esAntCiberDron usaAntCiberDron = new esAntCiberDron();
    
    // protected HormigaDAO hormigaDAO;
    // protected Hormiga() throws AppException  {
    //     this.hormigaDAO = new HormigaDAO();
    // }

    // public FactoryBL<HormigaDTO> factory = new FactoryBL<>(() -> {
    //     try {
    //         return new HormigaDAO();
    //     } catch (Exception e) {
    //         new RuntimeException();
    //     }
    // });
}
