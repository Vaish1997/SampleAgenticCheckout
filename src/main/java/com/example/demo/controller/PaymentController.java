package com.example.demo.controller;

import com.example.demo.fixtures.DelegatePaymentResponseFixture;
import com.example.demo.model.payment.DelegatePaymentRequest;
import com.example.demo.model.payment.DelegatePaymentResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController
{
    @PostMapping
    public ResponseEntity<DelegatePaymentResponse> delegatePayment(
            @RequestBody DelegatePaymentRequest delegatePaymentRequest) {

        DelegatePaymentResponse response = DelegatePaymentResponseFixture.getFullResponse();

        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

}
