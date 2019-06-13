package view;


import lombok.Getter;

import javax.swing.*;
import java.awt.*;


public class GlownaRamka extends JFrame {
    private JButton klienciButton;
    private JButton podzespolyButton;
    @Getter
    private JPanel przyciskiPanel;
    private ImageIcon obrazekIcon;
    private JLabel obrazekLabel;

    public GlownaRamka() throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        stworzRamke();
        setVisible(true);
        stworzActionListner();
    }

    private void stworzRamke() throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        //setContentPane(new PanelGlowny());
        klienciButton = new JButton("Klienci");
        podzespolyButton = new JButton("Podzespoly");
        przyciskiPanel = new JPanel();
        przyciskiPanel.setLayout(new BorderLayout());
        //add(klienciButton);
        //add(podzespolyButton);
        przyciskiPanel.add(klienciButton, BorderLayout.SOUTH);
        przyciskiPanel.add(podzespolyButton, BorderLayout.NORTH);

        obrazekLabel = new JLabel("");
        //setIconImage(new ImageIcon(getClass().getResource("images/komputer.jpg")).getImage());
//        ImageIcon imageIcon = new ImageIcon(GlownaRamka.class.getResource("D:\\KonfiguratorKomputerowy\\src\\main\\resources\\images\\komputer.jpg"));
//        obrazekLabel.setIcon(imageIcon);
//        przyciskiPanel.add(obrazekLabel, BorderLayout.CENTER);
        add(przyciskiPanel, BorderLayout.NORTH);
        setSize(650,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBackground(Color.CYAN);

//        obrazekIcon = new ImageIcon(getClass().getResource("komputer.jpg"));
//        obrazekLabel = new JLabel(obrazekIcon);
//        add(obrazekLabel);




    }

    private void stworzActionListner(){
        klienciButton.addActionListener(e -> {
            setContentPane(new PanelKlienci(this));
            pack();
        });

        podzespolyButton.addActionListener(e -> {
            setContentPane(new PanelPodzespolow());
            pack();
        });
    }
}
