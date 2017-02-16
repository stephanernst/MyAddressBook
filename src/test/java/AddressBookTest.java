import AddressBook.AddressBook;
import AddressBook.BuddyInfo;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by stephanernst on 1/12/2017.
 */
public class AddressBookTest {
    private AddressBook book;

    @Before
    public void setUp() throws Exception {
        book = new AddressBook();
        BuddyInfo buddy = new BuddyInfo("Aboud", "6132234569");
        book.addBuddy(buddy);
    }

    @After
    public void tearDown() throws Exception {
        book = null;
    }

    @Test
    public void addBuddy() throws Exception {
        BuddyInfo buddy = new BuddyInfo("Sarran", "6133634942");
        assertFalse(book.contains(buddy));
        book.addBuddy(buddy);
        assertTrue(book.contains(buddy));
    }

    @Test
    public void contains() throws Exception {
        assertTrue(book.contains(new BuddyInfo("Aboud", "6132234569")));
    }

}