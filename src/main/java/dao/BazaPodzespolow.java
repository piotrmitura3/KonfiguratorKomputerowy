package dao;

import model.PodzespolKomputera;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BazaPodzespolow {
    public static List<PodzespolKomputera> listaPodzespolow = new ArrayList<>();

    public List<PodzespolKomputera> getListaPodzespolow() {
        return listaPodzespolow;
    }

    public BazaPodzespolow() {
        PodzespolKomputera ram = PodzespolKomputera.builder()
                .id(1)
                .nazwa("RAM 8GB")
                .opis("DDR4")
                .cena(new BigDecimal(250))
                .build();

        PodzespolKomputera procesor = PodzespolKomputera.builder()
                .id(2)
                .nazwa("Intel i7")
                .opis("Intel Core i7-9700K")
                .cena(new BigDecimal(1600))
                .build();


        PodzespolKomputera dyskTwardy = PodzespolKomputera.builder()
                .id(3)
                .nazwa("Dysk twardy SSD")
                .opis("256 GB")
                .cena(new BigDecimal(200))
                .build();

        listaPodzespolow.add(ram);
        listaPodzespolow.add(procesor);
        listaPodzespolow.add(dyskTwardy);
    }

    public void dodajPodzespol(PodzespolKomputera nowyPodzespol) {
        listaPodzespolow.add(nowyPodzespol);
    }


    public void usunPodzespol(PodzespolKomputera usunietyPodzespol) {
        listaPodzespolow.remove(usunietyPodzespol);
    }
}