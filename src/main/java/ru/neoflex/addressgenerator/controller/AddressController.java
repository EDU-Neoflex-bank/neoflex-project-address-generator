package ru.neoflex.addressgenerator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.neoflex.addressgenerator.model.Address;
import ru.neoflex.addressgenerator.service.AddressService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api")
public class AddressController {

    private final AddressService addressService;

    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @GetMapping("/addresses")
    public List<Address> getAddressesList(@RequestParam(name = "count", required = false) Optional<Integer> count) {
        return addressService.getRandomAddresses(count.orElse(0));
    }
}