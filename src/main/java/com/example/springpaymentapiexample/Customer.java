package com.example.springpaymentapiexample;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Customer {
    private String email;
    private String reference;

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String value) {
        this.email = value;
    }

    @JsonProperty("reference")
    public String getReference() {
        return reference;
    }

    @JsonProperty("reference")
    public void setReference(String value) {
        this.reference = value;
    }
}

