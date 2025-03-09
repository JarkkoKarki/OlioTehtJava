package dao;

import entity.Currency;
import jakarta.persistence.EntityManager;
import java.util.List;

public class CurrencyDao {

    public List<Currency> findAll() {
        EntityManager em = datasource.MariaDbJpaConnection.getInstance();
        List<Currency> currencies = null;
        try {
            em.getTransaction().begin();
            currencies = em.createQuery("select e from Currency e", Currency.class).getResultList();
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            e.printStackTrace();
        } finally {
            em.close();
        }
        return currencies;
    }

    public Currency find(int id) {
        EntityManager em = datasource.MariaDbJpaConnection.getInstance();
        Currency currency = null;
        try {
            em.getTransaction().begin();
            currency = em.find(Currency.class, id);
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            e.printStackTrace();
        } finally {
            em.close();
        }
        return currency;
    }

    public Currency findByAbbreviation(String abbreviation) {
        EntityManager em = datasource.MariaDbJpaConnection.getInstance();
        Currency currency = null;
        try {
            em.getTransaction().begin();
            currency = em.createQuery("select e from Currency e where e.abbreviation = :abbreviation", Currency.class)
                    .setParameter("abbreviation", abbreviation)
                    .getSingleResult();
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            e.printStackTrace();
        } finally {
            em.close();
        }
        return currency;
    }

    public void persist(Currency cur) {
        EntityManager em = datasource.MariaDbJpaConnection.getInstance();
        try {
            em.getTransaction().begin();
            em.persist(cur);
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            e.printStackTrace();
        } finally {
            em.close();
        }
    }

    public void update(Currency cur) {
        EntityManager em = datasource.MariaDbJpaConnection.getInstance();
        try {
            em.getTransaction().begin();
            em.merge(cur);
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            e.printStackTrace();
        } finally {
            em.close();
        }
    }

    public void delete(Currency cur) {
        EntityManager em = datasource.MariaDbJpaConnection.getInstance();
        try {
            em.getTransaction().begin();
            em.remove(em.contains(cur) ? cur : em.merge(cur));
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            e.printStackTrace();
        } finally {
            em.close();
        }
    }
}