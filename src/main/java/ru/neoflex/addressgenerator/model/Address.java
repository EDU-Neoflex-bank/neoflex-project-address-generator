package ru.neoflex.addressgenerator.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Address {
    @JsonProperty(value = "city")
    private String city;

    @JsonProperty(value = "street_name")
    private String streetName;

    @JsonProperty(value = "street_address")
    private String streetAddress;

    @JsonProperty(value = "building_number")
    private String buildingNumber;

    @JsonProperty(value = "zip_code")
    private String zipCode;

    @JsonProperty(value = "postcode")
    private String postCode;

    @JsonProperty(value = "country")
    private String country;

    public Address() {
    }

    public String getCity() {
        return city;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getBuildingNumber() {
        return buildingNumber;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getPostCode() {
        return postCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public void setBuildingNumber(String buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address)) return false;
        Address address = (Address) o;
        return Objects.equals(getCity(), address.getCity()) && Objects.equals(getStreetName(), address.getStreetName()) && Objects.equals(getStreetAddress(), address.getStreetAddress()) && Objects.equals(getBuildingNumber(), address.getBuildingNumber()) && Objects.equals(getZipCode(), address.getZipCode()) && Objects.equals(getPostCode(), address.getPostCode()) && Objects.equals(getCountry(), address.getCountry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCity(), getStreetName(), getStreetAddress(), getBuildingNumber(), getZipCode(), getPostCode(), getCountry());
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", streetName='" + streetName + '\'' +
                ", streetAddress='" + streetAddress + '\'' +
                ", buildingNumber='" + buildingNumber + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", postcode='" + postCode + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
