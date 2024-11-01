package manu_barone.ViaggiAziendali.services;

import manu_barone.ViaggiAziendali.entities.Dipendente;
import manu_barone.ViaggiAziendali.entities.Prenotazione;
import manu_barone.ViaggiAziendali.entities.Viaggio;
import manu_barone.ViaggiAziendali.exceptions.NotFoundException;
import manu_barone.ViaggiAziendali.payloads.DipendenteDTO;
import manu_barone.ViaggiAziendali.payloads.PrenotazioneDTO;
import manu_barone.ViaggiAziendali.payloads.ViaggioDTO;
import manu_barone.ViaggiAziendali.repositories.DipendenteRepo;
import manu_barone.ViaggiAziendali.repositories.PrenotazioneRepo;
import manu_barone.ViaggiAziendali.repositories.ViaggioRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class PrenotazioneSer {


    @Autowired
    private ViaggioRepo viaggioRepo;

    @Autowired
    private DipendenteRepo dipendenteRepo;

    @Autowired
    private PrenotazioneRepo prenotazioneRepo;

    public Prenotazione save(PrenotazioneDTO body){
        Optional<Viaggio> v = viaggioRepo.findById(body.id_viaggio());
        Optional<Dipendente> d = dipendenteRepo.findById(body.id_dipendente());
        Prenotazione p = new Prenotazione(
                v.orElseThrow(()-> new NotFoundException(v.get().getId())),
                d.orElseThrow(()-> new NotFoundException(v.get().getId())),
                body.dataRichiesta()
        );
        return this.prenotazioneRepo.save(p);
    }

    public Prenotazione findById(UUID prenotazioneID){
        return this.prenotazioneRepo.findById(prenotazioneID).orElseThrow(()->new NotFoundException(prenotazioneID));
    }

}
