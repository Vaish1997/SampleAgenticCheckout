package com.example.demo.model.payment;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@Value.Modifiable
@Value.Style(create = "new")
@JsonDeserialize(as = ImmutableCreditCardDataRequest.class)
public interface CreditCardDataRequest {
    String getNameOnCard();

    String getToken();
    String getExpiration();
    String getCvv();

}
