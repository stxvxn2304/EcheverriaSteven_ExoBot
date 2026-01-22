package esApp.esConsoleApp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import esBusinessLogic.esFactoryBL;
import esBusinessLogic.esEntities.esAlimentoTipoBL;
import esBusinessLogic.esEntities.esCoordenadaUK;
import esBusinessLogic.esEntities.esEntomologoGenestita;
import esDataAccess.esDAOs.esEntomologoDAO;
import esDataAccess.esDAOs.esHormigaDAO;
import esDataAccess.esDTOs.esEntomologoDTO;
import esDataAccess.esDTOs.esHormigaDTO;
import esInfrastructure.esAppException;
import esInfrastructure.esTools.esCMDColor;
import esInfrastructure.esTools.esCMDProgress;

public class esSistemaRuso {
    esFactoryBL<esHormigaDTO> antFactoryBl = new esFactoryBL<>(esHormigaDAO.class);

    public void testAlimentoTipoDAO() {
        try {
            esAlimentoTipoBL bl = new esAlimentoTipoBL();
            var atDTO = bl.atDAO.check("Omnívoro");
            System.out.println( atDTO.toString() );
        } catch (esAppException e) {
            System.out.println( "Error leyendo alimento tipo: " + e.getMessage() );
        }
    }
    public void crudEntomologo() {
        esFactoryBL<esEntomologoDTO> bl = new esFactoryBL<>(esEntomologoDAO.class);

        try {
            esEntomologoDTO eDTO = new esEntomologoDTO();
            eDTO.setUsuario("patmic");
            eDTO.setClave("1234"); 
            bl.add(eDTO);
            eDTO = new esEntomologoDTO("Sebastian"    , "4321");
            bl.add(eDTO);
            for (var eE : bl.getAll()) {
                System.out.println( eE.toString() );
            }

        } catch (Exception e) {
            System.out.println( "Error leyendo entomologo: " + e.getMessage() );
        }

    }
    public boolean autenticarEntomolgo(esEntomologoGenestita entomologo) throws esAppException{
        int countTry = 0;
        while ( countTry++ < 3 ) {
            System.out.println("ingrese usuario:");
            String u = System.console().readLine();
            System.out.println("ingrese contraseña:");
            String p = System.console().readLine();

            if (entomologo.checkLogin(u, p)) 
                return true;
        }
        return false;
    }

    public void start(esEntomologoGenestita entomologo) {
        System.out.println(esCMDColor.BLUE + "Sistema Ruso iniciado...." + esCMDProgress.showSpinner() + esCMDColor.RESET);
        try {
            if (autenticarEntomolgo(entomologo)) {
                System.out.println(esCMDColor.GREEN + "¡Acceso concedido!" + esCMDColor.RESET);
                saveHormigas(entomologo);
            } else {
                System.out.println(esCMDColor.RED + "Acceso denegado. Saliendo del sistema." + esCMDColor.RESET);
                System.exit(0);
            }
        } catch (esAppException e) {
            System.out.println(esCMDColor.RED + "Error durante la autenticación: " + e.getMessage() + esCMDColor.RESET);
        }
    }
    // public void showEstado() {
    //     FactoryBL<EstadoDTO> bl = new FactoryBL<>(EstadoDAO.class);
    //     try {
    //         for ( EstadoDTO eDTO : bl.getAll() ) {
    //             System.out.println( eDTO.toString() );
    //         }
    //     } catch (Exception e) {
    //         System.out.println( "Error leyendo estados: " + e.getMessage() );
    //     }

    // }
    

    public void saveHormigas(esEntomologoGenestita entomologo) {
        try {
            List<esHormigaDTO> lstHormigas = entomologo.etlAntNest(); // cosecha hormigas
            for ( esHormigaDTO hDTO : lstHormigas ) {
                antFactoryBl.add(hDTO);
                System.out.println( "Hormiga guardada: " + hDTO.toString() );
            }
        } catch (Exception e) {
            System.out.println( "Error al guardar la hormiga: " + e.getMessage() );
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
