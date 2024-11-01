package manu_barone.ViaggiAziendali.services;

import manu_barone.ViaggiAziendali.entities.Dipendente;
import manu_barone.ViaggiAziendali.payloads.DipendenteDTO;
import manu_barone.ViaggiAziendali.repositories.DipendenteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class DipendenteSer {

    @Autowired
    private DipendenteRepo dIpendenteRepo;

    public Dipendente save(DipendenteDTO body){
        Dipendente d = new Dipendente(body.username(),body.nome(),body.cognome(),body.email());
        return this.dIpendenteRepo.save(d);
    }

    public Dipendente findById(String dipendenteUser){
        return this.dIpendenteRepo.findById(dipendenteUser).orElseThrow(()-> new RuntimeException());
    }



}
