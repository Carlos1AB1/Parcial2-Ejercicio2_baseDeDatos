package org.carlos_arturo_baron.Aplication;

import org.carlos_arturo_baron.Domain.Cancha;
import org.carlos_arturo_baron.Infraestructure.JpaCanchaRepository;
import org.carlos_arturo_baron.Interfaces.CanchaService;

import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        CanchaService canchaService = new CanchaServiceImpl(new JpaCanchaRepository());

        // Crear y guardar nuevas canchas
        Cancha cancha1 = new Cancha("Cancha Central", "Fútbol", "Av. Principal", 100);
        Cancha cancha2 = new Cancha("Cancha Secundaria", "Baloncesto", "Calle Secundaria", 50);

        canchaService.addCancha(cancha1);
        canchaService.addCancha(cancha2);

        // Listar todas las canchas
        List<Cancha> canchas = canchaService.getAllCanchas();
        for (Cancha cancha : canchas) {
            System.out.println(cancha);
        }

        // Modificar una cancha
        cancha1.setPrecioPorHora(120);
        canchaService.modifyCancha(cancha1);

        // Obtener una cancha por ID
        canchaService.getCanchaById(1).ifPresent(System.out::println);

        // Eliminar una cancha
        canchaService.removeCancha(2);
    }

    private static class CanchaServiceImpl implements CanchaService {
        public CanchaServiceImpl(JpaCanchaRepository jpaCanchaRepository) {
        }

        @Override
        public void addCancha(Cancha cancha) {

        }

        @Override
        public void modifyCancha(Cancha cancha) {

        }

        @Override
        public void removeCancha(int id) {

        }

        @Override
        public Optional<Cancha> getCanchaById(int id) {
            return Optional.empty();
        }

        @Override
        public List<Cancha> getAllCanchas() {
            return List.of();
        }
    }
}
