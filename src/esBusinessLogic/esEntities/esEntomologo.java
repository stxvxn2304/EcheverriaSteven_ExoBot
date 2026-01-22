package esBusinessLogic.esEntities;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import esBusinessLogic.esInterfaces.esIEntomologo;
import esDataAccess.esDAOs.esEntomologoDAO;
import esDataAccess.esDTOs.esEntomologoDTO;
import esDataAccess.esDTOs.esHormigaDTO;
import esInfrastructure.esAppConfig;
import esInfrastructure.esAppException;
import esInfrastructure.esTools.esCMDColor;
import esInfrastructure.esTools.esCMDProgress;

public abstract class esEntomologo implements esIEntomologo {
    esEntomologoDAO eDAO;
    esEntomologoDTO eDTO;

    protected esEntomologo() throws esAppException {
        eDAO = new esEntomologoDAO();
        eDTO = new esEntomologoDTO();
    }
    
    public boolean checkLogin(String u, String p) throws esAppException{
        eDTO = eDAO.readBy(u, p);
        return (eDTO.getIdEntomologo()>0);
    }
    
    private int getIdHormigaTipoByName(String name) {
        switch (name) {
            case "HLarva":       return 1;
            case "HSoldado":     return 2;
            case "HRastreadora": return 3;
            case "HReina":       return 4;
            case "HZángano":     return 5;
            default:             return 0;
        }
    }
    @Override
    public List<esHormigaDTO> etlAntNest() throws esAppException {
        try {
            List<esHormigaDTO> lst = new java.util.ArrayList<>();
            List<String> allLines = Files.readAllLines(Paths.get(esAppConfig.getANTNEST()));
            Integer dataIdHormiga     = 0 ; 
            Integer dataIdHormigaTipo = null ; 
            Integer dataIdSexo        = 4 ;  // Asexual
            Integer dataIdEstado      = 1 ;  // Viva
            String  dataNombre        = null ; 
            String  dataDescripcion   = null ;

            for (String line : allLines) {
                System.out.println(line);
                for (String data : line.split(",")) {
                    dataIdHormigaTipo = getIdHormigaTipoByName(data.trim());
                    if (dataIdHormigaTipo > 0) {
                        dataNombre          = data.trim();
                        dataDescripcion     = "Hormiga de tipo " + data.trim();
                        
                        System.out.println(   esCMDColor.BLUE
                                            + esCMDProgress.showSpinner() 
                                            + dataNombre 
                                            + esCMDColor.RESET);
                        
                        esHormigaDTO h = new esHormigaDTO(  dataIdHormiga     , 
                                                        dataIdHormigaTipo , 
                                                        dataIdSexo        , 
                                                        dataIdEstado      , 
                                                        dataNombre        , 
                                                        dataDescripcion   ); 
                        lst.add( h );
                    }else{
                        System.out.println(   esCMDColor.RED 
                                            + esCMDProgress.showSpinner() 
                                            + data.trim() 
                                            + esCMDColor.RESET);
                    }
                }
            }
            return lst;
        } catch (Exception e) {
            throw new esAppException("Error leyendo el archivo de datos de hormigas: ", e, getClass(),"etlAntNest()");
        }
    }

    @Override
    public List<esAlimento> etlAntFood() {
        throw new UnsupportedOperationException("Unimplemented method 'etlAntFood'");
    }

    @Override
    public esHormiga alimentarAnt(esHormiga h, esAlimento a) {
        throw new UnsupportedOperationException("Unimplemented method 'alimentarAnt'");
    }
}
