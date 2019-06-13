package dao;

import model.Adres;
import model.Klient;
import model.PodzespolKomputera;
import model.ZestawKomputerowy;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class BazaZlozonychZestawow {

    public static List<ZestawKomputerowy> listaZestawow = new ArrayList<>();

    public List<ZestawKomputerowy> getListaZestawow() {
        return listaZestawow;
    }

    public BazaZlozonychZestawow(){
        PodzespolKomputera podzespolKomputera1 = BazaPodzespolow.listaPodzespolow.stream()
                .filter(podzespolKomputera -> podzespolKomputera.getNazwa().equals("ram")).findAny().get();

        ZestawKomputerowy zestawKomputerowy1 = ZestawKomputerowy.builder()
                .id(1)
                .nazwa("Tani zestaw")
                .opis("Do grania na niskich wymaganiach")
                .cena(new BigDecimal(2000))
                    .klient(Klient.builder().imie("Mateusz").nazwisko("Cola").adres(Adres.builder()
                            .miasto("Wrocław").ulica("Radzynska").nrLokalu(45).kodPocztowy("32-456").build()).build())
                        .listaPodzespolow(List.of(podzespolKomputera1, PodzespolKomputera.builder()
                            .id(3)
                            .nazwa("Mikrofon")
                            .opis("Rode")
                            .cena(new BigDecimal(450))
                            .build()))

                .build();

        listaZestawow.add(zestawKomputerowy1);

    }
}
