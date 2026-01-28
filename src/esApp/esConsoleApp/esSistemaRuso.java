package esApp.esConsoleApp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import esBusinessComponent.esFactoryBL;
import esBusinessComponent.esEntities.esCoordenadaUK;
import esBusinessComponent.esEntities.esEntomologoGenestita;
import esDataAccessComponent.esDAOs.esAlimentoDAO;
import esDataAccessComponent.esDAOs.esEntomologoDAO;
import esDataAccessComponent.esDAOs.esHormigaDAO;
import esDataAccessComponent.esDTOs.esAlimentoDTO;
import esDataAccessComponent.esDTOs.esEntomologoDTO;
import esDataAccessComponent.esDTOs.esHormigaDTO;

public class esSistemaRuso {
    esFactoryBL<esHormigaDTO> antFactoryBl = new esFactoryBL<>(esHormigaDAO.class);
    esFactoryBL<esAlimentoDTO> foodFactoryBl = new esFactoryBL<>(esAlimentoDAO.class);
    
    public void crudEntomologo() {
        esFactoryBL<esEntomologoDTO> bl = new esFactoryBL<>(esEntomologoDAO.class);

        try {
            esEntomologoDTO eDTO = new esEntomologoDTO();
            eDTO.setesUsuario("patmic");
            eDTO.setesClave("1234"); 
            bl.add(eDTO);
            eDTO = new esEntomologoDTO("stxvxn", "2306");
            bl.add(eDTO);

        } catch (Exception e) {
            System.out.println( "Error leyendo entomologo: " + e.getMessage() );
        }

    }



    public void saveHormigas(esEntomologoGenestita entomologo) {
        try {
            List<esHormigaDTO> lstHormigas = entomologo.esEtlAntNest(); 
            for ( esHormigaDTO hDTO : lstHormigas ) {
                antFactoryBl.add(hDTO);
                System.out.println( "Hormiga guardada: " + hDTO.toString() );
            }
        } catch (Exception e) {
            System.out.println( "Error al guardar la hormiga: " + e.getMessage() );
        }
    }

    public void saveAlimento(esEntomologoGenestita entomologo) {
        try {
            List<esAlimentoDTO> lstAlimento = entomologo.esEtlAntFood();
            for (esAlimentoDTO hDTO : lstAlimento) {
                foodFactoryBl.add(hDTO);
                System.out.println("Alimento guardada: " + hDTO.toString());
            }
        } catch (Exception e) {
            System.out.println("Error al guardar el alimento: " + e.getMessage());
        }
    }


    public List<esCoordenadaUK> readCoord(String fileNamePath) throws IOException {
        List<esCoordenadaUK> lstCoord = new java.util.ArrayList<>();
        List<String> allLines = Files.readAllLines(Paths.get(fileNamePath));
        for (String line : allLines) {
            System.out.println(line);
            String[] coord = line.split(",");
            esCoordenadaUK coordenada = new esCoordenadaUK( coord[0], coord[6], false);
            lstCoord.add(coordenada);
            //System.out.println( coordenada.toString() );
        }
        return lstCoord;
    }
}
