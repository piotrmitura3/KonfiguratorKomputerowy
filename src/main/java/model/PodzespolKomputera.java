package model;

import lombok.*;

import java.math.BigDecimal;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class PodzespolKomputera {
    private Integer id;
    private String nazwa;
    private String opis;
    private BigDecimal cena;
}
