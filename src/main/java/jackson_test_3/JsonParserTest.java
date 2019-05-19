package jackson_test_3;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

public class JsonParserTest {
    @Test
    public void testParse() throws JsonProcessingException {

        ExtendableBean bean = new ExtendableBean("My bean");
        bean.add("audi","green");
        bean.add("mercedes","red");

        String result = new ObjectMapper().writeValueAsString(bean);
        System.out.println("result 3 test:/n"+result);
    }
}
