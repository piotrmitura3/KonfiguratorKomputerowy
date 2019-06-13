import dao.BazaKlientow;
import dao.BazaPodzespolow;
import dao.BazaZlozonychZestawow;
import model.Klient;
import model.PodzespolKomputera;
import model.ZestawKomputerowy;

public class Test {
    public static void main(String[] args) {
        BazaKlientow baza = new BazaKlientow();
        baza.getListaKlientow().forEach(klient -> System.out.println(klient.toString()));
        for (int i = 0; i < baza.getListaKlientow().size(); i++) {
            System.out.println(baza.getListaKlientow().get(i));
        }
        for (Klient klient : baza.getListaKlientow()) {
            System.out.println(klient.toString());
        }
        BazaPodzespolow podzepoly = new BazaPodzespolow();
        for (PodzespolKomputera podzespoly : podzepoly.getListaPodzespolow()){
            System.out.println(podzespoly.toString());
        }

        BazaZlozonychZestawow zestawy = new BazaZlozonychZestawow();
        for (ZestawKomputerowy zestaw: zestawy.getListaZestawow()) {
            System.out.println(zestawy.toString());
        }
    }
}
