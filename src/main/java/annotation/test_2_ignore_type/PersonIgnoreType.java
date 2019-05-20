package annotation.test_2_ignore_type;

import com.fasterxml.jackson.annotation.JsonIgnoreType;

public class PersonIgnoreType {

    @JsonIgnoreType
    public static class Address{
        public String streetName = null;
        public String houseNumber = null;
        public String zipCode = null;
        public String city = null;
        public String country = null;
    }

}
