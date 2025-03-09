
package datasource;

import jakarta.persistence.*;

public class MariaDbJpaConnection {

    private static EntityManagerFactory emf = null;

    public static EntityManager getInstance() {
        if (emf == null) {
            emf = Persistence.createEntityManagerFactory("CurrencyPU");
        }
        return emf.createEntityManager();
    }
}