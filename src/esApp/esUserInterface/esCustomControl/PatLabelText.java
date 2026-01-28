package esApp.esUserInterface.esCustomControl;

import javax.swing.*;

import esInfrastructureComponent.esAppStyle;

import java.awt.*;

public class PatLabelText extends JPanel{
    private PatLabel    lblEtiqueta = new PatLabel();
    private PatTextBox  txtContenido= new PatTextBox();

    public PatLabelText(String etiqueta) {
        setLayout(new BorderLayout());

        lblEtiqueta.setCustomizeComponent(  etiqueta, 
                                            esAppStyle.FONT_SMALL, 
                                            esAppStyle.COLOR_FONT_LIGHT, 
                                            esAppStyle.ALIGNMENT_LEFT); 
        add(lblEtiqueta, BorderLayout.NORTH);
        add(txtContenido, BorderLayout.CENTER);
    }
}
