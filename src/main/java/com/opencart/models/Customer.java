package com.opencart.models;

import lombok.Data;

@Data
public class Customer {

    private String firstName;
    private String lastName;
    private String email;
    private String telephone;
    private String address;
    private String city;
    private String postCode;
}