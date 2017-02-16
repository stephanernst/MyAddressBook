import AddressBook.BuddyInfo;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by stephanernst on 1/12/2017.
 */
public class BuddyInfoTest {
    private BuddyInfo buddy;

    @Before
    public void setUp() throws Exception {
        buddy = new BuddyInfo("Sarran", "6133634942");
    }

    @After
    public void tearDown() throws Exception {
        buddy = null;
    }

    @Test
    public void setName() throws Exception {
        buddy.setName("Ryan");
        assertEquals("Ryan", buddy.getName());
    }

    @Test
    public void setPhone() throws Exception {
        buddy.setPhone("6132479832");
        assertEquals("6132479832", buddy.getPhone());
    }

    @Test
    public void getName() throws Exception {
        assertEquals("Sarran", buddy.getName());
    }

    @Test
    public void getPhone() throws Exception {
        assertEquals("6133634942", buddy.getPhone());
    }

}