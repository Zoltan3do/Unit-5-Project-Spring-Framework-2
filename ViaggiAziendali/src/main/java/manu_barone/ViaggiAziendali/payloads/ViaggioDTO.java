package manu_barone.ViaggiAziendali.payloads;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import manu_barone.ViaggiAziendali.entities.enums.StatoViaggio;

import java.time.LocalDate;
import java.util.UUID;

public record ViaggioDTO(
        @NotEmpty
        String destinazione,

        @NotNull
        LocalDate data,

        @NotEmpty
        @Pattern(regexp = "^(IN_PROGRAMMA|COMPLETATO)$")
        StatoViaggio sv,

        @NotNull
        @Pattern(regexp = "^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$")
        UUID id_prenotazione

) {
}
