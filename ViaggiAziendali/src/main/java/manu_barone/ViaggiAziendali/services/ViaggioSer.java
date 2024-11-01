package manu_barone.ViaggiAziendali.services;

import manu_barone.ViaggiAziendali.entities.Viaggio;
import manu_barone.ViaggiAziendali.payloads.ViaggioDTO;
import manu_barone.ViaggiAziendali.repositories.ViaggioRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ViaggioSer {

    @Autowired
    private ViaggioRepo vr;

    public Viaggio save(ViaggioDTO body) {
        Viaggio v = new Viaggio(body.destinazione(), body.data());
        return this.vr.save(v);
    }

    public Viaggio findById(UUID viaggioId){
        return this.vr.findById(viaggioId).orElseThrow(()-> new RuntimeException());
    }
}
