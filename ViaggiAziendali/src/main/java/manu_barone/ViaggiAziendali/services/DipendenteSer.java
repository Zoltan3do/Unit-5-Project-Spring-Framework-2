package manu_barone.ViaggiAziendali.services;

import manu_barone.ViaggiAziendali.entities.Dipendente;
import manu_barone.ViaggiAziendali.repositories.DipendenteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DipendenteSer {

    @Autowired
    private DipendenteRepo dIpendenteRepo;

    public Dipendente save(){

    }



}
