package esApp.esDesktopApp.esForms;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

import esApp.esDesktopApp.esCustomControl.PatButton;
import esInfrastructure.esAppMSG;

public class esAppStart extends JFrame {
    esAppMenu   pnlMenu = new esAppMenu();
    JPanel    pnlMain = new esPHome();

    public esAppStart(String tilteApp) {
        initComponents(tilteApp);
 
        PatButton btnHome   = new PatButton("🐜 Home");
        PatButton btnSexo   = new PatButton("🐜 Sexo");
        PatButton btnHormiga= new PatButton("🐜 Tipo de Hormiga");
        PatButton btnTest   = new PatButton("🐜 validar");

        btnHome   .addActionListener(e -> setPanel(new esPHome()));
        btnSexo   .addActionListener(e -> setPanel(new esPSexo()));
        btnHormiga.addActionListener(e -> setPanel(new esPHome()));
        btnTest   .addActionListener(e -> esAppMSG.showError("mensaje de error"));

        pnlMenu.addMenuItem(btnHome   );
        pnlMenu.addMenuItem(btnSexo   );    
        pnlMenu.addMenuItem(btnHormiga);
        pnlMenu.addMenuItem(btnTest   );

    }

    private void setPanel(JPanel formularioPanel) {
        Container container = getContentPane();
        container.remove(pnlMain);
        pnlMain = formularioPanel;
        container.add(pnlMain, BorderLayout.CENTER);
        revalidate();
        repaint();
    }

    private void initComponents(String tilteApp) {
        setTitle(tilteApp);
        setSize(930, 600);
        setResizable(false);
        setLocationRelativeTo(null); // Centrar en la pantalla
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // Crear un contenedor para los dos paneles usando BorderLayout
        Container container = getContentPane();
        container.setLayout(new BorderLayout());

        // Agregar los paneles al contenedor
        container.add(pnlMenu, BorderLayout.WEST);
        container.add(pnlMain, BorderLayout.CENTER);
        setVisible(true);
    }
}