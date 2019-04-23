package com.swiggy.foodapp.shared;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "address")
class Address {
    @Id
    @NotNull
    @Column(name = "address_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long addressId;

    @Column(name = "house_number")
    private String houseNumber;

    @NotNull
    @Column(name = "district")
    private String district;

    @NotNull
    @Column(name = "city")
    private String city;

    @NotNull
    @Column(name = "state")
    private String state;

    public Address() {
    }

    public Address(String houseNumber, String district, String city, String state) {
        this.houseNumber = houseNumber;
        this.district = district;
        this.city = city;
        this.state = state;
    }

    public Long getAddressId() {
        return addressId;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public String getDistrict() {
        return district;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }
}
