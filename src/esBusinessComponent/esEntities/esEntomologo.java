package esBusinessComponent.esEntities;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import esBusinessComponent.esInterfaces.esIEntomologo;
import esDataAccessComponent.esDAOs.esAlimentoTipoDAO;
import esDataAccessComponent.esDAOs.esEntomologoDAO;
import esDataAccessComponent.esDAOs.esHormigaTipoDAO;
import esDataAccessComponent.esDTOs.esAlimentoDTO;
import esDataAccessComponent.esDTOs.esAlimentoTipoDTO;
import esDataAccessComponent.esDTOs.esEntomologoDTO;
import esDataAccessComponent.esDTOs.esHormigaDTO;
import esDataAccessComponent.esDTOs.esHormigaTipoDTO;
import esInfrastructureComponent.esAppConfig;
import esInfrastructureComponent.esAppException;
import esInfrastructureComponent.esTools.esCMDColor;
import esInfrastructureComponent.esTools.esCMDProgress;

public class esEntomologo implements esIEntomologo {
    esEntomologoDAO eDAO;
    esEntomologoDTO eDTO;

    public esEntomologo() throws esAppException {
        eDAO = new esEntomologoDAO();
    }
    
    
   
    @Override
    public List<esHormigaDTO> esEtlAntNest() throws esAppException {
        try {
            List<esHormigaDTO> lst = new java.util.ArrayList<>();
            List<String> allLines = Files.readAllLines(Paths.get(esAppConfig.getANTNEST()));
            Integer dataIdHormigaTipo = null ; 
            Integer dataIdSexo        = 4    ;  // Asexual
            Integer dataIdEstado      = 1    ;  // Viva
            String  dataNombre        = null ; 
            String  dataDescripcion   = null ;
            int     count             = 0    ;
            for (String line : allLines) {
                for (String data : line.split(",")) {
                    data = data.trim().substring(1);
                    dataIdHormigaTipo = getIdHormigaTipoByName(data);
                    if (dataIdHormigaTipo > 0) {
                        count++;
                        dataNombre          = data + count;
                        dataDescripcion     = "Hormiga de tipo " + data;
                        System.out.println(esCMDColor.BLUE);
                        //esCMDProgress.showLoad();
                        System.out.println(data + esCMDColor.RESET);
                        
                        esHormigaDTO h = new esHormigaDTO(dataIdHormigaTipo , 
                                                            dataIdSexo        , 
                                                            dataIdEstado      , 
                                                            dataNombre        , 
                                                            dataDescripcion   ); 
                        lst.add(h);
                    }else{
                        System.out.println(esCMDColor.RED);
                        //esCMDProgress.showLoad();
                        System.out.println(data + esCMDColor.RESET);
                    }
                }    
            }
            return lst;
        } catch (Exception e) {
            throw new esAppException("Error leyendo el archivo de datos de hormigas: ", e, getClass(),"etlAntNest()");
        }
        
    }

    @Override
    public List<esAlimentoDTO> esEtlAntFood() throws esAppException {
        try {
            List<esAlimentoDTO> lst = new java.util.ArrayList<>();
            List<String> allLines = Files.readAllLines(Paths.get(esAppConfig.getANTFOOD()));
            Integer dataIdAlimentoTipo = null;
            String dataNombre = null;
            String dataDescripcion = null;
            int count = 0;
            for (String line : allLines) {
                for (String data : line.split("-")) {
                    data = data.trim();
                    dataIdAlimentoTipo = getIdAlimentoTipoByName(data);
                    if (dataIdAlimentoTipo > 0) {
                        count++;
                        dataNombre = data + count;
                        dataDescripcion = "Alimento de tipo " + data;
                        System.out.println(esCMDColor.BLUE);
                        // esCMDProgress.showLoad();
                        System.out.println(data + esCMDColor.RESET);
                        esAlimentoDTO a = new esAlimentoDTO(    dataIdAlimentoTipo,
                                                                dataNombre,
                                                                dataDescripcion);
                        lst.add(a);
                    } else {
                        System.out.println(esCMDColor.RED);
                        //esCMDProgress.showLoad();
                        System.out.println(data + esCMDColor.RESET);
                    }
                }
            }
            return lst;
        } catch (Exception e) {
            throw new esAppException("Error leyendo el archivo de datos de hormigas: ", e, getClass(), "etlAntNest()");
        }

    }

    private int getIdHormigaTipoByName(String name) throws esAppException {
        List<esHormigaTipoDTO> list = new esHormigaTipoDAO().readAll();
        for (esHormigaTipoDTO h : list) {
            if (h.getesNombre().equals(name)) {
                return h.getesIdHormigaTipo();
            }
        }
        return 0;
    }

    
     private int getIdAlimentoTipoByName(String name) throws esAppException {
        List<esAlimentoTipoDTO> list = new esAlimentoTipoDAO().readAll();
        for (esAlimentoTipoDTO h : list) {
            if (h.getesNombre().equals(name)) {
                return h.getesIdAlimentoTipo();
            }
        }
        return 0;
    }



    @Override
    public esHormiga esAlimentarAnt(esHormiga h, esAlimento a) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'esAlimentarAnt'");
    }



    @Override
    public esAlimento esPreparar(esAlimento alimento) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'esPreparar'");
    }

}
