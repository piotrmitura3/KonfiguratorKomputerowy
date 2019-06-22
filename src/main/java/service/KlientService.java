package service;

import dao.BazaKlientow;
import dao.KlienciJpa;
import model.Adres;
import model.Klient;

import java.util.List;

public class KlientService {

    private BazaKlientow bazaKlientow = new BazaKlientow();
    private KlienciJpa klienciJpa = new KlienciJpa();


    public KlientService() {
    }

    public void dodajKlienta(String imie, String nazwisko, String miasto, String ulica, int nrLokalu, String kodPocztowy){
        Adres nowyAdres = new Adres();
        nowyAdres.setMiasto(miasto);
        nowyAdres.setUlica(ulica);
        nowyAdres.setNrLokalu(nrLokalu);
        nowyAdres.setKodPocztowy(kodPocztowy);
        Klient nowyKlient = new Klient();
        nowyKlient.setImie(imie);
        nowyKlient.setNazwisko(nazwisko);
        nowyKlient.setAdres(nowyAdres);
        klienciJpa.dodajKlienta(nowyKlient);
        System.out.println("Dodano nowego klienta: " + nowyKlient.toString());
    }

    public void usunKlienta(Klient klientDoUsuniecia){
        //Klient klientDoUsuniecia = BazaKlientow.listaKlientow.stream()
        //.filter(klient -> klient.getImie().equals(imie) && klient.getNazwisko().equals(nazwisko)).findAny().get();
        bazaKlientow.usunKlienta(klientDoUsuniecia);
    }

    public void modyfikujKlienta(Integer id, String imie, String nazwisko){
        Klient modyfikacja = bazaKlientow.getListaKlientow().stream().filter(klient -> klient.getId().equals(id)).findAny().get();
        modyfikacja.setImie(imie);
        modyfikacja.setNazwisko(nazwisko);
        bazaKlientow.dodajKlienta(modyfikacja);
    }

    public List<Klient> pobierzKlientow(){
        return bazaKlientow.getListaKlientow();

    }
}
