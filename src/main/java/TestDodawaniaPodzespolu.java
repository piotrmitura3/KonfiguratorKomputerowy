import model.PodzespolKomputera;
import service.PodzespolKomputeraService;

import java.math.BigDecimal;

public class TestDodawaniaPodzespolu {
    public static void main(String[] args) {
        PodzespolKomputeraService podzespolKomputeraService = new PodzespolKomputeraService();
        podzespolKomputeraService.dodajPodzespol("RAM 8GB", "DDR3", new BigDecimal(250));

        for (PodzespolKomputera podzespolKomputera : podzespolKomputeraService.pobierzPodzespoly()){
            System.out.println(podzespolKomputera.toString());
        }
    }
}
