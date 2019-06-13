import model.Klient;
import service.KlientService;

public class TestDodawaniaKlienta {
    public static void main(String[] args) {
        KlientService klientService = new KlientService();

        klientService.dodajKlienta("Piotr", "Kowalski", "Lublin", "Radzyńska", 45,"20-645");

        for (Klient klient : klientService.pobierzKlientow()) {
            System.out.println(klient.toString());
        }
    }
}
