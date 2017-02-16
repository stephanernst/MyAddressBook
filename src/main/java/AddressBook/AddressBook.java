package AddressBook;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Observable;

/**
 * Created by stephanernst on 1/12/2017.
 */
@Entity
public class AddressBook extends Observable {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long Id;

    @OneToMany(cascade = CascadeType.PERSIST)
    private Collection<BuddyInfo> buddies;

    public AddressBook() {
        buddies = new ArrayList<BuddyInfo>();
    }

    public void setBuddies(Collection<BuddyInfo> buddies) {
        this.buddies = buddies;
    }

    public Collection<BuddyInfo> getBuddies() {
        return buddies;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Long getId() {
        return this.Id;
    }

    public void addBuddy(BuddyInfo buddy) {
        buddies.add(buddy);
    }

    public void print() {
        System.out.println("Name\tPhone");
        for (BuddyInfo buddy : buddies) {
            System.out.println(buddy.getName() + "\t" + buddy.getPhone());
        }
    }

    public boolean contains(BuddyInfo buddy) {
        for (BuddyInfo person : buddies) {
            if (person.getName().equals(buddy.getName())&&person.getPhone().equals(buddy.getPhone())) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        AddressBook book = new AddressBook();
        book.addBuddy(new BuddyInfo("Sarran", "6133634942"));
        book.addBuddy(new BuddyInfo("Ryan", "6132479832"));
        book.addBuddy(new BuddyInfo("Aboud", "6132234569"));

        book.print();
    }
}
