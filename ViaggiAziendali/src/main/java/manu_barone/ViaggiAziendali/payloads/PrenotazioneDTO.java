package manu_barone.ViaggiAziendali.payloads;

import jakarta.validation.constraints.*;

import java.time.LocalDate;
import java.util.UUID;

public record PrenotazioneDTO(

        @Pattern(regexp = "^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$")
        UUID id_viaggio,

        @Pattern(regexp = "^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$")
        UUID id_dipendente,

        @Future
        LocalDate dataRichiesta
) {
}
