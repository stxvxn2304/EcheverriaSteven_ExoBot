package esUserInterface.esForm;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.GridLayout;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.Container;

public class esMainForm extends JFrame {

    private JPanel esPnlMenu = new JPanel();
    private JPanel esPnlMain = new JPanel();

    private JButton esBtnHome = new JButton("Home");
    private JButton esBtnLogin = new JButton("Login");
    private JButton esBtnSexo = new JButton("Sexo");
    private JButton esBtnLocalidad = new JButton("Localidad");
    private JButton esBtnTest = new JButton("Test");

    public esMainForm(String esTitleApp) {
        customizeComponent(esTitleApp);
        configureMenu();
        configureActions();
    }

    private void configureMenu() {
        esPnlMenu.setLayout(new GridLayout(5, 1, 5, 5));
        esPnlMenu.setPreferredSize(new Dimension(200, 0));

        esPnlMenu.add(esBtnHome);
        esPnlMenu.add(esBtnLogin);
        esPnlMenu.add(esBtnSexo);
        esPnlMenu.add(esBtnLocalidad);
        esPnlMenu.add(esBtnTest);
    }

    private void configureActions() {
        esBtnHome.addActionListener(e -> esSetPanel(new JPanel()));
        esBtnLogin.addActionListener(e -> esSetPanel(new JPanel()));
        esBtnSexo.addActionListener(e -> esSetPanel(new JPanel()));
        esBtnLocalidad.addActionListener(e -> esSetPanel(new JPanel()));

        esBtnTest.addActionListener(e -> JOptionPane.showMessageDialog(
                this,
                "Mensaje de error",
                "Error",
                JOptionPane.ERROR_MESSAGE));
    }

    private void esSetPanel(JPanel esFormularioPanel) {
        Container container = getContentPane();
        container.remove(esPnlMain);
        esPnlMain = esFormularioPanel;
        container.add(esPnlMain, BorderLayout.CENTER);
        revalidate();
        repaint();
    }

    private void customizeComponent(String esTitleApp) {
        setTitle(esTitleApp);
        setSize(930, 800);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = getContentPane();
        container.setLayout(new BorderLayout());

        container.add(esPnlMenu, BorderLayout.WEST);
        container.add(esPnlMain, BorderLayout.CENTER);

        setVisible(true);
    }
}
