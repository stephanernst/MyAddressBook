package AddressBook;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by stephanernst on 1/12/2017.
 */
@Entity
public class BuddyInfo {

    private Long Id;
    private String name;
    private String phone;

    protected BuddyInfo() {
        this.name = "";
        this.phone = "";
    }

    public BuddyInfo(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }


    public void setId(Long id) {
        this.Id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public Long getId() {
        return Id;
    }

    public String getName() {
        return this.name;
    }

    public String getPhone() {
        return this.phone;
    }

    public String toString() {
        return getName() + " " + getPhone();
    }
}
