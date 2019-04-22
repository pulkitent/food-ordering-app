package com.swiggy.shared;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {
    @Column(name = "name", nullable = false)
    private final Name name;

    @Column(name = "email_id", nullable = false)
    private String emailId;

    @Column(name = "address", nullable = false)
    private Address address;

    @Column(name = "unique_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long uniqueId;

    @Column(name = "password")
    private String password;

    public User(Name name, String emailId, Address address, String password) {
        this.name = name;
        this.emailId = emailId;
        this.address = address;
        this.password = password;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}