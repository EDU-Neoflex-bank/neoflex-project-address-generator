package ru.neoflex.addressgenerator.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Builder;
import org.springframework.stereotype.Service;
import ru.neoflex.addressgenerator.model.Address;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
@Builder
public class AddressService {

    private final RequestService requestService;

    private final ObjectMapper objectMapper;

    public List<Address> getRandomAddresses(int count) {
        String json = requestService.getJSON(count);
        List<Address> addresses = new ArrayList<>();

        try {
            addresses = objectMapper.readValue(json, new TypeReference<List<Address>>() {
            });
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return addresses;
    }
}
