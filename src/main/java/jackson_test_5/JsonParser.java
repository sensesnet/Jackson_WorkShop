package jackson_test_5;

import com.fasterxml.jackson.databind.ObjectMapper;
import pojos.Car;

import java.io.IOException;

public class JsonParser {
    public static void main(String[] args) throws IOException {

        String jsonArray = "[{\"brand\":\"ford\"},{\"brand\":\"maserati\"}]";
        ObjectMapper objectMapper = new ObjectMapper();
        Car[] carArray = objectMapper.readValue(jsonArray, Car[].class);
        for (Car car : carArray) {
            System.out.println(car.getBrand());
        }
    }
}
