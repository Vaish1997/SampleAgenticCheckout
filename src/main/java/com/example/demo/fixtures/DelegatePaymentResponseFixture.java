package com.example.demo.fixtures;

import com.example.demo.model.checkoutsession.CheckoutCompleteResponse;
import com.example.demo.model.checkoutsession.ImmutableItemInformation;
import com.example.demo.model.payment.DelegatePaymentResponse;
import com.example.demo.model.payment.ImmutableDelegatePaymentResponse;

public class DelegatePaymentResponseFixture {
    public static DelegatePaymentResponse getFullResponse()
    {
        return ImmutableDelegatePaymentResponse.builder()
                .paymentId(java.util.UUID.randomUUID())
                .build();
    }
}
