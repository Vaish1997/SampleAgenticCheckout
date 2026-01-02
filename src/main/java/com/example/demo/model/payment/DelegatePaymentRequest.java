package com.example.demo.model.payment;

import com.example.demo.model.checkoutsession.ImmutableShipToAddress;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@Value.Modifiable
@Value.Style(create = "new")
@JsonDeserialize(as = ImmutableDelegatePaymentRequest.class)
public interface DelegatePaymentRequest {
    CreditCardDataRequest creditCardData();
}
