package manu_barone.ViaggiAziendali.entities;


import jakarta.persistence.*;
import lombok.*;
import manu_barone.ViaggiAziendali.entities.enums.StatoViaggio;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "viaggi")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Viaggio {

    @Id
    @GeneratedValue
    @Setter(AccessLevel.NONE)
    private UUID id;
    private String destinazione;
    private LocalDate data;

    @Enumerated(EnumType.STRING)
    private StatoViaggio statoViaggio;

    @OneToOne
    @JoinColumn(name="id_prenotazione")
    private Prenotazione prenotazione;

    public Viaggio(String destinazione, LocalDate data, StatoViaggio statoViaggio, Prenotazione p) {
        this.destinazione = destinazione;
        this.data = data;
        this.statoViaggio = statoViaggio;
        this.prenotazione = p;
    }
}
