package model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
@NoArgsConstructor
public class Klient {

    private Integer id;
    private String imie;
    private String nazwisko;
    private Adres adres;

}
