package jackson_test_1;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import pojos.Address;
import pojos.Employee;

import java.io.IOException;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JSONParserTest {

    public static void main(String[] args) throws IOException {

//      Json to Object
        byte[] jsonData = Files.readAllBytes(Paths.get("src/main/resources/test.json"));
        ObjectMapper objectMapper = new ObjectMapper();
        Employee employee = objectMapper.readValue(jsonData, Employee.class);
        System.out.println("Employer Object\n" + employee);

//        Object to json
        Employee emp = createEmployeer();
        objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);
        StringWriter stringWriter = new StringWriter();
        objectMapper.writeValue(stringWriter, emp);
        System.out.println("Employer JSON /n" + stringWriter);

    }

    private static Employee createEmployeer(){
        Employee employee = new Employee();
        employee.setId(123);
        employee.setAddress(new Address());

        return employee;
    }
}
