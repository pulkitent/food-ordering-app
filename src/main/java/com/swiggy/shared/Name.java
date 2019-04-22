package com.swiggy.shared;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "user_name")
class Name {
    @Column(name = "first_name")
    private final String firstName;

    @Column(name = "mid_name")
    private final String midName;

    @Column(name = "last_name")
    private final String lastName;

    public String getFirstName() {
        return firstName;
    }

    public String getMidName() {
        return midName;
    }

    public String getLastName() {
        return lastName;
    }

    public Name(String firstName, String midName, String lastName) {
        this.firstName = firstName;
        this.midName = midName;
        this.lastName = lastName;
    }
}
