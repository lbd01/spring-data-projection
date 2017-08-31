package stackoverflow.spring.data;

import javax.persistence.*;
import java.util.List;

@Entity
public class Person {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String lastname;
    private String sshKey;
    @OneToMany(mappedBy = "personId",fetch = FetchType.EAGER)
    private List<ContactInfo> contactInfoList;

    public Person() {}

    public Person(Integer id, String name, String lastname, String sshKey) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.sshKey = sshKey;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSshKey() {
        return sshKey;
    }

    public void setSshKey(String sshKey) {
        this.sshKey = sshKey;
    }

    public List<ContactInfo> getContactInfoList() {
        return contactInfoList;
    }

    public void setContactInfoList(List<ContactInfo> contactInfoList) {
        this.contactInfoList = contactInfoList;
    }
}
