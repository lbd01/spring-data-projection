package stackoverflow.spring.data;

import java.util.List;

public interface PersonProjection {
    Integer getId();
    List<ContactInfo> getContactInfoList();
}
