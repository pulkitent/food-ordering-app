package com.swiggy.shared;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "address")
class Address {

    @NotNull
    @Column(name = "address_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long addressId;

    @Column(name = "house_number")
    private final String houseNumber;

    @NotNull
    @Column(name = "district")
    private final String district;

    @NotNull
    @Column(name = "city")
    private final String city;

    @NotNull
    @Column(name = "state")
    private final String state;

    public Address(String houseNumber, String district, String city, String state) {
        this.houseNumber = houseNumber;
        this.district = district;
        this.city = city;
        this.state = state;
    }
}
