package dao;

import entity.*;
import jakarta.persistence.EntityManager;

import java.util.List;

public class CurrencyDao {

    public void persist(Currency cur) {
        EntityManager em = datasource.MariaDbJpaConnection.getInstance();
        em.getTransaction().begin();
        em.persist(cur);
        em.getTransaction().commit();
    }

    public Currency find(int id) {
        EntityManager em = datasource.MariaDbJpaConnection.getInstance();
        Currency cur = em.find(Currency.class, id);
        return cur;
    }

    public List<Currency> findAll() {
        EntityManager em = datasource.MariaDbJpaConnection.getInstance();
        List<Currency> cur = em.createQuery("select e from Currency e").getResultList();
        return cur;
    }

    public void update(Currency cur) {
        EntityManager em = datasource.MariaDbJpaConnection.getInstance();
        em.getTransaction().begin();
        em.merge(cur);
        em.getTransaction().commit();
    }

    public void delete(Currency cur) {
        EntityManager em = datasource.MariaDbJpaConnection.getInstance();
        em.getTransaction().begin();
        em.remove(cur);
        em.getTransaction().commit();
    }
}
