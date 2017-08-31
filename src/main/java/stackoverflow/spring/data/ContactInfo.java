package stackoverflow.spring.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ContactInfo {
    @Id
    @GeneratedValue
    private Integer id;
    private Integer personId;
    private String description;

    public ContactInfo() {}

    public ContactInfo(Integer id, Integer personId, String description) {
        this.id = id;
        this.personId = personId;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
