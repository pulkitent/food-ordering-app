package com.swiggy.shared;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "address")
class Address {
    @Column(name = "house_number")
    private final String houseNumber;

    @Column(name = "district")
    private final String district;

    @Column(name = "city")
    private final String city;

    @Column(name = "state")
    private final String state;

    public Address(String houseNumber, String district, String city, String state) {
        this.houseNumber = houseNumber;
        this.district = district;
        this.city = city;
        this.state = state;
    }
}
