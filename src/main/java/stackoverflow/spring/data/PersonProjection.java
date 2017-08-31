package stackoverflow.spring.data;

import java.util.List;

public interface PersonProjection {
    Integer getId();
    String getName();
    String getLastname();
    List<ContactInfo> getContactInfoList();
}
