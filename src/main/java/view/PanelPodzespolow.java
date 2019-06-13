package view;

import model.PodzespolKomputera;
import service.PodzespolKomputeraService;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.util.List;

public class PanelPodzespolow extends JPanel {

    private JLabel nazwaLabel;
    private JTextField nazwaTextField;
    private JLabel opisLabel;
    private JTextField opisTextField;
    private JLabel cenaLabel;
    private JTextField cenaTextField;
    private JButton powrotButton;
    private JButton dodajPodzespolButton;
    private PodzespolKomputeraService podzespolKomputeraService = new PodzespolKomputeraService();
    private JTable podzespolyTable;
    private DefaultTableModel podzespolyModel;
    private JScrollPane podzespolyScrollPane;
    private JButton usunPodzespolButton;

    public PanelPodzespolow() {
        setLayout(new FlowLayout());
        stworzKomponenty();
        stworzActionListner();
    }

    private void stworzKomponenty() {
        setLayout(new FlowLayout());
        nazwaLabel = new JLabel("nazwa:");
        nazwaTextField = new JTextField(12);
        opisLabel = new JLabel("opis:");
        opisTextField = new JTextField(12);
        cenaLabel = new JLabel("cena:");
        cenaTextField = new JTextField(12);
        powrotButton = new JButton("Powrót");
        dodajPodzespolButton = new JButton("Dodaj podzespół");
        podzespolyScrollPane = new JScrollPane();
        usunPodzespolButton = new JButton("Usun");

        String[] nazwaKolumn = {"Nazwa", "Opis", "Cena"};
        podzespolyModel = new DefaultTableModel(nazwaKolumn, 0);
        List<PodzespolKomputera> podzespolKomputeraList = podzespolKomputeraService.pobierzPodzespoly();
        for (PodzespolKomputera podzespolKomputera : podzespolKomputeraList) {
            String nazwa = podzespolKomputera.getNazwa();
            String opis = podzespolKomputera.getOpis();
            BigDecimal cena = podzespolKomputera.getCena();
            Object[] objects = {nazwa, opis, cena};
            podzespolyModel.addRow(objects);
        }
        podzespolyTable = new JTable(podzespolyModel);
        podzespolyTable.setFont(new Font(Font.DIALOG, Font.PLAIN, 12));
        podzespolyTable.setPreferredScrollableViewportSize(new Dimension(400,350));
        JScrollPane scrollPane = new JScrollPane(podzespolyTable);


        this.add(nazwaLabel);
        this.add(nazwaTextField);
        this.add(opisLabel);
        this.add(opisTextField);
        this.add(cenaLabel);
        this.add(cenaTextField);
        this.add(powrotButton);
        this.add(dodajPodzespolButton);
        this.add(usunPodzespolButton);
        this.add(scrollPane);
    }

    private void stworzActionListner() {
        powrotButton.addActionListener(e -> {
            JComponent jComponent = (JComponent) e.getSource();
            Window window = SwingUtilities.getWindowAncestor(jComponent);
            window.dispose();
            backToMyFrame();
        });

        dodajPodzespolButton.addActionListener(e -> {
            podzespolKomputeraService.dodajPodzespol(nazwaTextField.getText(), opisTextField.getText(),
                    new BigDecimal(cenaTextField.getText()));
        });

        usunPodzespolButton.addActionListener(e -> {
            usunWybraneWiersze();
        });


    }

    private void usunWybraneWiersze(){
        podzespolyTable.editingStopped(null);
        while (podzespolyTable.getSelectedRow() > 0) {
            podzespolyModel.removeRow(podzespolyTable.getSelectedRow());
        }
    }

    private void backToMyFrame() {
        try {
            GlownaRamka mainFrame = new GlownaRamka();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e1) {
            e1.printStackTrace();
        }
    }
}


