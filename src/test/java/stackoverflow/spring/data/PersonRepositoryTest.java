package stackoverflow.spring.data;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.List;

@RunWith(SpringRunner.class)
@DataJpaTest
public class PersonRepositoryTest {

    @Autowired
    private PersonRepository pRepo;

    @Autowired
    private ContactInfoRepository cRepo;

    @Test
    public void test() {
        Person p = new Person(null,"John","Wayne");
        pRepo.save(p);
        ContactInfo c1 = new ContactInfo(null, p.getId(),"+1 123 123 123");
        cRepo.save(c1);
        ContactInfo c2 = new ContactInfo(null, p.getId(),"john.wayne@west.com");
        cRepo.save(c2);

        List<Person> list = pRepo.findAll();  //select generatedAlias0 from Person as generatedAlias0
        List<PersonProjection> listProjection = pRepo.findAllProjectedBy();  //select contactInfoList, generatedAlias0.id from Person as generatedAlias0 left join generatedAlias0.contactInfoList as contactInfoList

        Assert.assertTrue(list.size()==listProjection.size());
    }
}
