package hj;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

@RooJavaBean
@RooJpaActiveRecord(finders = "findCountryHistorysByCountryIdEquals")
@RooToString
public class CountryHistory {

    /**
     */
    private String code;

    /**
     */
    private String name;

    private Long countryId;

    private String historyType;

    public void persist() {
        throw new NotImplementedException();
    }

    public void remove() {
        throw new NotImplementedException();
    }

    public void flush() {
        throw new NotImplementedException();
    }

    public void clear() {
        throw new NotImplementedException();
    }

    public void merge() {
        throw new NotImplementedException();
    }
}
