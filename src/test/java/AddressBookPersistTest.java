import AddressBook.AddressBook;
import AddressBook.BuddyInfo;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.persistence.*;
import java.util.List;

/**
 * Created by stephanernst on 1/19/2017.
 */
public class AddressBookPersistTest {
    private AddressBook buddies;
    private BuddyInfo buddy1;
    private BuddyInfo buddy2;

    @Before
    public void setUp() throws Exception {
        buddies = new AddressBook();
        buddy1 = new BuddyInfo("Sarran", "6133634942");
        buddy2 = new BuddyInfo("Aboud", "6134635542");
    }

    @After
    public void tearDown() throws Exception {
        buddies = null;
        buddy1 = null;
        buddy2 = null;
    }

    @Test
    public void testPersistBuddiesAndAddressBook() throws Exception {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-test");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(buddy1);
        em.persist(buddy2);
        buddies.addBuddy(buddy1);
        buddies.addBuddy(buddy2);
        em.persist(buddies);
        transaction.commit();

        Query query = em.createQuery("SELECT b FROM AddressBook b");

        List<AddressBook> results = query.getResultList();

        assert(results.get(0).contains(buddy1));
        assert(results.get(0).contains(buddy2));

        em.close();
        emf.close();
    }

    @Test
    public void testPersistAddressBook() throws Exception {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-test");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();

        buddies.addBuddy(buddy1);
        buddies.addBuddy(buddy2);
        em.persist(buddies);
        transaction.commit();

        Query query = em.createQuery("SELECT b FROM AddressBook b");

        List<AddressBook> results = query.getResultList();

        assert(results.get(0).contains(buddy1));
        assert(results.get(0).contains(buddy2));

        em.close();
        emf.close();
    }
}
