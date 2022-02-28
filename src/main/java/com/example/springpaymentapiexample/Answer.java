package com.example.springpaymentapiexample;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Answer {
    private String formToken;
    private String type;

    @JsonProperty("formToken")
    public String getFormToken() {
        return formToken;
    }

    @JsonProperty("formToken")
    public void setFormToken(String value) {
        this.formToken = value;
    }

    @JsonProperty("_type")
    public String getType() {
        return type;
    }

    @JsonProperty("_type")
    public void setType(String value) {
        this.type = value;
    }
}

