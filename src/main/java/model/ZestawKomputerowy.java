package model;
import dao.BazaPodzespolow;
import lombok.*;
import model.Klient;
import model.PodzespolKomputera;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class ZestawKomputerowy {
    private Integer id;
    private String nazwa;
    private String opis;
    private BigDecimal cena;
    private Klient klient;
    private List<PodzespolKomputera> listaPodzespolow = new ArrayList<>();
}