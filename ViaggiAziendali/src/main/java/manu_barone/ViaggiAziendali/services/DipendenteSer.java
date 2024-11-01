package manu_barone.ViaggiAziendali.services;

import manu_barone.ViaggiAziendali.entities.Dipendente;
import manu_barone.ViaggiAziendali.entities.Prenotazione;
import manu_barone.ViaggiAziendali.payloads.DipendenteDTO;
import manu_barone.ViaggiAziendali.repositories.DipendenteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class DipendenteSer {

    @Autowired
    private DipendenteRepo dipendenteRepo;

    public Dipendente save(DipendenteDTO body){
        Dipendente d = new Dipendente(body.username(),body.nome(),body.cognome(),body.email());
        return this.dipendenteRepo.save(d);
    }

    public Page<Dipendente> findAll(int page, int size, String sortBy) {
        if (size > 100) size = 100;
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy));
        return this.dipendenteRepo.findAll(pageable);
    }

    public Dipendente findById(String dipendenteUser){
        return this.dipendenteRepo.findById(dipendenteUser).orElseThrow(()-> new RuntimeException());
    }

    public void findByIdAndDelete(String id) {
        Dipendente p = this.findById(id);
        this.dipendenteRepo.delete(p);
    }



}
