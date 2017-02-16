import AddressBook.BuddyInfo;
import org.junit.Test;

import javax.persistence.*;
import java.util.List;

/**
 * Created by stephanernst on 1/19/2017.
 */
public class BuddyInfoPersistTest {
    @Test
    public void testPersist() throws Exception {
        BuddyInfo buddy = new BuddyInfo("Sarran", "6133634942");
        BuddyInfo buddy2 = new BuddyInfo("Aboud", "6134635542");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-test");
        EntityManager em = emf.createEntityManager();

        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(buddy);
        em.persist(buddy2);
        transaction.commit();

        Query query = em.createQuery("SELECT b FROM BuddyInfo b");

        List<BuddyInfo> results = query.getResultList();

        assert(results.contains(buddy));
        assert(results.contains(buddy2));

        em.close();
        emf.close();
    }
}
