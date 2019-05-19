package jackson_test_3;

import com.fasterxml.jackson.annotation.JsonAnyGetter;

import java.util.HashMap;
import java.util.Map;

public class ExtendableBean {
    public String name;
    public Map<String,String> props;

    public ExtendableBean(String name) {
        this.name = name;
        props = new HashMap<>();
    }

    @JsonAnyGetter
    public Map<String, String> getProps(){
        return props;
    }

    public void add(String key, String value) {
        props.put(key,value);
    }
}
