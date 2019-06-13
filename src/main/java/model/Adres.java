package model;

import lombok.*;

@Builder
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Adres {
    private String miasto;
    private String ulica;
    private Integer nrLokalu;
    private String kodPocztowy;

}


