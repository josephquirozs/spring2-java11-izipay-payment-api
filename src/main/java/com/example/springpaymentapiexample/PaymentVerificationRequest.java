package com.example.springpaymentapiexample;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PaymentVerificationRequest {
    private String krHash;
    private String krHashAlgorithm;
    private String krAnswerType;
    private String krAnswer;

    @JsonProperty("kr-hash")
    public String getKrHash() {
        return krHash;
    }

    @JsonProperty("kr-hash")
    public void setKrHash(String value) {
        this.krHash = value;
    }

    @JsonProperty("kr-hash-algorithm")
    public String getKrHashAlgorithm() {
        return krHashAlgorithm;
    }

    @JsonProperty("kr-hash-algorithm")
    public void setKrHashAlgorithm(String value) {
        this.krHashAlgorithm = value;
    }

    @JsonProperty("kr-answer-type")
    public String getKrAnswerType() {
        return krAnswerType;
    }

    @JsonProperty("kr-answer-type")
    public void setKrAnswerType(String value) {
        this.krAnswerType = value;
    }

    @JsonProperty("kr-answer")
    public String getKrAnswer() {
        return krAnswer;
    }

    @JsonProperty("kr-answer")
    public void setKrAnswer(String value) {
        this.krAnswer = value;
    }
}

