package org.carlos_arturo_baron.service;

import org.carlos_arturo_baron.Domain.Cancha;
import org.carlos_arturo_baron.Interfaces.CanchaRepository;
import org.carlos_arturo_baron.Interfaces.CanchaService;

import java.util.List;
import java.util.Optional;

public class CanchaServiceImpl implements CanchaService {

    private final CanchaRepository canchaRepository;

    public CanchaServiceImpl(CanchaRepository canchaRepository) {
        this.canchaRepository = canchaRepository;
    }

    @Override
    public void addCancha(Cancha cancha) {
        canchaRepository.saveCancha(cancha);
    }

    @Override
    public void modifyCancha(Cancha cancha) {
        canchaRepository.updateCancha(cancha);
    }

    @Override
    public void removeCancha(int id) {
        canchaRepository.deleteCancha(id);
    }

    @Override
    public Optional<Cancha> getCanchaById(int id) {
        return canchaRepository.findCanchaById(id);
    }

    @Override
    public List<Cancha> getAllCanchas() {
        return canchaRepository.findAll();
    }
}
