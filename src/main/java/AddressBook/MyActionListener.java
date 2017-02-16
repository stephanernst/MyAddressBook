package AddressBook;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

/**
 * Created by stephanernst on 1/26/2017.
 */

public class MyActionListener implements ActionListener {
    private MyJTextField buddyName;
    private MyJTextField phone;
    private AddressBook buddies = null;

    public void setBuddyName(MyJTextField buddy) {
        this.buddyName = buddy;
    }

    public void setPhone(MyJTextField phone) {
        this.phone = phone;
    }

    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, buddyName.getText() + ": " + phone.getText() + " was added to address book.");

        if(buddies == null) {
            buddies = new AddressBook();
        }
        BuddyInfo buddy = new BuddyInfo(buddyName.getText(), phone.getText());

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-test");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        buddies.addBuddy(buddy);
        em.persist(buddies);

        em.close();
        emf.close();
    }
}
