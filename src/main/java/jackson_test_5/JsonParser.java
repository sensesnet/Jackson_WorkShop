package jackson_test_5;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import pojos.Car;

import java.io.IOException;
import java.util.Map;

public class JsonParser {
    public static void main(String[] args) throws IOException {


        String jsonArray = "[{\"brand\":\"ford\"},{\"brand\":\"maserati\"}]";
        ObjectMapper objectMapper = new ObjectMapper();
        Car[] carArray = objectMapper.readValue(jsonArray, Car[].class);
        for (Car car : carArray) {
            System.out.println(car.getBrand());
        }

//        Read map from JSON String
        String jsonObject = "{\"brand\":\"ford\",\"doors\":5}";
        Map<String, Object> objectMap = objectMapper.readValue(jsonObject,
                new TypeReference<Map<String, Object>>() {
                });
        System.out.println("Map: " + objectMap);

    }
}
