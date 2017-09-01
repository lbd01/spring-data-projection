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

    @Test
    public void test() {
        List<Person> list = pRepo.findAll();  //select generatedAlias0 from Person as generatedAlias0
        List<PersonProjection> listProjection = pRepo.findAllProjectedBy();  //select contactInfoList, generatedAlias0.id from Person as generatedAlias0 left join generatedAlias0.contactInfoList as contactInfoList
        Assert.assertTrue(list.size()==listProjection.size());
    }
}
