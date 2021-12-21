package ru.neoflex.addressgenerator;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.tomcat.jni.Address;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.neoflex.addressgenerator.service.RequestService;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class AddressGeneratorApplication {

    public static void main(String[] args) {
        SpringApplication.run(AddressGeneratorApplication.class, args);

        RequestService requestService = new RequestService();
        String json = requestService.getJSON(3);
        System.out.println(json);

        ObjectMapper objectMapper = new ObjectMapper();
        List<Address> list = new ArrayList<>();
        try {
           list = Arrays.asList(objectMapper.readValue(json, Address[].class));
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        System.out.println(list);
    }
}
