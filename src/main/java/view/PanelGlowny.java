package view;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class PanelGlowny extends JPanel {
    private JPanel glownyPanel;
    private JButton klienciButton;
    private JLabel klienciLabel;

    public PanelGlowny() {
        stworzKomponenty();
        stworzActionListner();

    }

    private void stworzKomponenty() {

        setLayout(new FlowLayout());
        klienciButton = new JButton("Klienci");
        add(klienciButton);
        klienciLabel = new JLabel("Wybierz klienta:");
        add(klienciLabel);



    }


    private void stworzActionListner(){
        klienciButton.addActionListener(e -> {
            //setContentPane(new PanelKlienci());
            //pack();
        });
    }


}
