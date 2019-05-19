package jackson_test_2;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ParseWithAnnTest extends Assertions {

    @Test
    public void testWithAnnotation() throws JsonProcessingException {
        MyBean myBean = new MyBean(1,"Irina");

        String result = new ObjectMapper().writeValueAsString(myBean);
        System.out.println(result);
    }
}
