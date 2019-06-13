package kalkulator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KalkulatorTest {
    Kalkulator kalkulator = new Kalkulator();
    @Test
    public void suma_powinnaZwrocicSumeDwochLiczb(){
        //given
        int a = 2;
        int b = 6;
        String operacja = "s";
        int spodziewanyWynik = 8;
        //when
        int sumaZwracanaPrzezMetode = kalkulator.kalkulator(a, b, operacja);
        //then
        assertEquals(spodziewanyWynik, sumaZwracanaPrzezMetode);

    }
    @Test
    public void suma_coJesliNull(){
        //given
        Integer a = null;
        int b = 6;
        int spodziewanyWynik = 0;
        //when
        int sumaZwracanychLiczb = kalkulator.kalkulator(a, b, "d");
        //then
        assertEquals(spodziewanyWynik, sumaZwracanychLiczb);
    }

    @Test
    public void odejmowanie_powinnoZwrocicRozniceDwochCyfr(){
        //given
        int a = 7;
        int b = 4;
        String operator = "r";
        int spodziewanyWynik = 3;
        //when
        int roznicaZwracanychLiczb = kalkulator.kalkulator(a, b, operator);
        //then
        assertEquals(spodziewanyWynik, roznicaZwracanychLiczb);
    }

    @Test
    public void mnozenie_powinnoZwrocicIloczynDwochCyfr() {
        //given
        int a = 10;
        int b = 12;
        String operator = "m";
        int spodziewanyWynik = 120;
        //when
        int iloczynZwracanychCyfrPrzezMetode = kalkulator.kalkulator(a, b, operator);
        //then
        assertEquals(spodziewanyWynik, iloczynZwracanychCyfrPrzezMetode);
    }

    @Test
    public void dzielenie_powinnoZwrocicIlorazDwochCyfr(){
        //given
        int a = 46;
        int b = 5;
        String operator = "i";
        int spodziewanyWynik = 9;
        //when
        int ilorazZwracanychLiczbPrzezMetode = kalkulator.kalkulator(a, b, operator);
        //then
        assertEquals(spodziewanyWynik, ilorazZwracanychLiczbPrzezMetode);
    }



}