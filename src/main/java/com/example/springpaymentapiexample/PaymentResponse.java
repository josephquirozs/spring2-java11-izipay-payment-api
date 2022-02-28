package com.example.springpaymentapiexample;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;

public class PaymentResponse {
    private String webService;
    private String version;
    private String applicationVersion;
    private String status;
    private Answer answer;
    private String ticket;
    private OffsetDateTime serverDate;
    private String applicationProvider;
    private Object metadata;
    private String mode;
    private String serverURL;
    private String type;

    @JsonProperty("webService")
    public String getWebService() {
        return webService;
    }

    @JsonProperty("webService")
    public void setWebService(String value) {
        this.webService = value;
    }

    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(String value) {
        this.version = value;
    }

    @JsonProperty("applicationVersion")
    public String getApplicationVersion() {
        return applicationVersion;
    }

    @JsonProperty("applicationVersion")
    public void setApplicationVersion(String value) {
        this.applicationVersion = value;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String value) {
        this.status = value;
    }

    @JsonProperty("answer")
    public Answer getAnswer() {
        return answer;
    }

    @JsonProperty("answer")
    public void setAnswer(Answer value) {
        this.answer = value;
    }

    @JsonProperty("ticket")
    public String getTicket() {
        return ticket;
    }

    @JsonProperty("ticket")
    public void setTicket(String value) {
        this.ticket = value;
    }

    @JsonProperty("serverDate")
    public OffsetDateTime getServerDate() {
        return serverDate;
    }

    @JsonProperty("serverDate")
    public void setServerDate(OffsetDateTime value) {
        this.serverDate = value;
    }

    @JsonProperty("applicationProvider")
    public String getApplicationProvider() {
        return applicationProvider;
    }

    @JsonProperty("applicationProvider")
    public void setApplicationProvider(String value) {
        this.applicationProvider = value;
    }

    @JsonProperty("metadata")
    public Object getMetadata() {
        return metadata;
    }

    @JsonProperty("metadata")
    public void setMetadata(Object value) {
        this.metadata = value;
    }

    @JsonProperty("mode")
    public String getMode() {
        return mode;
    }

    @JsonProperty("mode")
    public void setMode(String value) {
        this.mode = value;
    }

    @JsonProperty("serverUrl")
    public String getServerURL() {
        return serverURL;
    }

    @JsonProperty("serverUrl")
    public void setServerURL(String value) {
        this.serverURL = value;
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
