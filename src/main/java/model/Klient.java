package model;

import lombok.*;

import javax.persistence.*;

@Entity
@Builder
public class Klient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String imie;
    private String nazwisko;
    @Embedded
    private Adres adres;

    public Klient() {
    }

    public Klient(Integer id, String imie, String nazwisko, Adres adres) {
        this.id = id;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adres = adres;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }

    @Override
    public String toString() {
        return "Klient{" +
                "id=" + id +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", adres=" + adres +
                '}';
    }
}
