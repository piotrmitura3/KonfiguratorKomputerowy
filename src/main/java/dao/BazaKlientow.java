package dao;

import model.Adres;
import model.Klient;

import java.util.ArrayList;
import java.util.List;

public class BazaKlientow {
    private List<Klient> listaKlientow = new ArrayList<>();

    public List<Klient> getListaKlientow() {
        return listaKlientow;
    }

    public BazaKlientow() {

        Klient klient1 = Klient.builder()
                .id(1)
                .imie("Piotrek")
                .nazwisko("Mitura")
                .adres(Adres.builder()
                    .miasto("Lublin")
                    .ulica("Koncertowa")
                    .nrLokalu(12)
                    .kodPocztowy("20-450")
                    .build())
                .build();

        Klient klient2 = Klient.builder()
                .id(2).imie("Michał")
                .nazwisko("Kowalski")
                .adres(Adres.builder()
                        .miasto("Warszawa")
                        .ulica("Elsnera")
                        .nrLokalu(24)
                        .kodPocztowy("00-020")
                        .build())
                .build();

        Klient klient3 = Klient.builder()
                .id(3)
                .imie("Paweł")
                .nazwisko("Kowal")
                .adres(Adres.builder()
                        .miasto("Kraków")
                        .ulica("Elsnera")
                        .nrLokalu(75)
                        .kodPocztowy("21-040")
                        .build())
                .build();

        listaKlientow.add(klient1);
        listaKlientow.add(klient2);
        listaKlientow.add(klient3);
    }

    public void dodajKlienta(Klient nowyKlient) {
        listaKlientow.add(nowyKlient);
    }

    public void usunKlienta(Klient usunietyKlient) {
        listaKlientow.remove(usunietyKlient);
    }


}