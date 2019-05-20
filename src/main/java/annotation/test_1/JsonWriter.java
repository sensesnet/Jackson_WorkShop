package annotation.test_1;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class JsonWriter {

    ObjectMapper objectMapper = new ObjectMapper();
    Person person = new Person();

    @Test
    public void writeToJson() throws IOException {
        person.setName(null);
        person.setPersonId(12);
        objectMapper.writeValue(new FileOutputStream("output-1.json"), person);

        person.setName("Kirill");
        person.setPersonId(12);
        person.setAge(20);
        objectMapper.writeValue(new FileOutputStream("output-2.json"), person);
    }


}
