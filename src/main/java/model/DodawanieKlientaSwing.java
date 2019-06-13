package model;

import service.KlientService;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class DodawanieKlientaSwing extends JFrame {
    private JLabel labelKlient;
    private JLabel labelImie;
    private JTextField fieldImie;
    private JLabel labelNazwisko;
    private JTextField fieldNazwisko;
    private JButton buttonDodajKlienta;
    private KlientService klientService = new KlientService();

    public DodawanieKlientaSwing(){
        super("Dodawanie klienta");

        ustawianieKomponenty();
        setSize(240, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void ustawianieKomponenty() {
        labelKlient = new JLabel("Dodawanie klienta");
        labelImie = new JLabel("Podaj imie: ");
        fieldImie = new JTextField(12);
        labelNazwisko = new JLabel("Podaj Nazwisko");
        fieldNazwisko = new JTextField(12);
        buttonDodajKlienta = new JButton("Dodaj Klienta!");

        setLayout(new FlowLayout());

        add(labelKlient);
        add(labelImie);
        add(fieldImie);
        add(labelNazwisko);
        add(fieldNazwisko);
        add(buttonDodajKlienta);

    }

    public void actionPerformed(ActionEvent e) {
        //klientService.dodajKlienta(fieldImie.getText(), fieldNazwisko.getText());
    }

}
