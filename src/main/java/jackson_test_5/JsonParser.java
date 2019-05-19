package jackson_test_5;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import pojos.Car;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Map;

public class JsonParser {
    public static void main(String[] args) throws IOException {


        String jsonArray = "[{\"brand\":\"ford\"},{\"brand\":\"maserati\"}]";
        ObjectMapper objectMapper = new ObjectMapper();
        Car[] carArray = objectMapper.readValue(jsonArray, Car[].class);
        for (Car car : carArray) {
            System.out.println(car.getBrand());
        }

//        Read MAP from JSON String
        String jsonObject = "{\"brand\":\"ford\",\"doors\":5}";
        Map<String, Object> objectMap = objectMapper.readValue(jsonObject,
                new TypeReference<Map<String, Object>>() {
                });
        System.out.println("Map: " + objectMap);


//        Read Object from Json reader
        String carsJson = "{\"brand\":\"ford\",\"doors\":5}";
        Reader reader = new StringReader(carsJson);
        Car car = objectMapper.readValue(reader, Car.class);
        System.out.println("Read object from reader: " + car.toString());

//        Read object from JSON file
        File file = new File("src/main/resources/test5.json");
        //ignore unknown json fields
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
        Car carByFile = objectMapper.readValue(file, Car.class);
        System.out.println("Car by file: " + carByFile);


    }
}
