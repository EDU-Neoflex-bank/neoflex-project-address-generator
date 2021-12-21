package ru.neoflex.addressgenerator.service;

import org.springframework.stereotype.Service;
import ru.neoflex.addressgenerator.model.Address;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressService {

    private final RequestService requestService;
    private List<Address> addressList = new ArrayList<>();

    public AddressService(RequestService requestService) {
        this.requestService = requestService;
    }

    public List<Address> getRandomAddresses(int count) {
        return new ArrayList<>();
    }
}
