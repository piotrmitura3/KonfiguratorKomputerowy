package model;

import lombok.*;

import javax.persistence.Embeddable;

@Builder
@Embeddable
public class Adres {
    private String miasto;
    private String ulica;
    private Integer nrLokalu;
    private String kodPocztowy;

    public Adres() {
    }

    public Adres(String miasto, String ulica, Integer nrLokalu, String kodPocztowy) {
        this.miasto = miasto;
        this.ulica = ulica;
        this.nrLokalu = nrLokalu;
        this.kodPocztowy = kodPocztowy;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public Integer getNrLokalu() {
        return nrLokalu;
    }

    public void setNrLokalu(Integer nrLokalu) {
        this.nrLokalu = nrLokalu;
    }

    public String getKodPocztowy() {
        return kodPocztowy;
    }

    public void setKodPocztowy(String kodPocztowy) {
        this.kodPocztowy = kodPocztowy;
    }

    @Override
    public String toString() {
        return "Adres{" +
                "miasto='" + miasto + '\'' +
                ", ulica='" + ulica + '\'' +
                ", nrLokalu=" + nrLokalu +
                ", kodPocztowy='" + kodPocztowy + '\'' +
                '}';
    }
}


