package ru.neoflex.addressgenerator.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import ru.neoflex.addressgenerator.model.Address;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressService {

    private final RequestService requestService;

    public AddressService(RequestService requestService) {
        this.requestService = requestService;
    }

    public List<Address> getRandomAddresses(int count) {
        String json = requestService.getJSON(count);
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        List<Address> addresses = new ArrayList<>();

        try {
            addresses = objectMapper.readValue(json, new TypeReference<>() {});
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return addresses;
    }
}
