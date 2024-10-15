package org.carlos_arturo_baron.Interfaces;

import org.carlos_arturo_baron.Domain.Cancha;

import java.util.List;
import java.util.Optional;

public interface CanchaRepository {

    void saveCancha(Cancha cancha);
    void updateCancha(Cancha cancha);
    void deleteCancha(int id);
    Optional<Cancha> findCanchaById(int id);
    List<Cancha> findAll();
}
