package com.example.springpaymentapiexample;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PaymentRequest {
    private String currency;
    private String amount;
    private String orderID;
    private Customer customer;
    private Long formTokenVersion;
    private String mode;

    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(String value) {
        this.currency = value;
    }

    @JsonProperty("amount")
    public String getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(String value) {
        this.amount = value;
    }

    @JsonProperty("orderId")
    public String getOrderID() {
        return orderID;
    }

    @JsonProperty("orderId")
    public void setOrderID(String value) {
        this.orderID = value;
    }

    @JsonProperty("customer")
    public Customer getCustomer() {
        return customer;
    }

    @JsonProperty("customer")
    public void setCustomer(Customer value) {
        this.customer = value;
    }

    @JsonProperty("formTokenVersion")
    public Long getFormTokenVersion() {
        return formTokenVersion;
    }

    @JsonProperty("formTokenVersion")
    public void setFormTokenVersion(Long value) {
        this.formTokenVersion = value;
    }

    @JsonProperty("mode")
    public String getMode() {
        return mode;
    }

    @JsonProperty("mode")
    public void setMode(String value) {
        this.mode = value;
    }
}
