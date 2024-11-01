package manu_barone.ViaggiAziendali.payloads;

import jakarta.validation.constraints.*;

import java.time.LocalDate;
import java.util.UUID;

public record PrenotazioneDTO(

        @NotNull
        UUID id_viaggio,

        @NotEmpty
        String id_dipendente,

        @NotNull
        LocalDate dataRichiesta
) {
}
