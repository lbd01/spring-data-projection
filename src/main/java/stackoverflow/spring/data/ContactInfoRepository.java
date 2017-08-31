package stackoverflow.spring.data;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactInfoRepository extends JpaRepository<ContactInfo,Integer> {
}
