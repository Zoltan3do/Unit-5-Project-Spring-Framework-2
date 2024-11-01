package manu_barone.ViaggiAziendali.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "prenotazioni")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Prenotazione {
    @Id
    @GeneratedValue
    @Setter(AccessLevel.NONE)
    private UUID id;

    @OneToOne
    @JoinColumn(name="id_viaggio")
    private Viaggio viaggio;

    @OneToOne
    @JoinColumn(name="id_dipendente")
    private Dipendente dipendenten;

    private LocalDate dataRichiesta;
    private String note = "";

    public Prenotazione(Viaggio viaggio, Dipendente dipendenten, LocalDate dataRichiesta, String note) {
        this.viaggio = viaggio;
        this.dipendenten = dipendenten;
        this.dataRichiesta = dataRichiesta;
        this.note = note;
    }

    public Prenotazione(Viaggio viaggio, Dipendente dipendenten, LocalDate dataRichiesta) {
        this.viaggio = viaggio;
        this.dipendenten = dipendenten;
        this.dataRichiesta = dataRichiesta;
    }
}
