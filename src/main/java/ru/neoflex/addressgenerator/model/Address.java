package ru.neoflex.addressgenerator.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@NoArgsConstructor
public class Address {
    @JsonProperty(value = "city")
    @NonNull
    private String city;

    @JsonProperty(value = "street_name")
    @NonNull
    private String streetName;

    @JsonProperty(value = "street_address")
    @NonNull
    private String streetAddress;

    @JsonProperty(value = "building_number")
    @NonNull
    private String buildingNumber;

    @JsonProperty(value = "zip_code")
    private String zipCode;

    @JsonProperty(value = "postcode")
    private String postCode;

    @JsonProperty(value = "country")
    private String country;
}
