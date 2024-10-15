package org.carlos_arturo_baron.Infraestructure;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.carlos_arturo_baron.Domain.Cancha;
import org.carlos_arturo_baron.Interfaces.CanchaRepository;

import java.util.List;
import java.util.Optional;

public class JpaCanchaRepository implements CanchaRepository {
    private final EntityManagerFactory emf;

    public JpaCanchaRepository() {
        emf = Persistence.createEntityManagerFactory("CitasUp");
    }

    @Override
    public void saveCancha(Cancha cancha) {
        try (EntityManager em = emf.createEntityManager()) {
            em.getTransaction().begin();
            em.persist(cancha);
            em.getTransaction().commit();
        }
    }

    @Override
    public void updateCancha(Cancha cancha) {
        try (EntityManager em = emf.createEntityManager()) {
            em.getTransaction().begin();
            em.merge(cancha);
            em.getTransaction().commit();
        }
    }

    @Override
    public void deleteCancha(int id) {
        try (EntityManager em = emf.createEntityManager()) {
            em.getTransaction().begin();
            Cancha cancha = em.find(Cancha.class, id);
            if (cancha != null) {
                em.remove(cancha);
            }
            em.getTransaction().commit();
        }
    }

    @Override
    public Optional<Cancha> findCanchaById(int id) {
        EntityManager em = emf.createEntityManager();
        try {
            return Optional.ofNullable(em.find(Cancha.class, id));
        } finally {
            em.close();
        }
    }

    @Override
    public List<Cancha> findAll() {
        try (EntityManager em = emf.createEntityManager()) {
            return em.createQuery("SELECT c FROM Cancha c", Cancha.class)
                    .getResultList();
        }
    }
}
