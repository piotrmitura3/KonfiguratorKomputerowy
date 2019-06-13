package service;

import dao.BazaPodzespolow;
import model.PodzespolKomputera;

import java.math.BigDecimal;
import java.util.List;

public class PodzespolKomputeraService {
    private BazaPodzespolow bazaPodzespolow = new BazaPodzespolow();

    public PodzespolKomputeraService() {
    }

    public void dodajPodzespol(String nazwa, String opis, BigDecimal cena){
        PodzespolKomputera nowyPodzespol = new PodzespolKomputera();
        nowyPodzespol.setNazwa(nazwa);
        nowyPodzespol.setOpis(opis);
        nowyPodzespol.setCena(cena);
        bazaPodzespolow.dodajPodzespol(nowyPodzespol);
        System.out.println("Dodano nowy podzespol" + nowyPodzespol.toString());
    }

    public void usunPodzespol(Integer id){
        PodzespolKomputera podzespolDoUsuniecia = BazaPodzespolow.listaPodzespolow.stream()
                .filter(podzespolKomputera -> podzespolKomputera.getId().equals(id)).findAny().get();
        bazaPodzespolow.usunPodzespol(podzespolDoUsuniecia);
    }

    public List<PodzespolKomputera> pobierzPodzespoly(){
        return  bazaPodzespolow.getListaPodzespolow();
    }
}
