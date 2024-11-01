package manu_barone.ViaggiAziendali.repositories;

import manu_barone.ViaggiAziendali.entities.Viaggio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ViaggioRepo extends JpaRepository<Viaggio, UUID> {
}
