package com.example.springpaymentapiexample;

import com.lyra.rest.client.Client;
import com.lyra.rest.client.ClientResource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@RestController
public class PaymentController {
    @PostMapping("/createPayment")
    public PaymentResponse post(@RequestBody PaymentRequest request) throws IOException {
        final Map<String, Object> parameters = new HashMap<>();
        parameters.put("amount", request.getAmount());
        parameters.put("currency", request.getCurrency());
        final String response = Client.post(ClientResource.CREATE_PAYMENT.toString(), parameters);
        return PaymentResponseConverter.fromJsonString(response);
    }

    @PostMapping("/verifyResult")
    public Map<String, Boolean> verifyResult(@RequestBody PaymentVerificationRequest request) {
        final Map<String, Object> parameters = new HashMap<>();
        parameters.put("kr-answer", request.getKrAnswer());
        parameters.put("kr-hash-algorithm", request.getKrHashAlgorithm());
        parameters.put("kr-hash", request.getKrHash());
        boolean isValid = Client.verifyAnswer(parameters);
        final Map<String, Boolean> response = new HashMap<>();
        response.put("value", isValid);
        return response;
    }
}
