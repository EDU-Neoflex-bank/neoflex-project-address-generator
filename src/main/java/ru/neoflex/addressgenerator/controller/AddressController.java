package ru.neoflex.addressgenerator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.neoflex.addressgenerator.model.Address;
import ru.neoflex.addressgenerator.service.AddressService;
import ru.neoflex.addressgenerator.service.RequestService;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class AddressController {

    private final AddressService addressService;

    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @GetMapping("/addresses")
    public List<Address> getAddressesList() {
        return addressService.getRandomAddresses(10);
    }
}
