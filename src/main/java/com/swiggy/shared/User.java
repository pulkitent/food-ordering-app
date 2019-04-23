package com.swiggy.shared;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "user")
public class User {

    @NotNull
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;

    @NotNull
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "name_id")
    @Column(name = "name", nullable = false)
    private final Name name;

    @NotNull
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    @Column(name = "address", nullable = false)
    private Address address;

    @NotNull
    @Column(name = "email_id", nullable = false)
    private String emailId;

    public User(Name name, String emailId, Address address, String password) {
        this.name = name;
        this.emailId = emailId;
        this.address = address;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}