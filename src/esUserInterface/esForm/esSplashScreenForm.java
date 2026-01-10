package esUserInterface.esForm;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.SwingUtilities;

import esUserInterface.esIAStyle;

public abstract class esSplashScreenForm {
    private static JFrame esFrmSplash;
    private static JProgressBar esPrbLoading;
    private static ImageIcon esIcoImagen;
    private static JLabel esLblSplash;

    public static void esShow() {
        esIcoImagen = new ImageIcon(esIAStyle.URL_SPLASH);
        esLblSplash = new JLabel(esIcoImagen);
        esPrbLoading = new JProgressBar(0, 100);

        esPrbLoading.setStringPainted(true);

        esFrmSplash = new JFrame();
        esFrmSplash.setUndecorated(true);
        esFrmSplash.getContentPane().add(esLblSplash, BorderLayout.CENTER);
        esFrmSplash.add(esPrbLoading, BorderLayout.SOUTH);
        System.out.println(
                esIcoImagen.getIconWidth() + " x " + esIcoImagen.getIconHeight());

        esFrmSplash.setSize(esIcoImagen.getIconWidth(), esIcoImagen.getIconHeight());
        esFrmSplash.setLocationRelativeTo(null);

        esFrmSplash.setVisible(true);
        new Thread(() -> {
        for (int i = 0; i <= 100; i++) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            esPrbLoading.setValue(i);
        }
        esFrmSplash.setVisible(false);
        }).start();
    }
}    
        