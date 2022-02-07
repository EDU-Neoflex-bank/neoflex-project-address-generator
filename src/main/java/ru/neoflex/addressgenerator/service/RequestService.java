package ru.neoflex.addressgenerator.service;

import lombok.AllArgsConstructor;
import lombok.Builder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@AllArgsConstructor
@Builder
public class RequestService {

    private final RestTemplate restTemplate;

    public String getJSON(int size) {
        return restTemplate.getForObject("https://random-data-api.com/api/address/random_address?size={size}", String.class, size);
    }
}
