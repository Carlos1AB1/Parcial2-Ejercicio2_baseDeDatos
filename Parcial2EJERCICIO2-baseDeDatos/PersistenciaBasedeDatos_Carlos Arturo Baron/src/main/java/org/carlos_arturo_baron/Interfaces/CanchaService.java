package org.carlos_arturo_baron.Interfaces;

import org.carlos_arturo_baron.Domain.Cancha;

import java.util.List;
import java.util.Optional;

public interface CanchaService {

    void addCancha(Cancha cancha);
    void modifyCancha(Cancha cancha);
    void removeCancha(int id);
    Optional<Cancha> getCanchaById(int id);
    List<Cancha> getAllCanchas();
}
