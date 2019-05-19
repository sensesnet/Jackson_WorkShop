package jackson_test_4;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import pojos.Employee;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class JsonObjectsParser {

    public static void main(String[] args) throws IOException {
//        Array Json to list of Object
        byte[] jsonData = Files.readAllBytes(Paths.get("src/main/resources/test4.json"));
        ObjectMapper objectMapper = new ObjectMapper();
        List<Employee> employeeList =
                objectMapper.readValue(jsonData, new TypeReference<List<Employee>>() {});
        System.out.println("Employer Object\n" + employeeList);
    }
}
