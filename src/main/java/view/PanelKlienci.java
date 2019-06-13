package view;

import dao.BazaKlientow;
import model.Klient;
import service.KlientService;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

public class PanelKlienci extends JPanel {
    private JLabel imieLabel;
    private JTextField imieTextField;
    private JLabel nazwiskoLabel;
    private JTextField nazwiskoTextField;
    private JLabel miastoLabel;
    private JTextField miastoTextField;
    private JLabel ulicaLabel;
    private JTextField ulicaTextField;
    private JLabel nrLokaluLabel;
    private JTextField nrLokaluTextField;
    private JLabel kodPocztowyLabel;
    private JTextField kodPocztowyTextField;
    private JButton powrotButton;
    private JButton dodajKlientaButton;
    private KlientService klientService = new KlientService();
    private JTable klienciTable;
    private DefaultTableModel klienciModel;
    private JScrollPane scrollPane;
    private JButton usunKlientaButton;
    private JButton odswiezButton;
    private GlownaRamka glownaRamka;

    public PanelKlienci(GlownaRamka glownaRamka) {
        this.glownaRamka = glownaRamka;
        setLayout(new FlowLayout());
        stworzKomponenty();
        stworzActionListner();
    }

    private void stworzKomponenty() {
        imieLabel = new JLabel("Podaj imię:");
        imieTextField = new JTextField(12);
        nazwiskoLabel = new JLabel("Podaj nazwisko:");
        nazwiskoTextField = new JTextField(12);
        miastoLabel = new JLabel("Podaj miasto:");
        miastoTextField = new JTextField(12);
        ulicaLabel = new JLabel("Podaj ulice:");
        ulicaTextField = new JTextField(12);
        nrLokaluLabel = new JLabel("Podaj nr lokalu:");
        nrLokaluTextField = new JTextField(12);
        kodPocztowyLabel = new JLabel("Podaj kod pocztowy:");
        kodPocztowyTextField = new JTextField(12);
        powrotButton = new JButton("Powrót");
        dodajKlientaButton = new JButton("klienta");
        scrollPane = new JScrollPane();
        usunKlientaButton = new JButton("Usun");
        odswiezButton = new JButton("Odswiez");
        tworzenieTabeliKlientow();

//        ImageIcon imageIcon = new ImageIcon(GlownaRamka.class.getResource("images/komputer.jpg"));
//        JLabel obrazek = new JLabel("");
//        obrazek.setIcon(imageIcon);


//        DefaultTableModel model = new DefaultTableModel(
//                new String [] {
//                        "Imie", "Nazwisko", "Miasto", "Ulica", "nr Lokalu", "Kod pocztowy"
//                }, 0
//        );

//        klienciTable.setModel(model);
//        for(Klient klient : klientService.pobierzKlientow()){
//            model.addRow(
//                    new Object[]{
//                            klient.getImie(), klient.getNazwisko(), klient.getAdres().getMiasto(), klient.getAdres().getUlica(),
//                            klient.getAdres().getNrLokalu(), klient.getAdres().getKodPocztowy()
//                    }
//            );
//        }

        //scrollPane = tworzenieTabeliKlientow();


        this.add(imieLabel);
        this.add(imieTextField);
        this.add(nazwiskoLabel);
        this.add(nazwiskoTextField);
        this.add(miastoLabel);
        this.add(miastoTextField);
        this.add(ulicaLabel);
        this.add(ulicaTextField);
        this.add(nrLokaluLabel);
        this.add(nrLokaluTextField);
        this.add(kodPocztowyLabel);
        this.add(kodPocztowyTextField);
        this.add(powrotButton);
        this.add(dodajKlientaButton);
        this.add(usunKlientaButton);
        this.add(odswiezButton);
        this.add(tworzenieTabeliKlientow());
        //this.add(obrazek);
    }

    private JScrollPane tworzenieTabeliKlientow() {
        String[] nazwaKolumn = {"Imie", "Nazwisko", "Miasto", "Ulica", "nr Lokalu", "Kod pocztowy"};
        klienciModel = new DefaultTableModel(nazwaKolumn, 0);
        List<Klient> klients = klientService.pobierzKlientow();
        for (Klient klient : klients) {
            String imie = klient.getImie();
            String nazwisko = klient.getNazwisko();
            String miasto = klient.getAdres().getMiasto();
            String ulica = klient.getAdres().getUlica();
            int nrLokalu = klient.getAdres().getNrLokalu();
            String kodPocztowy = klient.getAdres().getKodPocztowy();
            Object[] objects = {imie, nazwisko, miasto, ulica, nrLokalu, kodPocztowy};
            klienciModel.addRow(objects);
        }
        klienciTable = new JTable(klienciModel);
        klienciTable.setFont(new Font(Font.DIALOG, Font.PLAIN, 12));
        klienciTable.setPreferredScrollableViewportSize(new Dimension(400, 350));
        return new JScrollPane(klienciTable);
    }

//    private void tworzenieTabeliKlientow() {
//        String[] nazwaKolumn = { "Imie", "Nazwisko" };
//        klienciModel = new DefaultTableModel(nazwaKolumn, 0);
//        List<Klient> klients = klientService.pobierzKlientow();
//        for (Klient klient : klients) {
//            String imie = klient.getImie();
//            String nazwisko = klient.getNazwisko();
//            Object[] objects = {imie, nazwisko};
//            klienciModel.addRow(objects);
//        }
//        klienciTable = new JTable(klienciModel);
//        klienciTable.setFont(new Font(Font.DIALOG, Font.PLAIN, 12));
//        klienciTable.setPreferredScrollableViewportSize(new Dimension(400, 350));
//        JScrollPane scrollPane = new JScrollPane(klienciTable);
//    }




    private void stworzActionListner(){
        powrotButton.addActionListener(e -> {
//            JComponent jComponent = (JComponent) e.getSource();
//            Window window = SwingUtilities.getWindowAncestor(jComponent);
//            window.dispose();
//            backToMyFrame();
            glownaRamka.setContentPane(glownaRamka.getPrzyciskiPanel());
            glownaRamka.pack();
        });

        dodajKlientaButton.addActionListener(e -> {
            dodajKlientaNaPodstawiePol();
        });

        usunKlientaButton.addActionListener(e -> {
            usunWybraneWiersze();
        });

        odswiezButton.addActionListener(e -> {
            repaint();
        });

    }

    private void usunWybraneWiersze() {
//        while (klienciTable.getSelectedRowCount() > 0) {
//            klienciModel.removeRow(klienciTable.getSelectedRow());
//            klientService.usunKlienta(klienciModel.removeRow(klienciTable.getSelectedRow()));
//        }
        Klient klient = klientService.pobierzKlientow().get(klienciTable.convertRowIndexToModel(klienciTable.getSelectedRow()));
        klientService.usunKlienta(klient);
        klienciModel.removeRow(klienciTable.getSelectedRow());
        System.out.println(klient);
    }

    private void dodajKlientaNaPodstawiePol() {
        klientService.dodajKlienta(imieTextField.getText(), nazwiskoTextField.getText(),miastoTextField.getText(),
                ulicaTextField.getText(), Integer.parseInt(nrLokaluTextField.getText()), kodPocztowyTextField.getText());
        tworzenieTabeliKlientow();
    }


    private void backToMyFrame() {
        try {
            GlownaRamka mainFrame = new GlownaRamka();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e1) {
            e1.printStackTrace();
        }
    }

}
